import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle2 extends RandomObject
{
    public Obstacle2(int speed){
        super(speed);
        GreenfootImage image = getImage();  
        image.scale(60, 60);
        setImage(image);
    }
}
