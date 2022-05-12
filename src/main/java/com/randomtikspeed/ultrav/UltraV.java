package com.randomtikspeed.ultrav;

import com.randomtikspeed.ultrav.commands.*;
import com.randomtikspeed.ultrav.events.GUIListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class UltraV extends JavaPlugin {
    private static UltraV instance;
    public static UltraV getInstance() {
        return UltraV.instance;
    }

    @Override
    public void onEnable() {
        UltraV.instance = this;
        getServer().getPluginManager().registerEvents(new GUIListener(), this);
        Objects.requireNonNull(getCommand("start")).setExecutor(new start());
        Objects.requireNonNull(getCommand("ultrav")).setExecutor(new ultrav());
        Objects.requireNonNull(getCommand("clearchat")).setExecutor(new clearchat());
        Objects.requireNonNull(getCommand("store")).setExecutor(new store());
        Objects.requireNonNull(getCommand("kfc")).setExecutor(new kfc());
        getServer().getConsoleSender().sendMessage("§aUltra V is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("§cUltra V is disabled!");

    }


}
