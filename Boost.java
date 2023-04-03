import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boost extends RandomObject
{
    public Boost(int speed){
        super(speed);
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
}
