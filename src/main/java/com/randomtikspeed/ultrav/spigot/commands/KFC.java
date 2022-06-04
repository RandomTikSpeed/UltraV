package com.randomtikspeed.ultrav.spigot.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Syntax;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class KFC extends BaseCommand
{
    private UltraV uv;
    private CoreMessages cm;

    public KFC(UltraV uv)
    {
        this.uv = uv;
        cm = uv.getCore().getMessageManager().getCoreMessages();
    }
    @Default
    @Syntax("")
    @CommandCompletion("")
    public boolean kfc(CommandSender sender, String[] args)
    {
        if (!(sender instanceof Player player))
        {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }
        if (player.getName().equals("ShadowRexYT"))
        {
            ItemStack item = new ItemStack(Material.COOKED_CHICKEN, 1);
            player.getInventory().addItem(item);
            player.sendMessage("§6Did someone say §6§lKFC?");
        } else
        {
            player.sendMessage("§7[§cError§7] §7This command can only be executed by §6ShadowRexYT§7!");
        }
        return true;
    }
}