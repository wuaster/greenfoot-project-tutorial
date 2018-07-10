import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * User's character. This Class contains movement, collision detection, and firing of the gun
 * 
 
 */
public class Player extends Spaceship
{
    private boolean canFire = true;
    private boolean takeDamage = true;
    int positionY = 0;
    int positionX = 60;
    /**
     * Act - do whatever the Word wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //Actor player = getOneIntersectingObject(Enemy.class);
       World myWorld = getWorld();
       //Actor enemy = getOneObjectAtOffset(0,0,Enemy.class);
       /*
       if(player !=null && takeDamage)
       {
           myWorld.removeObject(enemy);
           ((HealthBar)getWorld().getObjects(HealthBar.class).get(0)).loseHealth();
    
           
           
           
           Greenfoot.playSound("hitindicator.mp3");
        }  
       */
        if (Greenfoot.isKeyDown("right"))
        {

            move(5);
            
        }
        if (Greenfoot.isKeyDown("left"))
        {
           move(-5);

        }
        if (Greenfoot.isKeyDown("up"))
        {

            moveUp();
           
            
        }
        if (Greenfoot.isKeyDown("down"))
        {        
            moveDown();

        }
         if (!Greenfoot.isKeyDown("space")){
           canFire = true; // Code is too fast for a human to press a button and expect only one projectile. Only allows one projectile per button press.
        }
       if (Greenfoot.isKeyDown("space") && canFire==true)
       {    
          fire(); 
          canFire = false; 
       }
    }    
    
    public void moveDown()
    {
        int x = (getX());
        int y = (getY() + 5);
     
        setLocation(x, y);
    }
    public void moveUp()
    {
        int x = (getX());
        int y = (getY() - 5);
     
        setLocation(x, y);
    }
    /**
     *The fire method is called when a player presses the key to launch a projectile.
     */
    
    public void fire() {
       Greenfoot.playSound("gunsound.mp3"); // Plays the sound effect
       
       BulletPlayer bulletplayer = new BulletPlayer(); //Calls the BulletPlayer class
       getWorld().addObject(bulletplayer,getX()+positionX,getY()+positionY); // Adds the projectile (BulletPlayer) actor at the location of the Player's x and y coordinate
       
        
    }
    
}
