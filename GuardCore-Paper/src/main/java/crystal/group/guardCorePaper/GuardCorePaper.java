package crystal.group.guardCorePaper;

import crystal.group.guardCorePaper.managers.PlayerDataManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class GuardCorePaper extends JavaPlugin {

    private PlayerDataManager playerDataManager;
    private static GuardCorePaper instance;
    @Override
    public void onEnable() {
        instance = this;
        playerDataManager = new PlayerDataManager();

        loadConfig();
        registerListeners();
        registerCommands();

        getLogger().info("GuardCore enabled.");
    }
    public PlayerDataManager getPlayerDataManager() {
        return playerDataManager;
    }
    @Override
    public void onDisable() {
        instance = null;
        getLogger().info("GuardCore disabled.");
    }
    private void loadConfig() {
        saveDefaultConfig();
    }

    private void registerListeners() {

    }

    private void registerCommands() {

    }

    public static GuardCorePaper getInstance() {
        return instance;
    }
}
