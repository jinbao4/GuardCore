package crystal.group.guardCorePaper.managers;

import crystal.group.guardCorePaper.data.PlayerData;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerDataManager {

    private final Map<UUID, PlayerData> playerDataMap = new HashMap<>();

    public void addPlayer(Player player) {
        playerDataMap.put(player.getUniqueId(), new PlayerData(player));
    }

    public void removePlayer(Player player) {
        playerDataMap.remove(player.getUniqueId());
    }

    public PlayerData getPlayerData(Player player) {
        return playerDataMap.get(player.getUniqueId());
    }

    public boolean hasPlayerData(Player player) {
        return playerDataMap.containsKey(player.getUniqueId());
    }

    public Map<UUID, PlayerData> getAllPlayerData() {
        return playerDataMap;
    }
}