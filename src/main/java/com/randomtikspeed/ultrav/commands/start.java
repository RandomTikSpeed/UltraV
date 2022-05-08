package com.randomtikspeed.ultrav.commands;

import com.randomtikspeed.ultrav.UltraV;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

// Command to start the quests. Currently, a number will be applied to each quest - RTS
public class start implements CommandExecutor {
final UltraV plugin = UltraV.getInstance();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("start") && player.hasPermission("ultrav.start")) {
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
