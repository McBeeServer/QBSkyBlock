package fun.mcbee.plugin.qbskyblock.BlockRelace;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Arrays;
import java.util.List;

import static fun.mcbee.plugin.qbskyblock.BlockRelace.BlockReplacementEngine.checkBlockReplace;

public class BlockBreakListener implements Listener {
    List<String> resourceWorlds = Arrays.asList("farm_world", "desert_world", "island_world", "skyblock_world", "world", "lobby");

    @EventHandler
    public void onResourceWorlds(BlockBreakEvent e) {

        if (e.getPlayer().getGameMode() == GameMode.CREATIVE) return;

        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.IRON_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.IRON_ORE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.EMERALD_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.EMERALD_ORE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.GOLD_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.GOLD_ORE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.LAPIS_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.LAPIS_ORE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.DIAMOND_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.DIAMOND_ORE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.NETHER_QUARTZ_ORE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.NETHER_QUARTZ_ORE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_PICKAXE,
                e.getBlock().getType() == Material.STONE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.STONE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.STONE_PICKAXE,
                e.getBlock().getType() == Material.STONE && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.ENTITY_EXPERIENCE_ORB_PICKUP,
                300,
                Material.COBBLESTONE,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.OAK_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.OAK_LOG,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.OAK_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.OAK_WOOD,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.DARK_OAK_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.DARK_OAK_LOG,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.DARK_OAK_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.DARK_OAK_WOOD,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.BIRCH_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.BIRCH_LOG,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.BIRCH_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.BIRCH_WOOD,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.JUNGLE_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.JUNGLE_LOG,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.JUNGLE_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.JUNGLE_WOOD,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.SPRUCE_LOG && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.SPRUCE_LOG,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.IRON_AXE,
                e.getBlock().getType() == Material.SPRUCE_WOOD && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.UI_LOOM_TAKE_RESULT,
                300,
                Material.SPRUCE_WOOD,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.STONE_AXE,
                e.getBlock().getType() == Material.MUSHROOM_STEM && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.BEDROCK,
                Sound.BLOCK_AZALEA_FALL,
                300,
                Material.MUSHROOM_STEM,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.STONE_AXE,
                e.getBlock().getType() == Material.MUSHROOM_STEW && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.AIR,
                Sound.BLOCK_AZALEA_FALL,
                300,
                Material.MUSHROOM_STEW,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.STONE_AXE,
                e.getBlock().getType() == Material.BROWN_MUSHROOM_BLOCK && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.AIR,
                Sound.BLOCK_AZALEA_FALL,
                300,
                Material.BROWN_MUSHROOM_BLOCK,
                null,
                null
        );
        checkBlockReplace(
                e,
                Material.STONE_AXE,
                e.getBlock().getType() == Material.RED_MUSHROOM_BLOCK && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                Material.AIR,
                Sound.BLOCK_AZALEA_FALL,
                300,
                Material.RED_MUSHROOM_BLOCK,
                null,
                null
        );


        checkBlockReplace(
                e,
                Material.AIR,
                e.getBlock().getType() == Material.WHEAT && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                null,
                Sound.BLOCK_AMETHYST_BLOCK_BREAK,
                120,
                Material.WHEAT,
                e.getBlock().getBlockData(),
                Arrays.asList(Material.AIR, Material.WHEAT)
        );
        checkBlockReplace(
                e,
                Material.AIR,
                e.getBlock().getType() == Material.POTATOES && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                null,
                Sound.BLOCK_AMETHYST_BLOCK_BREAK,
                120,
                Material.AIR,
                e.getBlock().getBlockData(),
                Arrays.asList(Material.AIR, Material.POTATOES)
        );
        checkBlockReplace(
                e,
                Material.AIR,
                e.getBlock().getType() == Material.BEETROOTS && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                null,
                Sound.BLOCK_AMETHYST_BLOCK_BREAK,
                120,
                Material.AIR,
                e.getBlock().getBlockData(),
                Arrays.asList(Material.AIR, Material.BEETROOTS)
        );
        checkBlockReplace(
                e,
                Material.AIR,
                e.getBlock().getType() == Material.CARROTS && resourceWorlds.contains(e.getBlock().getWorld().getName()),
                true,
                null,
                Sound.BLOCK_AMETHYST_BLOCK_BREAK,
                120,
                Material.AIR,
                e.getBlock().getBlockData(),
                Arrays.asList(Material.AIR, Material.CARROTS)
        );
    }
}