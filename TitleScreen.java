import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Lin, Kung
 * @version May 2025
 */
public class TitleScreen extends World
{
    private GreenfootImage[] bgFrames = new GreenfootImage[7]; // 7 frames
    private int bgIndex = 0;
    private SimpleTimer bgTimer = new SimpleTimer();
    private StartButton startButton;

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        
        TitleImage chineseTitle = new TitleImage();
        addObject(chineseTitle, getWidth()/2, getHeight()/2-70);
        
        //Add startButton
        StartButton startButton = new StartButton();
        addObject(startButton, getWidth()/2, getHeight()-50);
        
        for(int i=0; i<bgFrames.length; i++)
        {
            bgFrames[i] = new GreenfootImage("title_bg" + (i + 1) + ".png");
            bgFrames[i].scale(getWidth(), getHeight());
        }
        setBackground(bgFrames[0]);
        bgTimer.mark();
    } 

    /**
     * The main world act loop
     */
    public void act()
    {
        //background animation
        if(bgTimer.millisElapsed()>400)
        {
            bgIndex = (bgIndex +1) % bgFrames.length;
            setBackground(bgFrames[bgIndex]);
            bgTimer.mark();
        }
    }
}
