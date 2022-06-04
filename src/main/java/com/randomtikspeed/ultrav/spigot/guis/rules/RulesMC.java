package com.randomtikspeed.ultrav.spigot.guis.rules;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class RulesMC implements InventoryHolder {
    private UltraV uv;
    private Inventory inv;
    private RulesItems ri;

    public RulesMC(UltraV uv)
    {
        this.uv = uv;
        ri = uv.getCore().getGuiManager().getRi();
    }

    public void setItems() {
        inv = Bukkit.createInventory(this, 36, String.valueOf(Component.text("Minecraft Rules")));
        for (int i = 0; i < 36; i++) inv.setItem(i, ri.nullItem);
        inv.setItem(10, ri.mcRule1);
        inv.setItem(11, ri.mcRule2);
        inv.setItem(12, ri.mcRule3);
        inv.setItem(14, ri.mcRule4);
        inv.setItem(15, ri.mcRule5);
        inv.setItem(16, ri.mcRule6);
        inv.setItem(31, ri.back);
    }



    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
