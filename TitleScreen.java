import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Gloriana Zheng
 * @version December 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 55);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2 + 50, getHeight()/2 - 30);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start game if user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 90, getHeight()/2);
        Label label1 = new Label("Press Space to Play!", 35);
        addObject(label1, getWidth()/2 + 50, getHeight()/2 + 30);
        Label label2 = new Label("Use \u21e6 and \u21e8 to Move", 30);
        addObject(label2, getWidth()/2 + 60, getHeight()/2 + 65);
        
    }
}
