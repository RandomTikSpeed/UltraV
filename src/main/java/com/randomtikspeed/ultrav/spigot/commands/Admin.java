package com.randomtikspeed.ultrav.spigot.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Syntax;
import com.randomtikspeed.ultrav.spigot.UltraV;
import com.randomtikspeed.ultrav.spigot.guis.admin.AdminMain;
import com.randomtikspeed.ultrav.spigot.utils.messages.CoreMessages;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Admin extends BaseCommand
{
    private UltraV uv;
    private CoreMessages cm;

    public Admin(UltraV uv)
    {
        this.uv = uv;
        cm = uv.getCore().getMessageManager().getCoreMessages();
    }
    @Default
    @Syntax("")
    @CommandCompletion("")
    public boolean admin(CommandSender sender, String[] args)
    {
        if (!(sender instanceof Player player))
        {
            sender.sendMessage("§7[§cError§7] §7This command can only be executed in game!");
            return true;
        }
        if (player.hasPermission("ultrav.admin"))
        {
            AdminMain gui = new AdminMain();
            player.openInventory(gui.getInventory());
        }
        return true;
    }
}