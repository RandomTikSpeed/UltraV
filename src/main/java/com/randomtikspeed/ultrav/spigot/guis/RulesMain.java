package com.randomtikspeed.ultrav.spigot.guis;

import com.randomtikspeed.ultrav.spigot.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class RulesMain implements InventoryHolder {
    private final Inventory inv;

    public RulesMain() {
        inv = Bukkit.createInventory(this, 36, Component.text("Rules"));
        for (int i = 0; i < 36; i++) inv.setItem(i, RulesItems.nullItem);
        inv.setItem(31, RulesItems.close);
        inv.setItem(12, RulesItems.mcRules);
        inv.setItem(14, RulesItems.dcRules);
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
