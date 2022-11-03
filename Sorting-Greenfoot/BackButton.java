import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class BackButton will check if the back button has been pressed, and will switch the worlds based on the result 
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class BackButton extends Button
{
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the back button was pressed.
     * If it was pressed, it will change the world back to the StartScreen.
     */
    public void act()
    {
        // If button was pressed
        if(isClicked() == true){
            // Instantiate the startScreen and set the world to it
            StartScreen startScreen = new StartScreen();
            Greenfoot.setWorld(startScreen);
        }
    }
}
