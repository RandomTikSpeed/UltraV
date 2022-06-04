package com.randomtikspeed.ultrav.events;

import com.randomtikspeed.ultrav.guis.AdminMain;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class AdminMainEvents implements Listener {

    @EventHandler
    public void adminMainEvents(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {return;}
        if (e.getClickedInventory().getHolder() instanceof AdminMain) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {return;}
        }
    }
}
