package com.randomtikspeed.ultrav.events;

import com.randomtikspeed.ultrav.guis.AdminMain;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUI implements Listener {

    @EventHandler
    public boolean onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {return true;}
        if (e.getClickedInventory().getHolder() instanceof AdminMain) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {return true;}
            if (e.getCurrentItem().getType() == Material.GRAY_STAINED_GLASS_PANE) {
                player.sendMessage("NullTest");
                player.closeInventory();
            }
        }
        return true;
    }
}
