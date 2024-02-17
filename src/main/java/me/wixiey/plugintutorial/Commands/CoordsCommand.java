package me.wixiey.plugintutorial.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CoordsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

            if (commandSender instanceof Player) {
                Player p = (Player) commandSender;
                p.sendMessage(ChatColor.YELLOW + "Current coordinates are: X: " + (int) p.getX() + "  Y: " + (int) p.getY() + "  Z: " + (int) p.getZ());
            }

        return true;
    }
}
