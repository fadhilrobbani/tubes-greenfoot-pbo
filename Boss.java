import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boss(){
        GreenfootImage img = this.getImage();
        img.scale(200,200);
        this.setImage(img);
    }
    public void act()
    {
         if(this.getX() > 615){
             setLocation(this.getX() - 4, this.getY());
         }
    }
}
