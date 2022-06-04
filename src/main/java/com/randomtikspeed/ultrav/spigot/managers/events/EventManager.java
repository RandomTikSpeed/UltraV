package com.randomtikspeed.ultrav.spigot.managers.events;

import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import org.bukkit.plugin.PluginManager;

public class EventManager implements IManager
{
    private final UltraV coreSpigot;
    private PluginManager pm;

    public EventManager(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
        pm = coreSpigot.getServer().getPluginManager();
    }

    @Override
    public void OnLoad()
    {
    }

    @Override
    public void OnEnable()
    {

    }

    @Override
    public void OnDisable()
    {

    }
}
