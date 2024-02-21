package me.wixiey.farmingplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Farming_plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Hoe3x3(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
