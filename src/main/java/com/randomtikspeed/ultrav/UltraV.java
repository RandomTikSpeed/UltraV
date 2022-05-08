package com.randomtikspeed.ultrav;

import com.randomtikspeed.ultrav.commands.clearchat;
import com.randomtikspeed.ultrav.commands.start;
import com.randomtikspeed.ultrav.commands.ultrav;
import com.randomtikspeed.ultrav.events.GUI;
import org.bukkit.plugin.java.JavaPlugin;

public final class UltraV extends JavaPlugin {
    private static UltraV instance;
    public static UltraV getInstance() {
        return UltraV.instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        UltraV.instance = this;
        getServer().getPluginManager().registerEvents(new GUI(), this);
        getCommand("start").setExecutor(new start());
        getCommand("ultrav").setExecutor(new ultrav());
        getCommand("clearchat").setExecutor(new clearchat());
        getServer().getConsoleSender().sendMessage("§aUltra V is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("§cUltra V is disabled!");

    }


}
