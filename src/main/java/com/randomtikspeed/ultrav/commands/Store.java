package com.randomtikspeed.ultrav.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Store implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("Store")) {
            sender.sendMessage("§7Visit our Store here: §6ultra-v.tebex.io");
        }
        return true;
    }
}
