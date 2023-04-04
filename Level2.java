import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
        super.reFillHeart();
        super.setCurrentLevel(2);
        super.setCurrentLevelSpeed(7);
        this.addObject(new Label(("Level: "+super.getCurrentLevel()),30),530,26);
        this.addObject(heartList.get(0),25,20);
        this.addObject(heartList.get(1),55,20);
        this.addObject(heartList.get(2),85,20);
    }
    public void act(){
        super.updateScore(1);   
        super.updateCrowdControl(1);
        generateRandomObject();
    }
    public void generateRandomObject(){
        if(super.getCurrentLevel() == 2){
            if(super.getCrowdControl() % 55 == 0){
                this.addObject(new Obstacle(super.getCurrentLevelSpeed()),798,Greenfoot.getRandomNumber(460)+10);
            }
            if(super.getCrowdControl() % 70 == 0){
                this.addObject(new Obstacle2(12),798,Greenfoot.getRandomNumber(460)+10);
            }
            if(super.getCrowdControl() % 225 == 0){
                this.addObject(new Boost(super.getCurrentLevelSpeed()),798,Greenfoot.getRandomNumber(460)+10);
            }

        }

    }
}
