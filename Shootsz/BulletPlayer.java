
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Bullet Actor. 
 * 
 * 
 */
public class BulletPlayer extends Player
{
   
   /**
    * Moves the Bullet left because Player starts off pointing in that direction.
    */
   public void act()
   {
       move(25);
       hitEnemy();
       
    }
   /**
    * Makes bullet disappear if hits border of world
    * Makes bullet disappear if hits enemy
    */
   public void hitEnemy()
   {
       //Actor player = getOneIntersectingObject(Enemy.class);
       World myWorld = getWorld();
       //Actor enemy = getOneObjectAtOffset(0,0,Enemy.class);
       /*
       if(player !=null)
       {
           
    
           myWorld.removeObject(enemy);
           myWorld.removeObject(this);
           
           Greenfoot.playSound("hitindicator.mp3");
          
       }
       */
        if (atWorldEdge()){
        
           myWorld.removeObject(this);
           
        }
   }
   // Detects if the bullet has hit the edge of the world. If it has, it removes bullet from the world.
   public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }
    
 
}