package fun.mcbee.plugin.qbskyblock.GameSettings;

import fun.mcbee.plugin.qbskyblock.Items.ItemManager;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HeadsSettings implements Listener {
    @EventHandler
    public void CustomHeads(BlockPlaceEvent e){
        if(e.getBlock().getType() == ItemManager.WheatBag.getType()){
            e.setCancelled(true);
        }

    }
}
