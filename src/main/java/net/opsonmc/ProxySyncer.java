package net.opsonmc;

import com.google.common.reflect.TypeToken;
import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import dev.agones.models.V1GameServer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Watch;
import org.checkerframework.checker.units.qual.C;

import java.util.concurrent.TimeUnit;
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
                System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        server.getScheduler()
                .buildTask(this, () -> {
                })
                .delay(2L, TimeUnit.SECONDS)
                .schedule();
    }
}
