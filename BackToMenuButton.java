import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackToMenuButton extends Actor
{
 
    public BackToMenuButton()
    {
        GreenfootImage img = new GreenfootImage("back_button.png");
        img.scale(200, 75);
        setImage(img);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
    }
}
