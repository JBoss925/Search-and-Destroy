package me.JBoss925.games.search;

import me.JBoss925.games.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;

/**
 * Created by jagger1 on 7/20/14.
 */
public class Bomb {

    String name;
    BombTimer timer;
    BombExplosion explosion;
    Block b;
    Main pl;

    public Bomb(String name, BombTimer timer, BombExplosion explosion, Main plugin, Block bombBlock){
        this.name = name;
        this.timer = timer;
        this.explosion = explosion;
        this.pl = plugin;
        this.b = bombBlock;
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, timer, 0l, 20l);
    }

    public String getName(){
        return this.name;
    }

    public BombTimer getTimer(){
        return this.timer;
    }

    public BombExplosion getExplosion(){
        return this.explosion;
    }

    public Block getBombBlock(){
        return this.b;
    }

    public void setBombBlockType(Material mat) {
        this.b.setType(mat);
    }
}
