package com.randomtikspeed.ultrav;

import com.randomtikspeed.ultrav.commands.*;
import com.randomtikspeed.ultrav.commands.didyoumean.hub;
import com.randomtikspeed.ultrav.events.AdminMainEvents;
import com.randomtikspeed.ultrav.events.RulesDCEvents;
import com.randomtikspeed.ultrav.events.RulesMCEvents;
import com.randomtikspeed.ultrav.events.RulesMainEvents;
import com.randomtikspeed.ultrav.items.RulesItems;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class UltraV extends JavaPlugin {
    private UltraV instance;
    private MessageUtils msgUtils;


    @Override
    public void onEnable() {
        instance = this;
        msgUtils = new MessageUtils(this);
        RulesItems.init();
        getServer().getPluginManager().registerEvents(new AdminMainEvents(), this);
        getServer().getPluginManager().registerEvents(new RulesMainEvents(), this);
        getServer().getPluginManager().registerEvents(new RulesMCEvents(), this);
        getServer().getPluginManager().registerEvents(new RulesDCEvents(), this);
        Objects.requireNonNull(getCommand("UltraV")).setExecutor(new com.randomtikspeed.ultrav.commands.UltraV());
        Objects.requireNonNull(getCommand("ClearChat")).setExecutor(new ClearChat());
        Objects.requireNonNull(getCommand("Store")).setExecutor(new Store());
        Objects.requireNonNull(getCommand("KFC")).setExecutor(new KFC());
        Objects.requireNonNull(getCommand("hub")).setExecutor(new hub());
        Objects.requireNonNull(getCommand("Rules")).setExecutor(new Rules());
        getServer().getConsoleSender().sendMessage("§aUltra V is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("§cUltra V is disabled!");

    }

    public UltraV getInstance() {
        return instance;
    }

    public MessageUtils getMsgUtils() {
        return msgUtils;
    }
}
