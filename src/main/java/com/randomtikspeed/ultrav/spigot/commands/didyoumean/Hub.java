package com.randomtikspeed.ultrav.spigot.commands.didyoumean;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Syntax;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hub extends BaseCommand
{
    private UltraV uv;
    private CoreMessages cm;

    public Hub(UltraV uv)
    {
        this.uv = uv;
        cm = uv.getCore().getMessageManager().getCoreMessages();
    }
    @Default
    @Syntax("")
    @CommandCompletion("")
    public boolean hub(CommandSender sender, String[] args)
    {
        if (!(sender instanceof Player player))
        {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }
        Bukkit.getServer().dispatchCommand(sender, "spawn");
        return true;
    }
}
