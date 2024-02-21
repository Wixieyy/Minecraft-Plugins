package me.wixiey.farmingplugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Hoe3x3 implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if(player.getInventory().getItemInMainHand().getType().equals(Material.IRON_HOE)) {
            if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                player.sendMessage("testing");
            }
        }
    }
}
