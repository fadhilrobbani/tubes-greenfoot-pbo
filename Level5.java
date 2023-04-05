import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends Level
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {
        super();
        super.reFillHeart();
        super.setCurrentLevel(5);
        super.setSimpleTimer(16);
        super.setCurrentLevelSpeed(6);
        this.addObject(new Label(("Level: "+super.getCurrentLevel()),30),430,26);
        this.addObject(heartList.get(0),25,20);
        this.addObject(heartList.get(1),55,20);
        this.addObject(heartList.get(2),85,20);
        this.addObject(new Boss(),700,200);
    }
    public void act(){
       super.updateScore(1); 
        super.countDown();
        super.updateCrowdControl(4);
        generateRandomObject();
    }
    public void generateRandomObject(){
        if(super.getCurrentLevel() == 5){
            if(super.getCrowdControl() % 65 == 0){
                this.addObject(new Boost(super.getCurrentLevelSpeed()),798,Greenfoot.getRandomNumber(460)+10);
            }
        }
    }
}
