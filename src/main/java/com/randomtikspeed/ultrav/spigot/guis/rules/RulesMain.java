package com.randomtikspeed.ultrav.spigot.guis.rules;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class RulesMain implements InventoryHolder {
    private UltraV uv;
    private Inventory inv;
    private RulesItems ri;

    public RulesMain(UltraV uv)
    {
        this.uv = uv;
        ri = uv.getCore().getGuiManager().getRi();
    }

    public void setItems() {
        inv = Bukkit.createInventory(this, 36, String.valueOf(Component.text("Rules")));
        for (int i = 0; i < 36; i++) inv.setItem(i, ri.nullItem);
        inv.setItem(31, ri.close);
        inv.setItem(12, ri.mcRules);
        inv.setItem(14, ri.dcRules);
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
