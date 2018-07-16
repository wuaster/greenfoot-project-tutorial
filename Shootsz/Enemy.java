import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Actor for Enemy
 * The Enemies randomly move around and if they collide with the character, they dissapear
 * 
 * Aster, Abdul, Alexander
 * April 2017 2.0
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Random movement for the actor
    public void act() 
    {
       move(4);
       if (Greenfoot.getRandomNumber(100) < 10)
       {    
           turn(Greenfoot.getRandomNumber(90)-45);
       }
       if (getX() <= 5 || getX() >=getWorld().getWidth() - 10) turn(180);
       if (getX() <= 5 || getY() >=getWorld().getHeight() - 10) turn(180);
    }
}
