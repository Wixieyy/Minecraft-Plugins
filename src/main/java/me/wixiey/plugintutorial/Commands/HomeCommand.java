package me.wixiey.plugintutorial.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            double x = SetHomeCommand.getX();
            double y = SetHomeCommand.getY();
            double z = SetHomeCommand.getZ();
            float yaw = SetHomeCommand.getYaw();
            float pitch = SetHomeCommand.getPitch();

            Location home = new Location(Bukkit.getServer().getWorld("world"),x,y,z,yaw,pitch);

            try {
                p.sendMessage(ChatColor.YELLOW + "Teleporting in 3 seconds..");
                Thread.sleep(1000);
                p.sendMessage(ChatColor.YELLOW + "Teleporting in 2 seconds..");
                Thread.sleep(1000);
                p.sendMessage(ChatColor.YELLOW + "Teleporting in 1 second..");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            p.teleport(home);
            p.sendMessage(ChatColor.YELLOW + "Teleport complete.");
        }
        return true;
    }
}