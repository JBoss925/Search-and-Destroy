package me.JBoss925.games.search;

import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by jagger1 on 7/20/14.
 */
public class RoundTimer extends BukkitRunnable{

    int maxTime;
    int currentTime;
    RoundManager manager;

    public RoundTimer(int startTime, int maxTime, RoundManager manager){
        this.maxTime = maxTime;
        this.currentTime = startTime;
        this.manager = manager;
    }


    @Override
    public void run() {
        currentTime++;
        if(currentTime == maxTime){
            if(manager.getMap().getRound() > 6 || manager.getMap().getSearchTeam1().getRoundsWon() == 4 || manager.getMap().getSearchTeam2().getRoundsWon() == 4){
                manager.end();
                return;
            }
            manager.newRound();
        }
        this.cancel();
    }
}
