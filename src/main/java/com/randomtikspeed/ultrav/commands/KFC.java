package com.randomtikspeed.ultrav.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KFC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("KFC")) {
            if (player.getName().equals("ShadowRexYT")) {
                ItemStack item = new ItemStack(Material.COOKED_CHICKEN, 1);
                player.getInventory().addItem(item);
                player.sendMessage("§6Did someone say §6§lKFC?");
            } else {
                player.sendMessage("§7[§cError§7] §7This command can only be executed by §6ShadowRexYT§7!");
            }
        }

        return true;
    }
}
