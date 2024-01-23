import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    public Rocket()
    {
        setRotation(270);
    }
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        Actor actor = getOneIntersectingObject(Crate.class);
        if (actor != null){
            AirRaidWorld airWorld = (AirRaidWorld)getWorld();
            airWorld.removeObject(actor);
            airWorld.removeObject(this);
            airWorld.increaseScore();
            
        }
        else{
            
            
                int yCoord = getY();
                if(yCoord <= 0)
            {
                World airWorld = getWorld();
                airWorld.removeObject(this);
            }
        
        
    }
}
}


