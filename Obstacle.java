import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends RandomObject
{
    public Obstacle(int speed){
        super(speed);
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }

}
