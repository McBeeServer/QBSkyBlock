package fun.mcbee.plugin.qbskyblock.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack WheatBag;

    public static void init(){
        createWheatBag();

    }

    private static void createWheatBag(){
        ItemStack wheatbag = new ItemStack(Material.STICK, 1);
        ItemMeta wheatbagmeta = wheatbag.getItemMeta();
        wheatbagmeta.setDisplayName("§6Wheat Bag");
        List<String> lore = new ArrayList<>();
        lore.add("§7This is a wheat bag");
        wheatbagmeta.setLore(lore);
        wheatbagmeta.addEnchant(Enchantment.DURABILITY, 1, false);
        wheatbagmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wheatbag.setItemMeta(wheatbagmeta);
        WheatBag = wheatbag;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("wheatbag"), wheatbag);
        sr.shape("  S",
                "  S",
                "  S");
        sr.setIngredient('S', Material.WHEAT);
        Bukkit.getServer().addRecipe(sr);
    }
}
