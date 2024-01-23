import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(5);
       int xCoord = getX();
       if(xCoord <= 0 || xCoord >= 599){
           turn(180);
       }
       int rand = Greenfoot.getRandomNumber(100);
       if(rand==1){
           World airWorld = getWorld();
           airWorld.addObject(new Crate(), getX(), getY());
       }
       Actor actor = getOneIntersectingObject(Rocket.class);
            if (actor != null){
                World airWorld = getWorld();
                airWorld.removeObject(actor);
                airWorld.removeObject(this);
                }
    }    
}
