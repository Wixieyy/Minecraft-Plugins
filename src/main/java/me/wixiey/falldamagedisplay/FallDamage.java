package me.wixiey.falldamagedisplay;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage implements Listener {

    @EventHandler
    public void onFallDamageTaken(EntityDamageEvent event) {
        if (event.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Player player = (Player) event.getEntity();

//            if (event.getEntity() == player && event.getDamage() > 4) {
                player.sendMessage("" +  (player.getHealth() - event.getDamage()) + 3);
//            }
        }
    }
}
