package com.randomtikspeed.ultrav.spigot.managers.commands;


import co.aikar.commands.BukkitCommandManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.commands.*;
import com.randomtikspeed.ultrav.spigot.commands.didyoumean.Hub;

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
        commandManager.registerCommand(new Hub(coreSpigot));
        commandManager.registerCommand(new KFC(coreSpigot));
        commandManager.registerCommand(new Rules(coreSpigot));
        commandManager.registerCommand(new Start(coreSpigot));
        commandManager.registerCommand(new Store(coreSpigot));
        commandManager.registerCommand(new Admin(coreSpigot));
    }

    @Override
    public void OnDisable()
    {

    }

    public BukkitCommandManager getCommandManager() {
        return commandManager;
    }
}
