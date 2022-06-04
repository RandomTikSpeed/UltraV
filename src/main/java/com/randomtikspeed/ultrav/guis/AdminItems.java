package com.randomtikspeed.ultrav.guis;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class AdminItems implements InventoryHolder {
    private final Inventory inv;

    // Item creation template
    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    // Admin Custom Items
    public AdminItems() {
        inv = Bukkit.createInventory(this, 27, Component.text("Ultra V Admin Items"));
        nullItem();
    }

    // Null Item
    private void nullItem() {
        ItemStack item;
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text(""));
        item = createItem(Component.text(""), Material.GRAY_STAINED_GLASS_PANE, lore);
        for (int i = 0; i < 27; i++) {
            inv.setItem(i, item);
        }
    }





    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
