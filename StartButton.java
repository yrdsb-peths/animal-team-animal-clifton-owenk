import greenfoot.*;

public class StartButton extends Actor
{
    private GreenfootImage normalImage = new GreenfootImage("start_button1.png");
    private GreenfootImage hoverImage = new GreenfootImage("start_button.png");
    private GreenfootSound clickSound = new GreenfootSound("button_click.mp3");

    public StartButton()
    {
        normalImage.scale(240, 80);
        hoverImage.scale(240, 80);
        setImage(normalImage);
    }

    public void act()
    {
        // Hover effect
        if (Greenfoot.mouseMoved(this)) {
            setImage(hoverImage);
        } else if (Greenfoot.mouseMoved(null)) {
            setImage(normalImage);
        }

        // Click 
        if (Greenfoot.mouseClicked(this)) {
            clickSound.play();
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
