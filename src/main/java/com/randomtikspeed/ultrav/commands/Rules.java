package com.randomtikspeed.ultrav.commands;

import com.randomtikspeed.ultrav.guis.RulesMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rules implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }
        Player player = (Player) sender;
        RulesMain gui = new RulesMain();
        player.openInventory(gui.getInventory());
        return true;
    }
}
