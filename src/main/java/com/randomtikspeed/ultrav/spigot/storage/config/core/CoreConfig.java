package com.randomtikspeed.ultrav.spigot.storage.config.core;

import com.randomtikspeed.ultrav.spigot.UltraV;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class CoreConfig {
    private UltraV coreSpigot;
    private FileConfiguration dataConfig;
    private File configFile;

    public CoreConfig(UltraV coreSpigot) {
        this.coreSpigot = coreSpigot;
        this.saveDefaultConfig();
    }

    public void reloadConfig() {
        if (this.configFile == null) {
            this.configFile = new File(this.coreSpigot.getDataFolder(), "core/core.yml");
        }

        this.dataConfig = YamlConfiguration.loadConfiguration(this.configFile);
        InputStream defaultStream = this.coreSpigot.getResource("core/core.yml");
        if (defaultStream != null) {
            YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
            this.dataConfig.setDefaults(defaultConfig);
        }

    }

    public FileConfiguration getConfig() {
        if (this.dataConfig == null) {
            this.reloadConfig();
        }

        return this.dataConfig;
    }

    public void saveConfig() {
        if (this.dataConfig != null && this.configFile != null) {
            try {
                this.getConfig().save(this.configFile);
            } catch (IOException var2) {
                this.coreSpigot.getLogger().log(Level.SEVERE, "Could not save config to " + this.configFile, var2);
            }

        }
    }

    public void saveDefaultConfig() {
        if (this.configFile == null) {
            this.configFile = new File(this.coreSpigot.getDataFolder(), "core/core.yml");
        }

        if (!this.configFile.exists()) {
            this.coreSpigot.saveResource("core/core.yml", false);
        }

    }
}
