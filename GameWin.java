import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWin extends World
{

    /**
     * Constructor for objects of class GameWin.
     * 
     */
    public GameWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 460, 1); 
        this.addObject(new HomeButton(),357,409);
        this.addObject(new ReplayButton(),454,409);
        this.addObject(new Label(("Score: "+Level.getScore()),50),430,26);
    }
}
