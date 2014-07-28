package me.JBoss925.games.search;


import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by jagger1 on 7/20/14.
 */
public class SearchTeam{

    ArrayList<UUID> players;
    String teamName;
    ChatColor nameColor;
    int roundsWon;

    public SearchTeam(){}

    public SearchTeam(ArrayList<UUID> players, String teamName, ChatColor nameColor, int roundsWon){
        this.players = players;
        this.teamName = teamName;
        this.nameColor = nameColor;
        this.roundsWon = roundsWon;
    }

    public ArrayList<UUID> getPlayers(){
        return this.players;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public ChatColor getNameColor(){
        return this.nameColor;
    }

    public void setNameColor(ChatColor nameColor) {
        this.nameColor = nameColor;
    }

    public void setPlayers(ArrayList<UUID> players) {
        this.players = players;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }

    public int getRoundsWon() {
        return this.roundsWon;
    }
}
