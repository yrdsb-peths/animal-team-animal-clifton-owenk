import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Lin
 * @version April 2025
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
    public MyWorld() {
        super(600, 400, 1, false);
        
        //Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        
        setBackground("images/background.png");
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0){
            level++;
        }
    }
    
    /**
    * Create a new apple at random location at top of the screen.
    */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    /**
     * Updates the elephant's speed
     */
    public void updateElephantSpeed(Elephant elephant){
        elephant.setSpeed(level + 1);
    }
}


