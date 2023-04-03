import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomObject extends Actor
{
    private int speed;
    public RandomObject(){
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);        
        speed = 4;
    }
    public void act()
    {
        if(this.getX() < 25)
        {
            this.destroyObject();
        }
        else
        {
          setLocation(this.getX() - speed, this.getY());
        }
    }
        
    public void destroyObject() 
    {
        this.getWorld().removeObject(this);
    }
    
    public void setSpeed(int value){
        this.speed = value;
    }
    
    public int getSpeed()
    {
        return this.speed;
    }
}
