package com.randomtikspeed.ultrav.guis;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AdminMain implements InventoryHolder {

        private final Inventory inv;

        public AdminMain() {
            inv = Bukkit.createInventory(this, 27, Component.text("UVQ Admin Panel"));
            init();
        }

        private void init() {
            // Gray Stained Glass Pane
            ItemStack item;
            List<Component> lore = new ArrayList<>();
            lore.add(Component.text(""));
            item = createItem(Component.text(""), Material.GRAY_STAINED_GLASS_PANE, lore);
            for (int i = 0; i < 27; i++) {
                inv.setItem(i, item);
            }


        }

    private ItemStack createItem(Component name, Material mat, List<Component> lore) {
            ItemStack item = new ItemStack(mat, 1);
            ItemMeta meta = item.getItemMeta();
            meta.displayName(name);
            meta.lore(lore);
            item.setItemMeta(meta);
            return item;
        }

    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
