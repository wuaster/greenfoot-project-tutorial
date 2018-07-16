import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NormalEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NormalEnemy extends Spaceship
{
    /**
     * Act - do whatever the NormalEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(-4);
       if (getX() <= 5 || getX() >=getWorld().getWidth() - 10 || getY() >=getWorld().getHeight() - 10) {
           getWorld().removeObject(this);
        }
    }  
}
