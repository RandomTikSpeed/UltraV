package com.randomtikspeed.ultrav.commands.didyoumean;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class hub implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("hub")) {
            sender.sendMessage("Unknown command. Did you mean '/spawn'?");
            Bukkit.getServer().dispatchCommand(sender);
            return true;
        }
        return true;
    }
}
