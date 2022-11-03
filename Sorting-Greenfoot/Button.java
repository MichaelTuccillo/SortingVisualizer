import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class Button will check if a button has been pressed and return the result 
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class Button extends Actor
{
    /**
     * This method will see if the button was pressed
     * @return boolean This will return false or true based on whether the mouse was clicked
     */
    public boolean isClicked(){
         return (Greenfoot.mouseClicked(this));
    }
}
