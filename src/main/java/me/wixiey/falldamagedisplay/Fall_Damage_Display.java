package me.wixiey.falldamagedisplay;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fall_Damage_Display extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new FallDamage(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic|
    }
}
