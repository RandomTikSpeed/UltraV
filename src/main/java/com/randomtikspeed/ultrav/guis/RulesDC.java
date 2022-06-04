package com.randomtikspeed.ultrav.guis;

import com.randomtikspeed.ultrav.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class RulesDC implements InventoryHolder {
    private final Inventory inv;

    public RulesDC() {
        inv = Bukkit.createInventory(this, 36, Component.text("Discord Rules (/discord)"));
        for (int i = 0; i < 36; i++) inv.setItem(i, RulesItems.nullItem);
        inv.setItem(10, RulesItems.dcRule1);
        inv.setItem(11, RulesItems.dcRule2);
        inv.setItem(12, RulesItems.dcRule3);
        inv.setItem(13, RulesItems.dcRule4);
        inv.setItem(14, RulesItems.dcRule5);
        inv.setItem(15, RulesItems.dcRule6);
        inv.setItem(16, RulesItems.dcRule7);
        inv.setItem(21, RulesItems.dcRule8);
        inv.setItem(22, RulesItems.dcRule9);
        inv.setItem(23, RulesItems.dcRule10);
        inv.setItem(31, RulesItems.back);
    }



    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
