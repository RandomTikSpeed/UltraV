package com.randomtikspeed.ultrav.commands;

import com.randomtikspeed.ultrav.guis.AdminMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UltraV implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        if (command.getName().equalsIgnoreCase("UltraV") && player.hasPermission("UltraV.admin")) {
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
