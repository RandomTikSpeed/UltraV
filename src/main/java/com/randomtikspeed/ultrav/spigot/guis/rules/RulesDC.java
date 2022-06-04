package com.randomtikspeed.ultrav.spigot.guis.rules;

import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.items.RulesItems;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class RulesDC implements InventoryHolder {
    private UltraV uv;
    private Inventory inv;
    private RulesItems ri;

    public RulesDC(UltraV uv) 
    {
        this.uv = uv;
        ri = uv.getCore().getGuiManager().getRi();
    }
    
    public void setItems()
    {
        inv = Bukkit.createInventory(this, 36, String.valueOf(Component.text("Discord Rules (/discord)")));
        for (int i = 0; i < 36; i++) inv.setItem(i, ri.nullItem);
        inv.setItem(10, ri.dcRule1);
        inv.setItem(11, ri.dcRule2);
        inv.setItem(12, ri.dcRule3);
        inv.setItem(13, ri.dcRule4);
        inv.setItem(14, ri.dcRule5);
        inv.setItem(15, ri.dcRule6);
        inv.setItem(16, ri.dcRule7);
        inv.setItem(21, ri.dcRule8);
        inv.setItem(22, ri.dcRule9);
        inv.setItem(23, ri.dcRule10);
        inv.setItem(31, ri.back);
    }



    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
