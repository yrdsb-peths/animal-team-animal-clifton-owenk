import greenfoot.*;

public class BackToMenuButton extends Actor
{
    private GreenfootImage normalImage = new GreenfootImage("back_button2.png"); // now default
    private GreenfootImage hoverImage = new GreenfootImage("back_button.png");   // now on hover
    private GreenfootSound clickSound = new GreenfootSound("button_click.mp3");

    public BackToMenuButton()
    {
        normalImage.scale(200, 75);
        hoverImage.scale(200, 75);
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

        // Click action
        if (Greenfoot.mouseClicked(this)) {
            clickSound.play();
            Greenfoot.setWorld(new TitleScreen());
        }
    }
}
