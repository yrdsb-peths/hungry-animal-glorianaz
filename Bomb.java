import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bomb falls from the top and if the elephant touches it
 * it creates an automatic game over. 
 * 
 * @author Gloriana Zheng
 * @version December 2023
 */

public class Bomb extends Actor
{
    int bombSpeed = 0;
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + bombSpeed;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            
            world.createBomb();
        }
        
    }  
    
    public void setSpeed(int bombSpd)
    {
        bombSpeed = bombSpd;
    }
     
    
}
