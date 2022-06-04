package com.randomtikspeed.ultrav.spigot.managers.placeholdes;

import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.placeholders.AdventureAPI;
import com.randomtikspeed.ultrav.spigot.UltraV;

public class PlaceholderManager implements IManager
{
    private final UltraV coreSpigot;

    private AdventureAPI adventureAPI;

    public PlaceholderManager(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
    }

    @Override
    public void OnLoad()
    {
        adventureAPI = new AdventureAPI(coreSpigot);
    }

    @Override
    public void OnEnable()
    {
        getAdventureAPI().Init();
    }

    @Override
    public void OnDisable()
    {

    }

    public AdventureAPI getAdventureAPI()
    {
        return adventureAPI;
    }
}
