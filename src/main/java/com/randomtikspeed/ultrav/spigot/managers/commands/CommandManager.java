package com.randomtikspeed.ultrav.spigot.managers.commands;


import co.aikar.commands.BukkitCommandManager;
import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.commands.ClearChat;

public class CommandManager implements IManager
{
    private final UltraV coreSpigot;
    private BukkitCommandManager commandManager;

    public CommandManager(UltraV coreSpigot)
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
        commandManager = new BukkitCommandManager(coreSpigot);
        commandManager.enableUnstableAPI("help");

        commandManager.registerCommand(new ClearChat(coreSpigot));
    }

    @Override
    public void OnDisable()
    {

    }

    public BukkitCommandManager getCommandManager() {
        return commandManager;
    }
}
