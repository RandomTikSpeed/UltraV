package com.randomtikspeed.ultrav.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("ClearChat") && player.hasPermission("UltraV.admin")) {
            for (int i = 0; i < 251; i++) {
                Bukkit.broadcast(" "));
            }
            player.sendMessage("§6Cleared all player chats successfully");
        }
        return true;
    }
}
