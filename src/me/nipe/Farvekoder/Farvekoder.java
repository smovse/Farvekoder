package me.nipe.Farvekoder;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by thomas on 26/04/2016.
 */
public class Farvekoder extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Farverkoder plugin has been enabled");

    }

    @Override
    public void onDisable() {
        getLogger().info("Farverkoder plugin has been disabled");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String comandLabel, String [] args) {
        if (cmd.getName().equalsIgnoreCase("&1") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GRAY+"&1 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&2") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN+"&2 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&3") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.YELLOW+"&3 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&4") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED+"&4 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&5") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.DARK_AQUA+"&5 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&6") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GOLD+"&6 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&7") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.LIGHT_PURPLE+"&7 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&8") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.DARK_PURPLE+"&8 "+player.getName()+"!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("&9") && sender instanceof Player && sender.isOp()) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.MAGIC+"&9 "+player.getName()+"!");
            return true;
        }
        return false;
    }
}

