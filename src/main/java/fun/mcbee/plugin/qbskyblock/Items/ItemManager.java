package fun.mcbee.plugin.qbskyblock.Items;

import fun.mcbee.plugin.qbskyblock.QBSkyblock;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager{

    public static ItemStack WheatBag;

    public static void init(){
        createWheatBag();
    }

    private static void createWheatBag(){
        ItemStack wheatbag = QBSkyblock.getAPI().getItemHead("50930");
        ItemMeta wheatbagmeta = wheatbag.getItemMeta();
        wheatbagmeta.setDisplayName("§6Wheat Bag");
        List<String> lore = new ArrayList<>();
        lore.add("§7This is a wheat bag");
        wheatbagmeta.setLore(lore);
        wheatbagmeta.addEnchant(Enchantment.DURABILITY, 1, false);
        wheatbagmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wheatbag.setItemMeta(wheatbagmeta);
        WheatBag = wheatbag;

        ShapedRecipe sr = new ShapedRecipe(new NamespacedKey(QBSkyblock.getInstance(), "wheatbag"), wheatbag);
        sr.shape("   ",
                " SS",
                " SS");
        sr.setIngredient('S', Material.WHEAT);
        Bukkit.getServer().addRecipe(sr);
    }
}
