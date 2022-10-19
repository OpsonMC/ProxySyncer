package net.opsonmc;

import com.google.common.reflect.TypeToken;
import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import com.velocitypowered.api.proxy.server.ServerInfo;
import dev.agones.models.TheStatusValuesForTheGameServer;
import dev.agones.models.V1GameServer;
import dev.agones.models.V1GameServerSpecTemplateSpecPorts;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Watch;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Logger;

@Plugin(id = "proxysyncer", name = "ProxySyncer", version = "1.0", description = "OpsonMC proxy syncer", authors = {"Opson"})
public class ProxySyncer {
    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public ProxySyncer(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;

        logger.info("Hello there! I made my first plugin with Velocity.");
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        server.getScheduler()
                .buildTask(this, () -> {
                    try {
                        ApiClient client = Config.fromCluster();
                        Configuration.setDefaultApiClient(client);

                        CustomObjectsApi customObjectsApi = new CustomObjectsApi(client);
                        Watch<V1GameServer> watch =
                                Watch.createWatch(
                                        client,
                                        customObjectsApi.listClusterCustomObjectCall(
                                                "agones.dev",
                                                "v1",
                                                "gameservers",
                                                null,
                                                true,
                                                null,
                                                null,
                                                null,
                                                100,
                                                null,
                                                null,
                                                null,
                                                true,
                                                null),
                                        new TypeToken<Watch.Response<V1GameServer>>() {
                                        }.getType());

                        for (Watch.Response<V1GameServer> item : watch) {
                            TheStatusValuesForTheGameServer status = item.object.getStatus();
                            if (status == null) {
                                continue;
                            }

                            if (!status.getState().equals(TheStatusValuesForTheGameServer.StateEnum.READY) && !status.getState().equals(TheStatusValuesForTheGameServer.StateEnum.SHUTDOWN)) {
                                continue;
                            }

                            ArrayList<V1GameServerSpecTemplateSpecPorts> ports = item.object.getSpec().getPorts();
                            Optional<V1GameServerSpecTemplateSpecPorts> gamePort = ports.stream().filter(p -> p.getName().equals("game")).findFirst();
                            if (gamePort.isEmpty()) {
                                logger.warning("Tried to register gameserver without game port");
                                return;
                            }

                            int port = gamePort.get().getHostPort();

                            if (port == 25565 || port == 25566) {
                                logger.info("Discovered itself or lobby, skipping");
                                continue;
                            }

                            if(status.getState().equals(TheStatusValuesForTheGameServer.StateEnum.SHUTDOWN)) {
                                Optional<RegisteredServer> removedServer = server.getServer(item.object.getMetadata().getName());
                                if(removedServer.isEmpty()){
                                    continue;
                                }
                                server.unregisterServer(removedServer.get().getServerInfo());
                                continue;
                            }

                            InetSocketAddress socketAddress = new InetSocketAddress(status.getAddress(), port);
                            ServerInfo newServer = new ServerInfo(item.object.getMetadata().getName(), socketAddress);

                            System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
                            System.out.println("ADDD: " + status.getAddress() + ":" + port);
                            server.registerServer(newServer);
                        }
                    } catch (ApiException | IOException e) {
                        e.printStackTrace();
                        throw new RuntimeException(e);
                    }
                })
                .schedule();
    }
}
