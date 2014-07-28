package me.JBoss925.games.search;

import me.JBoss925.games.Main;
import org.bukkit.Material;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by jagger1 on 7/20/14.
 */
public class BombTimer extends BukkitRunnable{

    int time;
    Bomb b;

    public BombTimer(int startTime, Main plugin, Bomb b){
        this.time = startTime;
        this.runTask(plugin);
        this.b = b;
    }

    @Override
    public void run() {
        time--;
        if(time == 0){
            b.getExplosion().explode();
            b.setBombBlockType(Material.AIR);
            this.cancel();
        }
    }

    public int getCurrentTime(){
        return this.time;
    }


}
