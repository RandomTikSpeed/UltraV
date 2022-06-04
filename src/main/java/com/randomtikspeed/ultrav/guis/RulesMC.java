package com.randomtikspeed.ultrav.guis;

import com.randomtikspeed.ultrav.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class RulesMC implements InventoryHolder {
    private final Inventory inv;

    public RulesMC() {
        inv = Bukkit.createInventory(this, 36, Component.text("Minecraft Rules"));
        for (int i = 0; i < 36; i++) inv.setItem(i, RulesItems.nullItem);
        inv.setItem(10, RulesItems.mcRule1);
        inv.setItem(11, RulesItems.mcRule2);
        inv.setItem(12, RulesItems.mcRule3);
        inv.setItem(14, RulesItems.mcRule4);
        inv.setItem(15, RulesItems.mcRule5);
        inv.setItem(16, RulesItems.mcRule6);
        inv.setItem(31, RulesItems.back);

    }



    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
