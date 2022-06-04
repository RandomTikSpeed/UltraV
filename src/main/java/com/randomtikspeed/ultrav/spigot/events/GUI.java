package com.randomtikspeed.ultrav.spigot.events;

import com.randomtikspeed.ultrav.spigot.guis.AdminMain;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.jetbrains.annotations.NotNull;

public class GUI implements Listener {

    @EventHandler
    public void onClick(@NotNull InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {return;}
        if (e.getClickedInventory().getHolder() instanceof AdminMain) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {return;}
            if (e.getCurrentItem().getType() == Material.GRAY_STAINED_GLASS_PANE) {
                player.sendMessage("NullTest");
                player.closeInventory();
            }
        }
    }
}
