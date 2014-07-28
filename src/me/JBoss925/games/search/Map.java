package me.JBoss925.games.search;


import org.bukkit.Location;

/**
 * Created by jagger1 on 7/20/14.
 */
public class Map {

    Bomb b1;
    Bomb b2;
    String invName;
    SearchTeam s1;
    SearchTeam s2;
    Location spawn1;
    Location spawn2;
    Location lobby;
    int round;

    public Map(Bomb bomb1, Bomb bomb2, String invName, SearchTeam s1, SearchTeam s2, Location lobby, Location spawn1, Location spawn2, int round){
        this.b1 = bomb1;
        this.b2 = bomb2;
        this.invName = invName;
        this.s1 = s1;
        this.s2 = s2;
        this.spawn1 = spawn1;
        this.spawn2 = spawn2;
        this.lobby = lobby;
        this.round = round;
    }

    public void setBomb1(Bomb b1) {
        this.b1 = b1;
    }

    public void setBomb2(Bomb b2) {
        this.b2 = b2;
    }

    public void setInvName(String invName) {
        this.invName = invName;
    }

    public void setSearchTeam1(SearchTeam s1) {
        this.s1 = s1;
    }

    public void setSearchTeam2(SearchTeam s2) {
        this.s2 = s2;
    }

    public void setSpawn1(Location spawn1){
        this.spawn1 = spawn1;
    }

    public void setSpawn2(Location spawn2) {
        this.spawn2 = spawn2;
    }

    public void setLobby(Location lobby) {
        this.lobby = lobby;
    }

    public Bomb getBomb1() {
        return this.b1;
    }

    public Bomb getBomb2() {
        return this.b2;
    }

    public SearchTeam getSearchTeam1() {
        return this.s1;
    }

    public SearchTeam getSearchTeam2() {
        return this.s2;
    }

    public String getInvName(){
        return this.invName;
    }

    public Location getLobby() {
        return this.lobby;
    }

    public Location getSpawn1() {
        return this.spawn1;
    }

    public Location getSpawn2(){
        return this.spawn2;
    }

    public int getRound(){
        return this.round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
