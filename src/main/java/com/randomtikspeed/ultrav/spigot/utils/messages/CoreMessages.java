package com.randomtikspeed.ultrav.spigot.utils.messages;

import com.randomtikspeed.ultrav.spigot.UltraV;
import org.bukkit.ChatColor;

public class CoreMessages {
    private UltraV coreSpigotInstance;
    public CoreMessages coreMessages;
    private String name;
    public String spacer = this.Colour("&2      ");
    private String info = this.Colour("&8&l[&2&l&n&oINFO&8&l]");
    private String warn = this.Colour("&8&l[&4&l&n&oWARN&8&l]");
    private String error = this.Colour("&8&l[&4&l&n&oERROR&8&l]");
    private String severe = this.Colour("&8&l[&4&l&n&oSEVERE&8&l]");
    public String infoText;
    public String warnText;
    public String errorText;
    public String severeText;

    public CoreMessages(UltraV coreSpigotInstance)
    {
        this.infoText = this.spacer + this.spacer + this.info;
        this.warnText = this.spacer + this.spacer + this.warn;
        this.errorText = this.spacer + this.spacer + this.error;
        this.severeText = this.spacer + this.spacer + this.severe;
        this.coreSpigotInstance = coreSpigotInstance;
    }

    public String Colour(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

}
