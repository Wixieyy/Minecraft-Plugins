package me.wixiey.falldamagedisplay;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage implements Listener {

    @EventHandler
    public void onFallDamageTaken(EntityDamageEvent event) {
        if (event.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Player player = (Player) event.getEntity();

            if (event.getEntity() == player && event.getDamage() > 10) {
                player.sendMessage(ChatColor.RED + "" + (int) ((20 - event.getDamage()) / 2) + " more blocks and you would have died.");
            }
        }
    }
}
