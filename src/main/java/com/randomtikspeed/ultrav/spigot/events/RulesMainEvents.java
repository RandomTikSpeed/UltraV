package com.randomtikspeed.ultrav.spigot.events;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesDC;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesMC;
import com.randomtikspeed.ultrav.spigot.guis.rules.RulesMain;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class RulesMainEvents implements Listener {
    private UltraV instance;
    public RulesMainEvents(UltraV instance) {
        this.instance = instance;
    }
    @EventHandler
    public void rulesMainEvents(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {return;}
        if (e.getClickedInventory().getHolder() instanceof RulesMain) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {return;}
            // Close
            if (e.getCurrentItem().getType() == Material.BARRIER) {
                player.closeInventory();
            }
            // Minecraft Rules
            if (e.getCurrentItem().getType() == Material.OAK_SAPLING) {
                player.closeInventory();
                RulesMC gui = new RulesMC(instance);
                player.openInventory(gui.getInventory());
            }
            // Discord Rules
            if (e.getCurrentItem().getType() == Material.LAPIS_LAZULI) {
                RulesDC gui = new RulesDC(instance);
                player.openInventory(gui.getInventory());
            }
        }
    }
}
