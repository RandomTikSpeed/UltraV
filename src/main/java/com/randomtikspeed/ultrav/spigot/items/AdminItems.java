package com.randomtikspeed.ultrav.spigot.items;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AdminItems implements InventoryHolder {
    private UltraV uv;
    private Inventory inv;
    private CoreMessages cm;

    public AdminItems(UltraV uv)
    {
        this.uv = uv;
        cm = uv.getCore().getMessageManager().getCoreMessages();
    }
    // Item creation template
    private ItemStack createItem(@NotNull TextComponent name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(name));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    // Admin Custom Items
    public AdminItems() {
        inv = Bukkit.createInventory(this, 27, String.valueOf(Component.text("Ultra V Admin Items")));
        nullItem();
    }

    // Null Item
    private void nullItem() {
        ItemStack item;
        List<String> lore = new ArrayList<>();
        lore.add(cm.Colour("&6 "));
        item = createItem(Component.text(""), Material.GRAY_STAINED_GLASS_PANE, lore);
        for (int i = 0; i < 27; i++) {
            inv.setItem(i, item);
        }
    }





    @Override
    public Inventory getInventory() {
        return inv;
    }
}
