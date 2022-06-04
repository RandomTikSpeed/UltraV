package com.randomtikspeed.ultrav.spigot.utils.messages;

import java.util.logging.Level;

import com.randomtikspeed.ultrav.core.enums.messages.MessageType;
import com.randomtikspeed.ultrav.spigot.UltraV;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class CoreMessageFormats {
    private UltraV coreSpigot;
    private CoreMessages coreMessages;

    public CoreMessageFormats(UltraV coreSpigot) {
        this.coreSpigot = coreSpigot;
        this.coreMessages = coreSpigot.getCore().getMessageManager().getCoreMessages();
    }

    public void header(Player player, MessageType state) {
        player.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m---------&8&l[  &8&l&m]---------&8&l>"));
        player.sendMessage(this.coreMessages.Colour("&8 "));
        if (state == MessageType.INFO) {
            player.sendMessage(this.coreMessages.Colour(this.coreMessages.infoText));
            player.sendMessage(this.coreMessages.Colour("&8 "));
            player.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.ERROR) {
            player.sendMessage(this.coreMessages.Colour(this.coreMessages.errorText));
            player.sendMessage(this.coreMessages.Colour("&8 "));
            player.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.WARN) {
            player.sendMessage(this.coreMessages.Colour(this.coreMessages.warnText));
            player.sendMessage(this.coreMessages.Colour("&8 "));
            player.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.SEVERE) {
            player.sendMessage(this.coreMessages.Colour(this.coreMessages.severeText));
            player.sendMessage(this.coreMessages.Colour("&8 "));
            player.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        }

    }

    public void header(ConsoleCommandSender console, MessageType state) {
        console.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m---------&8&l[  &8&l&m]---------&8&l>"));
        console.sendMessage(this.coreMessages.Colour("&8 "));
        if (state == MessageType.INFO) {
            console.sendMessage(this.coreMessages.Colour(this.coreMessages.infoText));
            console.sendMessage(this.coreMessages.Colour("&8 "));
            console.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.ERROR) {
            console.sendMessage(this.coreMessages.Colour(this.coreMessages.errorText));
            console.sendMessage(this.coreMessages.Colour("&8 "));
            console.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.WARN) {
            console.sendMessage(this.coreMessages.Colour(this.coreMessages.warnText));
            console.sendMessage(this.coreMessages.Colour("&8 "));
            console.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.SEVERE) {
            console.sendMessage(this.coreMessages.Colour(this.coreMessages.severeText));
            console.sendMessage(this.coreMessages.Colour("&8 "));
            console.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        }

    }

    public void header(MessageType state) {
        if (state == MessageType.INFO) {
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour(this.coreMessages.infoText));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8 "));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.ERROR) {
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour(this.coreMessages.errorText));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8 "));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.WARN) {
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour(this.coreMessages.warnText));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8 "));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        } else if (state == MessageType.SEVERE) {
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour(this.coreMessages.severeText));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8 "));
            Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
        }

    }

    public void footer(Player player) {
        player.sendMessage(this.coreMessages.Colour("&8 "));
        player.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
    }

    public void footer(ConsoleCommandSender console) {
        console.sendMessage(this.coreMessages.Colour("&8 "));
        console.sendMessage(this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
    }

    public void footer() {
        Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8 "));
        Bukkit.getLogger().log(Level.FINE, this.coreMessages.Colour("&8&l<&8&l&m----------------------------------&8&l>"));
    }
}
