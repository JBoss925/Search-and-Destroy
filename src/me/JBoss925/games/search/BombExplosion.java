package me.JBoss925.games.search;


import org.bukkit.Location;
import org.bukkit.World;

/**
 * Created by jagger1 on 7/20/14.
 */
public class BombExplosion {

    double xcord;
    double ycord;
    double zcord;
    float power;
    boolean fire;
    boolean breakBlocks;
    World world;

    public BombExplosion(World w, double x, double y, double z, float power, boolean setFire, boolean breakBlocks){
        this.world = w;
        this.xcord = x;
        this.ycord = y;
        this.zcord = z;
        this.power = power;
        this.fire = setFire;
        this.breakBlocks = breakBlocks;
    }

    public BombExplosion(Location loc, float power, boolean setFire, boolean breakBlocks){
        this.world = loc.getWorld();
        this.xcord = loc.getX();
        this.ycord = loc.getY();
        this.zcord = loc.getZ();
        this.power = power;
        this.fire = setFire;
        this.breakBlocks = breakBlocks;
    }

    public void explode(){
        world.createExplosion(xcord, ycord, zcord, power, fire, breakBlocks);
    }

    public double getXcord(){
        return this.xcord;
    }

    public double getYcord(){
        return this.ycord;
    }

    public double getZcord(){
        return this.zcord;
    }

    public float getPower(){
        return this.power;
    }

    public boolean isFire(){
        return this.fire;
    }

    public boolean isBreakBlocks(){
        return this.breakBlocks;
    }

}
