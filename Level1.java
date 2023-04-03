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
        this.addObject(heartList.get(0),10,10);
        this.addObject(heartList.get(1),30,10);
        this.addObject(heartList.get(2),50,10);
        super.setCurrentLevel(1);
        super.setCrowdControl(0);
        this.addObject(new Label(("Level: "+super.getCurrentLevel()),30),530,26);
    }
    public void act(){
        super.updateScore(1);   
        super.updateCrowdControl(1);
        if(super.getCrowdControl() % 60 == 0){
            generateRandomObject();
        }
    }
    public void generateRandomObject(){
        if(super.getCurrentLevel() == 1){
            this.addObject(new Obstacle(),798,Greenfoot.getRandomNumber(460));
            this.addObject(new Boost(),798,Greenfoot.getRandomNumber(460));
        }
    }
}
