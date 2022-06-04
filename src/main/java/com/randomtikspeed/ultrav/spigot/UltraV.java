package com.randomtikspeed.ultrav.spigot;

import com.randomtikspeed.ultrav.spigot.commands.*;
import com.randomtikspeed.ultrav.spigot.commands.didyoumean.hub;
import com.randomtikspeed.ultrav.spigot.events.AdminMainEvents;
import com.randomtikspeed.ultrav.spigot.events.RulesDCEvents;
import com.randomtikspeed.ultrav.spigot.events.RulesMCEvents;
import com.randomtikspeed.ultrav.spigot.events.RulesMainEvents;
import com.randomtikspeed.ultrav.spigot.items.RulesItems;
import com.randomtikspeed.ultrav.spigot.managers.core.CoreManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class UltraV extends JavaPlugin {
    private UltraV instance;

    private CoreManager core;

    @Override
    public void onLoad()
    {
        instance = this;
        core = new CoreManager(this);
        core.OnLoad();
    }

    @Override
    public void onEnable()
    {
        core.OnEnable();
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
        core.OnDisable();

    }

    public UltraV getInstance() {
        return instance;
    }

    public CoreManager getCore() {
        return core;
    }
}
