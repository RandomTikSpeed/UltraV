package com.randomtikspeed.ultrav.spigot.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Syntax;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

public class Start extends BaseCommand {
    final UltraV plugin = UltraV.getInstance();
    private UltraV uv;
    private CoreMessages cm;

    public Start(UltraV uv) {
        this.uv = uv;
        cm = uv.getCore().getMessageManager().getCoreMessages();
    }

    @Default
    @Syntax("")
    @CommandCompletion("")
    public boolean rules(CommandSender sender, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }
        if (player.hasPermission("ultrav.Start"))
        {
            if (args.length == 1)
            {
                if (args[0].equals("1"))
                {
                    player.sendMessage("§6Coming soon!");
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.sendMessage("5 second test");
                        }
                    }.runTaskLater(plugin, 20L * 5L /*<-- the delay */);
                }
            }
        }
        return true;
    }
}