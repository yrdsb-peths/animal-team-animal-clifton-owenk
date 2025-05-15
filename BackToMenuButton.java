import greenfoot.*;

public class BackToMenuButton extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("back_button.png");
    private GreenfootImage img2 = new GreenfootImage("back_button2.png");
    private boolean showingFirst = true;
    private SimpleTimer animationTimer = new SimpleTimer();
    private GreenfootSound clickSound = new GreenfootSound("button_click.mp3");

    public BackToMenuButton()
    {
        img1.scale(200, 75);
        img2.scale(200, 75);
        setImage(img1);
        animationTimer.mark();
    }

    public void act()
    {
        animateButton();

        if (Greenfoot.mouseClicked(this)) {
            clickSound.play();  //Play sound when click
            Greenfoot.setWorld(new TitleScreen());
        }
    }

    private void animateButton()
    {
        if (animationTimer.millisElapsed() > 500) {
            setImage(showingFirst ? img2 : img1);
            showingFirst = !showingFirst;
            animationTimer.mark();
        }
    }
}
