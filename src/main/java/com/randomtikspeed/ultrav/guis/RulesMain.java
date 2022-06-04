package com.randomtikspeed.ultrav.guis;

import com.randomtikspeed.ultrav.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

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
