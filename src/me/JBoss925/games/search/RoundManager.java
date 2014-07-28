package me.JBoss925.games.search;

import me.JBoss925.games.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.Listener;

import java.util.UUID;

/**
 * Created by jagger1 on 7/20/14.
 */
public class RoundManager implements Listener{

    Map map;
    Main plugin;

    public RoundManager(Map map, Main plugin){
        this.map = map;
        this.plugin = plugin;
    }

    public RoundManager(){}

    public void startRound(RoundTimer timer){
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, timer, 0l, 20l);
    }

    public void end(){
        teleportPlayersToLobby(map.getSearchTeam1());
        teleportPlayersToLobby(map.getSearchTeam2());
    }

    public void newRound(){
        teleportPlayersToSpawn(map.getSearchTeam1(), map.getSpawn1());
        teleportPlayersToSpawn(map.getSearchTeam2(), map.getSpawn2());
    }

    public void teleportPlayersToLobby(SearchTeam searchTeam){
        for(UUID id : searchTeam.getPlayers()){
            if(Bukkit.getServer().getPlayer(id) != null){
                Bukkit.getServer().getPlayer(id).teleport(map.getLobby());
            }
        }
    }

    public void teleportPlayersToSpawn(SearchTeam searchTeam, Location spawn){
        for(UUID id : searchTeam.getPlayers()){
            if(Bukkit.getServer().getPlayer(id) != null){
                Bukkit.getServer().getPlayer(id).teleport(spawn);
            }
        }
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return this.map;
    }

    public void setPlugin(Main plugin) {
        this.plugin = plugin;
    }

    public Main getPlugin() {
        return this.plugin;
    }
}
