import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeButton extends Button
{
    /**
     * Act - do whatever the HomeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public HomeButton(){
        GreenfootImage buttonImage = getImage();
        buttonImage.scale(80, 80);
        setImage(buttonImage);
    }
    public void act()
    {
        changeScene();
    }
    
    public void changeScene(){
         if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("clicksound.mp3");
            Greenfoot.setWorld(new Home());
        }
    }

}
