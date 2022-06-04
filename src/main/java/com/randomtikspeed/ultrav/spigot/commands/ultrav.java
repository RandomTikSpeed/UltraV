package com.randomtikspeed.ultrav.spigot.commands;

import com.randomtikspeed.ultrav.spigot.guis.AdminMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ultrav implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("ultrav") && player.hasPermission("ultrav.admin")) {
            if (args.length == 0) {
                AdminMain gui = new AdminMain();
                player.openInventory(gui.getInventory());
                return true;
            } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("about")) {
                player.sendMessage("§7Check out the plugin's wiki page: §6github.com/RandomTikSpeed/UltraV/wiki");
            }
            }
        }
        return true;
    }
}
