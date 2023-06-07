import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // A if (Greenfoot.isKeyDown("left"))  
        {
            deltaX = deltaX = -1;
            setRotation(180);
        }

        if (Greenfoot.isKeyDown("right"))  
        {
            deltaX = deltaX  = + 1;
            setRotation(0);
        }

        if (Greenfoot.isKeyDown("up"))  
        {
            deltaY = deltaY = -1;
            setRotation(270);
        }

        if (Greenfoot.isKeyDown("down"))  
        {
            deltaY = deltaY = +1;
            setRotation(90);
        }

    }
}
