import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int gravity;
    public Player(){
        GreenfootImage img = this.getImage();
        img.scale(80,60);
        this.setImage(img);
    }
    public void act()
    {
        doJump(11,1);
        hitRandomObject();
        Level.levelController();
    }
    public void doJump(int jumpValue, int fallValue)
    {
        gravity -= fallValue;
        setLocation(getX(), getY() - (gravity / 2));
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("space")) 
        {
            gravity = jumpValue; 
        }
    }
    public void hitRandomObject(){
        if(this.isTouching(Boost.class) == true)
       {
           Level.updateScore(10);
            Greenfoot.playSound("getboost.mp3");
           this.removeTouching(Boost.class);           
        }
         if(this.isTouching(Obstacle.class) == true)
       {
           this.removeTouching(Obstacle.class);
           Heart removedHeart = Level.popHeartList();
           this.getWorld().removeObject(removedHeart);
       }
    }
}
