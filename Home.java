import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 460, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,256,217);
        playButton.setLocation(299,241);
        playButton.setLocation(394,230);
        playButton.setLocation(423,225);
        QuestionButton questionButton = new QuestionButton();
        addObject(questionButton,714,333);
        questionButton.setLocation(375,337);
        playButton.setLocation(359,194);
        questionButton.setLocation(387,261);
        questionButton.setLocation(393,270);
        playButton.setLocation(408,189);
        questionButton.setLocation(401,261);
        questionButton.setLocation(430,308);
        playButton.setLocation(438,197);
        questionButton.setLocation(396,357);
        playButton.setLocation(394,241);
        playButton.setLocation(397,240);
        questionButton.setLocation(409,350);
        questionButton.setLocation(374,331);
    }
}
