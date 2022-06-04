package com.randomtikspeed.ultrav.spigot.managers.storage;

import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.storage.config.core.CoreConfig;

public class ConfigManager implements IManager
{
    private final UltraV coreSpigot;
    private CoreConfig coreConfig;



    public ConfigManager(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
    }

    @Override
    public void OnLoad()
    {
        this.coreConfig = new CoreConfig(coreSpigot);
    }

    @Override
    public void OnEnable()
    {

    }

    @Override
    public void OnDisable()
    {

    }


    public void reloadConfigs()
    {
        this.coreConfig.reloadConfig();
    }

    public CoreConfig getCoreConfig()
    {
        return this.coreConfig;
    }
}
