package me.wixiey.plugintutorial.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.jetbrains.annotations.NotNull;

public class SetHomeCommand extends HomeCommand implements CommandExecutor {

    private static double x;
    private static double y;
    private static double z;
    private static float yaw;
    private static float pitch;

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            x = p.getLocation().getX();
            y = p.getLocation().getY();
            z = p.getLocation().getZ();
            yaw = p.getLocation().getYaw();
            pitch = p.getLocation().getPitch();

            p.sendMessage(ChatColor.YELLOW + "Coordinates saved");
        }
        return true;
    }

    public static double getX() {
        return x;
    }

    public static double getY() {
        return y;
    }

    public static double getZ() {
        return z;
    }

    public static float getYaw() {
        return yaw;
    }

    public static float getPitch() {
        return pitch;
    }
}

