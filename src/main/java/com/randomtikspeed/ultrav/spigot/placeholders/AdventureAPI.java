package com.randomtikspeed.ultrav.spigot.placeholders;

import com.randomtikspeed.ultrav.core.interfaces.core.IHook;
import com.randomtikspeed.ultrav.spigot.UltraV;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.jetbrains.annotations.NotNull;

public class AdventureAPI implements IHook
{
    private final UltraV coreSpigot;

    private BukkitAudiences adventure;


    public AdventureAPI(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
    }

    @Override
    public void Init()
    {
        this.adventure = BukkitAudiences.create(coreSpigot);
    }

    @Override
    public void Placeholders()
    {

    }

    public @NotNull BukkitAudiences getAdventure()
    {
        if (adventure == null)
        {
            throw new IllegalStateException("Tried to Access Adventure");
        }
        return adventure;
    }
}
