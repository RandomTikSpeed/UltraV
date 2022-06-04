package com.randomtikspeed.ultrav.spigot.managers.messages;


import com.randomtikspeed.ultrav.core.interfaces.core.IManager;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessageFormats;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import com.randomtikspeed.ultrav.spigot.utils.messages.core.PermissionMessages;
import com.randomtikspeed.ultrav.spigot.utils.messages.core.SenderMessages;

public class MessageManager implements IManager
{
    private final UltraV coreSpigot;
    private CoreMessages coreMessages;
    private CoreMessageFormats coreMessageFormats;
    private PermissionMessages permissionsMessages;
    private SenderMessages senderMessages;


    public MessageManager(UltraV coreSpigot)
    {
        this.coreSpigot = coreSpigot;
    }

    @Override
    public void OnLoad()
    {
        coreMessages = new CoreMessages(coreSpigot);
        coreMessageFormats = new CoreMessageFormats(coreSpigot);
        permissionsMessages = new PermissionMessages(coreSpigot);
        senderMessages = new SenderMessages(coreSpigot);
    }

    @Override
    public void OnEnable()
    {

    }

    @Override
    public void OnDisable()
    {

    }

    public CoreMessages getCoreMessages() {
        return this.coreMessages;
    }

    public CoreMessageFormats getCoreMessageFormats() {
        return this.coreMessageFormats;
    }

    public PermissionMessages getPermissionsMessages() {
        return this.permissionsMessages;
    }

    public SenderMessages getSenderMessages() {
        return this.senderMessages;
    }

}
