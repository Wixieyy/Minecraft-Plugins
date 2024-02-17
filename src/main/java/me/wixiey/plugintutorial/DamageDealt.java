package me.wixiey.plugintutorial;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageDealt implements Listener {

    public void onDamageDealtEvent (EntityDamageEvent event) {

        Player player = (Player) event.getEntity();
        if (event.getEntity() != player) {
            Bukkit.getServer().broadcastMessage("testing");
        }

    }
}
