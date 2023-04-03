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
    private boolean isHitRock;
    public Player(){
        this.isHitRock =false;
    }
    public void act()
    {
        doJump(11,1);
        hitRandomObject();
        if(Level.isGameOver()){
            Greenfoot.setWorld(new GameOver());
        }else if(Level.getScore() >= 500 && Level.getCurrentLevel() == 1){
            Greenfoot.setWorld(new Level2());
        }else if(Level.getScore() >= 500 && Level.getCurrentLevel() == 2){
            Greenfoot.setWorld(new Level3());
        }else if(Level.getScore() >= 500 && Level.getCurrentLevel() == 3){
            Greenfoot.setWorld(new GameWin());
        }
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
           this.removeTouching(Boost.class);           
        }
         if(this.isTouching(Obstacle.class) == true)
       {
           this.removeTouching(Obstacle.class);
           Heart removedHeart = Level.popHeartList();  
       }
    }
     public boolean getIsHitRock()
    {
         return this.isHitRock;
    }
    public void setIsHitRock(boolean value)
    {
        this.isHitRock = value;
    }
    
}
