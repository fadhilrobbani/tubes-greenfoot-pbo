import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuestionButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionButton extends Button
{
    /**
     * Act - do whatever the QuestionButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public QuestionButton(){
         GreenfootImage buttonImage = getImage();
        buttonImage.scale(buttonImage.getWidth() - 300, buttonImage.getHeight() - 300);
        setImage(buttonImage);
    }
    public void act()
    {
        changeScene();
    }
    
     public void changeScene(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("clicksound.mp3");
            Greenfoot.setWorld(new HowToPlay());
        }
    }
}
