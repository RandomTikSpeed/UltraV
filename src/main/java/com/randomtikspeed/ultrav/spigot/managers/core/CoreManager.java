package com.randomtikspeed.ultrav.spigot.managers.core;

import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.managers.commands.CommandManager;
import com.randomtikspeed.ultrav.spigot.managers.events.EventManager;
import com.randomtikspeed.ultrav.spigot.managers.gui.GuiManager;
import com.randomtikspeed.ultrav.spigot.managers.messages.MessageManager;
import com.randomtikspeed.ultrav.spigot.managers.placeholdes.PlaceholderManager;
import com.randomtikspeed.ultrav.spigot.managers.storage.ConfigManager;
import com.randomtikspeed.ultrav.spigot.managers.tasks.TaskManager;

public class CoreManager implements IManager
{
    private final UltraV coreSpigot;
    private MessageManager messageManager;
    private CommandManager commandManager;
    private EventManager eventManager;
    private PlaceholderManager placeholderManager;
    private TaskManager taskManager;
    private ConfigManager configManager;
    private GuiManager guiManager;


    public CoreManager(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
    }

    public void OnLoad()
    {
        configManager = new ConfigManager(coreSpigot);
        configManager.OnLoad();
        messageManager = new MessageManager(coreSpigot);
        messageManager.OnLoad();
        configManager = new ConfigManager(coreSpigot);
        configManager.OnLoad();
        commandManager = new CommandManager(coreSpigot);
        commandManager.OnLoad();
        eventManager = new EventManager(coreSpigot);
        eventManager.OnLoad();

        placeholderManager = new PlaceholderManager(coreSpigot);
        placeholderManager.OnLoad();
        taskManager = new TaskManager(coreSpigot);
        taskManager.OnLoad();
        guiManager = new GuiManager(coreSpigot);
        guiManager.OnLoad();
    }

    public void OnEnable()
    {
        configManager.OnEnable();
        messageManager.OnEnable();
        commandManager.OnEnable();
        eventManager.OnEnable();
        placeholderManager.OnEnable();
        taskManager.OnEnable();
        guiManager.OnEnable();

    }

    public void OnDisable()
    {
        configManager.OnDisable();
        messageManager.OnDisable();
        commandManager.OnDisable();
        eventManager.OnDisable();
        placeholderManager.OnDisable();
        taskManager.OnDisable();
        guiManager.OnDisable();

    }

    public MessageManager getMessageManager() {
        return messageManager;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public PlaceholderManager getPlaceholderManager() {
        return placeholderManager;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public GuiManager getGuiManager() {
        return guiManager;
    }
}
