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
    public SimpleTimer shootTimer = new SimpleTimer();
    public Boss(){
        GreenfootImage img = this.getImage();
        img.scale(200,200);
        this.setImage(img);
    }
    public void act()
    {
         //if(this.getX() > 615){
          //   setLocation(this.getX() - 4, this.getY());
         //}
         moveAround();
         if(shootTimer.millisElapsed()>530){
            shootTimer.mark();
            randomShoot();
        }
         
    }
    public void moveAround(){
        move(10);
        if(Greenfoot.getRandomNumber(100) <10){
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 360 || getX() >= getWorld().getWidth()-80){
            turn(180);
        }
        if(getY() <= 8 || getY() >= getWorld().getHeight()-8){
            turn(180);
        }
        if(getY() < 50 && getX()>750){
            setLocation(700,200);
        }
    }
    public void randomShoot(){
        this.getWorld().addObject(new Obstacle(6),this.getX(),this.getY());
    }
}
