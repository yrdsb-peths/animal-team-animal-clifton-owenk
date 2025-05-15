import greenfoot.*;

public class GameOverScreen extends World
{
    private Actor gameOverImage = new Actor() {}; // Placeholder actor to show PNG
    private Label instructionLabel = new Label("Press <space> to return", 40);

    private boolean showImage = true;
    private SimpleTimer flashTimer = new SimpleTimer();

    public GameOverScreen()
    {
        super(600, 400, 1);

        // Optional background — remove these lines if not using a background image
        GreenfootImage bg = new GreenfootImage("images/gameover.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        // Set up the image
        GreenfootImage img = new GreenfootImage("gameover_title.png");
        gameOverImage.setImage(img);
        addObject(gameOverImage, getWidth()/2, getHeight()/2 - 30);

        // Add text label
        addObject(instructionLabel, getWidth()/2, getHeight()/2 + 80);

        flashTimer.mark();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new TitleScreen());
        }

        flashImage();
    }

    private void flashImage()
    {
        if (flashTimer.millisElapsed() > 500)
        {
            if (showImage)
                gameOverImage.setImage(new GreenfootImage(1, 1)); // Hide
            else
                gameOverImage.setImage(new GreenfootImage("gameover_title.png")); // Show

            showImage = !showImage;
            flashTimer.mark();
        }
    }
}
