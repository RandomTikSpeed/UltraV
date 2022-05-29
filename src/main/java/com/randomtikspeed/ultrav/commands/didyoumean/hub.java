package com.randomtikspeed.ultrav.commands.didyoumean;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class hub implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("hub")) {
            sender.sendMessage("Unknown command. Did you mean '/spawn'?");
            return true;
        }
        return true;
    }
}
