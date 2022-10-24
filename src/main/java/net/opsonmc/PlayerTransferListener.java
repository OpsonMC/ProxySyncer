package net.opsonmc;

import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import redis.clients.jedis.JedisPubSub;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

public class PlayerTransferListener extends JedisPubSub {
    private final ProxyServer proxy;
    private final Logger logger;

    public PlayerTransferListener(ProxyServer proxy, Logger logger) {
        super();
        this.proxy = proxy;
        this.logger = logger;
    }

    public void onMessage(String channel, String message) {
        if (!channel.equals("player_transfers")) {
            return;
        }

        String[] parts = message.split(":");
        String playerUUID = parts[0];
        String serverName = parts[1];

        Optional<Player> optionalPlayer = proxy.getPlayer(UUID.fromString(playerUUID));
        if (optionalPlayer.isEmpty()) {
            logger.warning("Could not find player with UUID " + playerUUID);
            return;
        }

        Player player = optionalPlayer.get();

        if (serverName.equals("lobby")) {
            Optional<RegisteredServer> optionalMainLobby = proxy.getServer("main_lobby");
            // Should never happen
            if (optionalMainLobby.isEmpty()) {
                return;
            }

            RegisteredServer mainLobby = optionalMainLobby.get();

            List<RegisteredServer> lobbyServers = proxy.getAllServers().stream().filter(s -> s.getServerInfo().getName().startsWith("lobby")).toList();

            if (mainLobby.getPlayersConnected().size() <= 70 || lobbyServers.size() == 0) {
                player.createConnectionRequest(mainLobby).fireAndForget();
                return;
            }

            RegisteredServer selectedLobby = lobbyServers
                    .stream()
                    .sorted(Comparator.comparingInt(s -> s.getPlayersConnected().size()))
                    .toList()
                    .get(lobbyServers.size() - 1);
            player.createConnectionRequest(selectedLobby).fireAndForget();
            return;
        }

        Optional<RegisteredServer> optionalServer = proxy.getServer(serverName);
        if (optionalServer.isEmpty()) {
            logger.warning("Could not find server with name " + serverName);
            return;
        }

        RegisteredServer server = optionalServer.get();
        player.createConnectionRequest(server).fireAndForget();

    }
}
