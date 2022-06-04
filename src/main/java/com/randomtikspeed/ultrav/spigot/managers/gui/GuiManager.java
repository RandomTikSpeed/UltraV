package com.randomtikspeed.ultrav.spigot.managers.gui;


import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.items.RulesItems;

public class GuiManager implements IManager
{
    private final UltraV coreSpigot;
    private RulesItems ri;

    public GuiManager(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
    }

    @Override
    public void OnLoad()
    {
    }

    @Override
    public void OnEnable()
    {
        ri = new RulesItems(coreSpigot);
    }

    @Override
    public void OnDisable()
    {

    }

    public RulesItems getRi()
    {
        return ri;
    }
}
