package me.JBoss925.games.search;

import me.JBoss925.games.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagger1 on 7/20/14.
 */
public class InventorySave implements CommandExecutor{

    Main plugin;

    public InventorySave(Main main) {
        this.plugin = main;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("saveInventory")){
            if(commandSender instanceof Player){
                Player p = (Player) commandSender;
                if(p.hasPermission("inv.save")){
                    if(args.length != 1){
                        p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Needs an inventory name as the first arg!");
                        return true;
                    }
                    ArrayList<ItemStack> itemStacks = new ArrayList<ItemStack>();
                    for(int i = 0; i < p.getInventory().getContents().length; i++){
                        if(p.getInventory().getItem(i) != null){
                            itemStacks.add(p.getInventory().getItem(i));
                        }
                    }
                    plugin.getConfig().set(args[0], itemStacks);
                    p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Inventory " + ChatColor.GREEN + "" + ChatColor.BOLD + args[0] + ChatColor.GREEN + "" + ChatColor.BOLD + " has been saved.");
                    return true;
                }
            }
        }
        if(command.getName().equalsIgnoreCase("loadInventory")){
            if(commandSender instanceof Player){
                Player p = (Player) commandSender;
                if(p.hasPermission("inv.load")){
                    if(args.length != 1){
                        p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Needs 1 argument: the inventory name.");
                        return true;
                    }
                    if(plugin.getConfig().getList(args[0]) == null){
                        p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "No such inventory");
                        return true;
                    }
                    ArrayList<ItemStack> itemStacks = (ArrayList<ItemStack>) plugin.getConfig().getList(args[0]);
                    p.getInventory().clear();
                    p.getInventory().setContents((ItemStack[]) itemStacks.toArray());
                    p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Inventory " + ChatColor.GREEN + "" + ChatColor.BOLD + args[0] + ChatColor.GREEN + "" + ChatColor.BOLD + " has been loaded.");
                    return true;
                }
            }
        }
        return false;
    }

    public void setInv(Player player, String invname){
        if(plugin.getConfig().getList(invname) == null){
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "No such inventory");
            return;
        }
        ArrayList<ItemStack> itemStacks = (ArrayList<ItemStack>) plugin.getConfig().getList(invname);
        player.getInventory().clear();
        player.getInventory().setContents((ItemStack[]) itemStacks.toArray());
        player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Inventory " + ChatColor.GREEN + "" + ChatColor.BOLD + invname + ChatColor.GREEN + "" + ChatColor.BOLD + " has been loaded.");
        return;
    }
}
