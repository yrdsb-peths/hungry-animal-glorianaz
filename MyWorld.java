import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * The world is where our hero lives.
 * 
 * @author Gloriana Zheng
 * @version November 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createStrawberry();
        createBomb();
        
        if(score == -1)
        {
            gameOver();
        }
    }
   

    /**
     * End the game and draw 'GameOver'
     */
    GreenfootSound gameOverSound = new GreenfootSound("womp-womp.mp3");
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        
        gameOverSound.play();
    }
    
    /**
     * Increase score 
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);

    }
    
    /**
     * Create a new Strawberry at a random location at the top of the world
     */
    public void createStrawberry()
    {
        Strawberry strawberry = new Strawberry();
        strawberry.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0;
        addObject(strawberry, x, y);
    }
    
    public void createBomb()
    {
        Bomb bomb = new Bomb();
        bomb.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bomb, x, y);
    }
    
    
    SimpleTimer bombTimer = new SimpleTimer();
    boolean gameIsOver = false;
    public void act()
    {
        if(!gameIsOver)
        {
            if(bombTimer.millisElapsed() > 20000)
            {
                bombTimer.mark();
                createBomb();
            }
        }
    }
    
}
