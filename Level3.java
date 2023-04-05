import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        super();
        super.reFillHeart();
        super.setCurrentLevel(3);
        super.setSimpleTimer(16);
        super.setCurrentLevelSpeed(6);
        this.addObject(new Label(("Level: "+super.getCurrentLevel()),30),430,26);
        this.addObject(heartList.get(0),25,20);
        this.addObject(heartList.get(1),55,20);
        this.addObject(heartList.get(2),85,20);
    }
    public void act(){
        super.updateScore(1); 
        super.countDown();
        super.updateCrowdControl(4);
        generateRandomObject();
    }
    public void generateRandomObject(){
        if(super.getCurrentLevel() == 3){
             if(super.getCrowdControl() % 105 == 0){
                this.addObject(new Obstacle3(13),850,Greenfoot.getRandomNumber(460)+10);
            }
            if(super.getCrowdControl() % 225 == 0){
                this.addObject(new Boost(super.getCurrentLevelSpeed()),798,Greenfoot.getRandomNumber(460)+10);
            }
        }
    }
}
