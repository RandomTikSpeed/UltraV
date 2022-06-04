package com.randomtikspeed.ultrav.spigot.utils.messages.core;


import com.randomtikspeed.ultrav.core.enums.messages.MessageType;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessageFormats;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SenderMessages {
    private UltraV coreSpigot;
    private CoreMessages cm;
    private CoreMessageFormats cmf;

    public SenderMessages(UltraV coreSpigot) {
        this.coreSpigot = coreSpigot;
        this.cm = coreSpigot.getCore().getMessageManager().getCoreMessages();
        this.cmf = coreSpigot.getCore().getMessageManager().getCoreMessageFormats();
    }

    public void onlyConsole(Player player) {
        this.cmf.header(player, MessageType.ERROR);
        player.sendMessage(this.cm.Colour("&4You have executed a Console Only Command"));
        this.cmf.footer(player);
    }

    public void onlyPlayer(ConsoleCommandSender console) {
        this.cmf.header(console, MessageType.ERROR);
        console.sendMessage(this.cm.Colour("&4You have executed a Player Only Command"));
        this.cmf.footer(console);
    }

    public void notEnoughArgs(Player player, String usage) {
        this.cmf.header(player, MessageType.ERROR);
        player.sendMessage(this.cm.Colour("&4You have not entered enough arguments"));
        player.sendMessage(this.cm.Colour("&4USAGE: &c" + usage));
        this.cmf.footer(player);
    }

    public void tooManyArgs(Player player, String usage) {
        this.cmf.header(player, MessageType.ERROR);
        player.sendMessage(this.cm.Colour("&4You have entered too many arguments"));
        player.sendMessage(this.cm.Colour("&4USAGE: &c" + usage));
        this.cmf.footer(player);
    }
}
