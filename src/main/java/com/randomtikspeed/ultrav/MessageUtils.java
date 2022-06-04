package com.randomtikspeed.ultrav;

import org.bukkit.ChatColor;

public class MessageUtils {
    private UltraV instance;

    public MessageUtils(UltraV instance) {
        this.instance = instance;
    }

    public String Colour(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
