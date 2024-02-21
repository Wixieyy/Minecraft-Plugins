package me.wixiey.plugintutorial;

import io.papermc.paper.event.player.PlayerBedFailEnterEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerTrySleepListeners implements Listener {

    @EventHandler
    public void onPlayerFailSleep(PlayerBedFailEnterEvent event) {
        String name = event.getPlayer().getName();
        Player player = event.getPlayer();
        if (!player.isSleeping()) {
            Bukkit.getServer().broadcastMessage(name + " is trying to sleep...");
        }
    }
}