import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Lin 
 * @version April 2025
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public Apple() 
    {
        GreenfootImage image = new GreenfootImage("images/apple1.png");
        image.scale(50, 50); // Width, Height
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd){
        speed = spd;
    }
}
