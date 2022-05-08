package com.randomtikspeed.ultrav.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class clearchat implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("clearchat") && player.hasPermission("ultrav.clearchat")) {
            for (int i = 0; i < 251; i++) {
                Bukkit.broadcast(Component.text(" "));
            }
            player.sendMessage("§6Cleared all player chats successfully");
        }
        return true;
    }
}
