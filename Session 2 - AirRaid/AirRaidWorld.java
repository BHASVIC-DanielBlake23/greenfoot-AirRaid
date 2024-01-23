import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirRaidWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirRaidWorld extends World
{
    private StatusBoard scoreBoard;
    private int score = 0;
    private int lives = 5;

    public void loseLife()
    {
        lives = lives -1; 
        scoreBoard.updateStatus(score,lives);

    }
    public int getLives(){
        return lives;
    }
    /**
     * Constructor for objects of class AirRaidWorld.
     * 
     */
    public AirRaidWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject (new Launcher(), 300, 375);
        addObject(new Plane(), 100, 30);
        if (lives == 0)
        {
            Greenfoot.stop();
    
        }
        scoreBoard = new StatusBoard();
        addObject(scoreBoard,35,370);
        scoreBoard.updateStatus(score,lives);
    }
    public void increaseScore()
    {
        score = score+1;
        scoreBoard.updateStatus(score,lives);
    }
    public int getScore(){
        return score;
    }
}
