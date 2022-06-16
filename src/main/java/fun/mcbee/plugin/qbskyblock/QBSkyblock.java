package fun.mcbee.plugin.qbskyblock;

import fun.mcbee.plugin.qbskyblock.BlockRelace.BlockBreakListener;
import fun.mcbee.plugin.qbskyblock.Items.ItemManager;
import fun.mcbee.plugin.qbskyblock.TablistandScoreBoard.ScoreBoardSystem;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class QBSkyblock extends JavaPlugin {
    private static volatile QBSkyblock instance;


    /**
     * Returns the instance of {@link QBSkyblock}.
     * <p>
     * It is recommended to override this in your own {@link QBSkyblock}
     * implementation so you will get the instance of that, directly.
     *
     * @return this instance
     */
    public static QBSkyblock getInstance() {
        if (instance == null) {
            try {
                instance = JavaPlugin.getPlugin(QBSkyblock.class);

            } catch (final IllegalStateException ex) {
                if (Bukkit.getPluginManager().getPlugin("PlugMan") != null)
                    Bukkit.getLogger().severe("Failed to get instance of the plugin, if you reloaded using PlugMan you need to do a clean restart instead.");

                throw ex;
            }

            Objects.requireNonNull(instance, "Cannot get a new instance! Have you reloaded?");
        }

        return instance;
    }

    /**
     * Get if the instance that is used across the library has been set. Normally it
     * is always set, except for testing.
     *
     * @return if the instance has been set.
     */
    public static boolean hasInstance() {
        return instance != null;
    }
    @Override
    public void onLoad() {
        getInstance();


    }
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ScoreBoardSystem(), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreakListener(), this);
        ItemManager.init();


    }

    @Override
    public void onDisable() {}

    private void loadCommands() {
    }

}
