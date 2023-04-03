import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    private static Counter scoreCounter = new Counter("Score: ");
    private static Counter crowdCounter = new Counter();
    private static int currentLevel;
    protected static ArrayList<Heart> heartList = new ArrayList<Heart>();
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 460, 1); 
        scoreCounter.setValue(0);
        this.addObject(new Player(),100,100);
        this.addObject(scoreCounter,736,26);
    }
    public void reFillHeart(){
        heartList.clear();
        heartList.add(new Heart());
        heartList.add(new Heart());
        heartList.add(new Heart());
    }
    public static boolean isGameOver(){
        return heartList.size() - 1 < 0;
    }
    public static void updateScore(int value){
        scoreCounter.add(value);
    }
    public static void setScore(int value){
        scoreCounter.setValue(value);
    }
    public static int getScore(){
        return scoreCounter.getValue();
    }
    public static void setCurrentLevel(int level){
        Level.currentLevel = level;
    }
    public static int getCurrentLevel(){
        return Level.currentLevel;
    }
    public static void updateCrowdControl(int value){
        crowdCounter.add(value);
    }
    public static void setCrowdControl(int value){
        crowdCounter.setValue(value);
    }
    public static int getCrowdControl(){
        return crowdCounter.getValue();
    }
    public static Heart popHeartList(){
        if(heartList.size() - 1 >= 0){
            Heart removedHeart = heartList.remove(heartList.size()-1);
            return removedHeart;
        }
        return null;
    }
    public static void pushHeartList(Heart heart){
        heartList.add(heart);
    }
    public static int getLengthHeartList(){
        return heartList.size();
    }
    
    
}
