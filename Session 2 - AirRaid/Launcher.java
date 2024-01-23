import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Launcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Launcher extends Actor
{
    private int delay = 0;
    /**
     * Act - do whatever the Launcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("right")){
            move(20);
        }
        
        if (Greenfoot.isKeyDown("left")){
            move(-20);
        }
        
        if (delay > 0)
        {
            delay = delay -1;
        }
        else{
            if (Greenfoot.isKeyDown("space")){
            World airWorld = getWorld();
             airWorld.addObject(new Rocket(), getX(), getY());     
             delay = 25;
        }
        }
       
    }    
}

