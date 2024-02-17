package me.wixiey.falldamagedisplay;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage implements Listener {

    @EventHandler
    public void onFallDamageTaken(EntityDamageEvent event) {
        if (event.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Player player = (Player) event.getEntity();

            player.sendMessage("You took " + (int) event.getDamage() + " fall damage!");

        }
    }
}
