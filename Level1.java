import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
        super.reFillHeart();
        super.setCurrentLevelSpeed(5);
        this.addObject(heartList.get(0),25,20);
        this.addObject(heartList.get(1),55,20);
        this.addObject(heartList.get(2),85,20);
        super.setCurrentLevel(1);
        Greenfoot.playSound("levelsong.mp3");
        this.addObject(new Label(("Level: "+super.getCurrentLevel()),30),530,26);
    }
    public void act(){
        super.updateScore(1);   
        super.updateCrowdControl(1);
        generateRandomObject();
    }
    public void generateRandomObject(){
        if(super.getCurrentLevel() == 1){
            if(super.getCrowdControl() % 55 == 0){
                this.addObject(new Obstacle(super.getCurrentLevelSpeed()),798,Greenfoot.getRandomNumber(460)+10);
            }
            if(super.getCrowdControl() % 225 == 0){
                this.addObject(new Boost(super.getCurrentLevelSpeed()),798,Greenfoot.getRandomNumber(460)+10);
            }
            
        }
    }
}
