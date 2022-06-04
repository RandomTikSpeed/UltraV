package com.randomtikspeed.ultrav.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

// Command to Start the quests. Currently, a number will be applied to each quest - RTS
public class Start implements CommandExecutor {
    private final com.randomtikspeed.ultrav.UltraV plugin;

    public Start(com.randomtikspeed.ultrav.UltraV plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("Start") && player.hasPermission("UltraV.Start")) {
            if (args.length == 1) {
                if (args[0].equals("1")) {
                    player.sendMessage("§6Coming soon!");
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.sendMessage("After 5 seconds lol");
                        }
                    }.runTaskLater(plugin, 20L * 5L /*<-- the delay */);
                }
            } else {
                return true;
            }
        }
    return true;
    }
}
