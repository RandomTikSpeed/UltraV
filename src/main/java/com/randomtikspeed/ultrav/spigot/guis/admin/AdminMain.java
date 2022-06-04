package com.randomtikspeed.ultrav.spigot.guis.admin;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
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
    private UltraV uv;
    private Inventory inv;
    private CoreMessages cm;

    public AdminMain(UltraV uv)
    {
        this.uv = uv;
        cm = uv.getCore().getMessageManager().getCoreMessages();
    }

    // Item creation template
    private @NotNull ItemStack createItem(Component name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(name));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

        // AdminMain
        public AdminMain() {
            inv = Bukkit.createInventory(this, 27, String.valueOf(Component.text("Ultra V Admin Panel")));
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
