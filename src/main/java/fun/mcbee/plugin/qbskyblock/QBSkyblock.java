package fun.mcbee.plugin.qbskyblock;

import fun.mcbee.plugin.qbskyblock.BlockRelace.BlockBreakListener;
import fun.mcbee.plugin.qbskyblock.GameSettings.HeadsSettings;
import fun.mcbee.plugin.qbskyblock.Items.ItemManager;
import fun.mcbee.plugin.qbskyblock.TablistandScoreBoard.ScoreBoardSystem;
import me.arcaniax.hdb.api.DatabaseLoadEvent;
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class QBSkyblock extends JavaPlugin implements Listener {

    private static QBSkyblock instance;
    private static HeadDatabaseAPI api;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new ScoreBoardSystem(), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreakListener(), this);
        Bukkit.getPluginManager().registerEvents(new HeadsSettings(), this);


    }

    public static QBSkyblock getInstance() {
        return instance;

    }

    public static HeadDatabaseAPI getAPI() {
        return api;
    }

    @Override
    public void onDisable() {}

    @EventHandler
    public void onDatabaseLoad(DatabaseLoadEvent e){
        api = new HeadDatabaseAPI();
        ItemManager.init();
    }

}
