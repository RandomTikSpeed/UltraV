package com.randomtikspeed.ultrav.spigot.events;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesMC;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesMain;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class RulesMCEvents implements Listener {
    private UltraV instance;
    public RulesMCEvents(UltraV instance) {
        this.instance = instance;
    }
    @EventHandler
    public void rulesMCEvents(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {return;}
        if (e.getClickedInventory().getHolder() instanceof RulesMC) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {return;}
            // Go Back
            if (e.getCurrentItem().getType() == Material.BARRIER) {
                player.closeInventory();
                RulesMain gui = new RulesMain(instance);
                player.openInventory(gui.getInventory());
            }
        }

    }
}
