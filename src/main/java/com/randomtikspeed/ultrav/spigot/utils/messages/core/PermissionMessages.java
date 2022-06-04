package com.randomtikspeed.ultrav.spigot.utils.messages.core;

import com.randomtikspeed.ultrav.core.enums.messages.MessageType;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessageFormats;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import org.bukkit.entity.Player;

public class PermissionMessages {
    private UltraV coreSpigot;
    private CoreMessages cm;
    private CoreMessageFormats cmf;

    public PermissionMessages(UltraV coreSpigot) {
        this.coreSpigot = coreSpigot;
        this.cm = coreSpigot.getCore().getMessageManager().getCoreMessages();
        this.cmf = coreSpigot.getCore().getMessageManager().getCoreMessageFormats();
    }

    public void noPermissions(Player player, String permission) {
        this.cmf.header(player, MessageType.ERROR);
        player.sendMessage(this.cm.Colour("&4You have insufficient permission to perform this command"));
        player.sendMessage(this.cm.Colour("&4You lack the permission &4&l&n-> &2" + permission));
        this.cmf.footer(player);
    }
}
