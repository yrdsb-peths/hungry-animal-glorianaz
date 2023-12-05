import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This drops a bomb from the sky and damages the elephant which results in 
 * Game Over
 * 
 * @author Gloriana Zheng
 * @version December 2023
 */
public class Bomb extends Actor
{
    int bombSpeed = 1;
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
        
        // Remove strawberry and draw game over when strawberry gets to bottom 
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= elephant.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }

    }
    
    public void setSpeed(int bombSpd)
    {
        bombSpeed = bombSpd;
    }
}
