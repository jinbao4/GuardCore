package crystal.group.guardCorePaper;

import org.bukkit.plugin.java.JavaPlugin;

public final class GuardCorePaper extends JavaPlugin {

    private static GuardCorePaper instance;
    @Override
    public void onEnable() {
        instance = this;

        loadConfig();
        registerListeners();
        registerCommands();

        getLogger().info("GuardCore enabled.");
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
