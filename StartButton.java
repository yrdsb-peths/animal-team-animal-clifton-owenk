import greenfoot.*;

public class StartButton extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("start_button.png");
    private GreenfootImage img2 = new GreenfootImage("start_button1.png");
    private boolean showFirst = true;
    private SimpleTimer animationTimer = new SimpleTimer();
    private GreenfootSound clickSound = new GreenfootSound("button_click.mp3");

    public StartButton()
    {
        img1.scale(240, 80);
        img2.scale(240, 80);
        setImage(img1);
        animationTimer.mark();
    }

    public void act()
    {
        animate();

        if (Greenfoot.mouseClicked(this)) {
            clickSound.play(); // optional sound
            Greenfoot.setWorld(new MyWorld());
        }
    }

    private void animate()
    {
        if (animationTimer.millisElapsed() > 400)
        {
            setImage(showFirst ? img2 : img1);
            showFirst = !showFirst;
            animationTimer.mark();
        }
    }
}
