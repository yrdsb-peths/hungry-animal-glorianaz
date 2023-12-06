import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Gloriana Zheng
 * @version November 2023
 */
public class Strawberry extends Actor
{
    int speed = 1;
    
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove strawberry and draw game over when strawberry gets to bottom 
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            
        }

    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
