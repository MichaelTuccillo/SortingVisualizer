import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class SortButton will check if the sort button has been pressed, and will switch the worlds based on the result 
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class SortButton extends Button
{
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the sort button was pressed.
     * If it was pressed, it will change the world to the sorting screen.
     */
    public void act()
    {
        // Check if button was clicked
        if(isClicked() == true){
            //Instantiate and set new world
            SortingVisualization sortingScreen = new SortingVisualization();
            Greenfoot.setWorld(sortingScreen);
        }
    }
}
