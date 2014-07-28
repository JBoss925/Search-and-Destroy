package me.JBoss925.games;

import me.JBoss925.games.search.InventorySave;
import me.JBoss925.games.search.RoundManager;
import me.JBoss925.games.search.SearchTeam;
import org.bukkit.Bukkit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by jagger1 on 7/20/14.
 */
public class Main extends JavaPlugin{

    public void onEnable(){
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new RoundManager(), this);
        getCommand("saveInventory").setExecutor(new InventorySave(this));
        getCommand("loadInventory").setExecutor(new InventorySave(this));
    }

    public void onDisable(){
        saveConfig();
    }

    //onCommand
}
