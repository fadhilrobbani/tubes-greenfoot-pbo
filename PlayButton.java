import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public PlayButton(){
        GreenfootImage buttonImage = getImage();
        buttonImage.scale(buttonImage.getWidth() - 200, buttonImage.getHeight() - 200);
        setImage(buttonImage);
    }
    public void act()
    {
        // Add your action code here.
        changeScene();
    }
    
    public void changeScene(){
         if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("clicksound.mp3");
            Greenfoot.setWorld(new Level1());
        }
    }
}
