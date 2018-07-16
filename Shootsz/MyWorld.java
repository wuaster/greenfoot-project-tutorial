import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int randY;
    private boolean spawn = true;
    private int counter, enemies = 0;
    private int MAX_ENEMIES = 6;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Player p = new Player();
        addObject(p, 100, 300);
        act();

    }
    
    public void act() {
        if (counter <= 30){  
            counter += 1;
        }
        else {
            counter = 0;
            addEnemy();
        }
    }

    public void addEnemy() {
        randY = Greenfoot.getRandomNumber(600);
        NormalEnemy e = new NormalEnemy();
        addObject(e, 950, randY);
    }
}
