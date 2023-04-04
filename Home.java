import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    public static GreenfootSound backgroundSong = new GreenfootSound("backgroundsong.mp3");
    public static boolean isStarted = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Home()
        
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 460, 1); 
        prepare();
        
        if(isStarted && !backgroundSong.isPlaying()){
            backgroundSong.play();
        }   
    }

    public void started(){
        isStarted = true;
        if(Level.levelSong.isPlaying()){
            Level.levelSong.stop();
        }
        if(!backgroundSong.isPlaying()){
            backgroundSong.play();
        }
    }
    public void stopped(){
        isStarted = false;
    }
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
        questionButton.setLocation(427,323);
        playButton.setLocation(426,229);
        questionButton.setLocation(433,339);
        questionButton.setLocation(405,339);
        playButton.setLocation(402,231);
        playButton.setLocation(377,203);
        questionButton.setLocation(398,287);
        questionButton.setLocation(403,328);
        playButton.setLocation(407,212);
    }
}
