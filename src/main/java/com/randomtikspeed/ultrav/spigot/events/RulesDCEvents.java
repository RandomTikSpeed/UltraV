package com.randomtikspeed.ultrav.spigot.events;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesDC;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesMain;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class RulesDCEvents implements Listener {
    private UltraV instance;
    public RulesDCEvents(UltraV instance) {
        this.instance = instance;
    }
    @EventHandler
    public void rulesDCEvents(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {return;}
        if (e.getClickedInventory().getHolder() instanceof RulesDC) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {return;}
            // Go Back
            if (e.getCurrentItem().getType() == Material.BARRIER) {
                player.closeInventory();
                RulesMain gui = new RulesMain(instance);
                player.openInventory(gui.getInventory());
            }
            if (e.getSlot() == 23 && e.getClick().isRightClick()) {
                player.closeInventory();
                player.sendMessage("§7Discord's TOS: §6discord.com/terms");
            }
        }

    }
}
