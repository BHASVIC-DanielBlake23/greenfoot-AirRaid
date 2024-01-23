import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crate extends Actor
{
    public Crate()
    {
        setRotation(90);
    }
    /**
     * Act - do whatever the Crate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        int yCoord = getY();
        if(yCoord>= 399){
            AirRaidWorld airWorld = (AirRaidWorld)getWorld();
            airWorld.removeObject(this);
            airWorld.loseLife();
        }
        
    }    
}
