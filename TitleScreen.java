import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Lin 
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 225, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act(){
        //Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space")){
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
        addObject(elephant,490,100);
        Label label = new Label("Use \u2190 and \u2192 to move", 50);
        addObject(label,300,200);
        Label label2 = new Label("Press <space> to start", 50);
        addObject(label2,300,290);
        elephant.setLocation(461,101);
    }
}
