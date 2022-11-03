import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class SortAgainButton will check if the sort again button has been pressed, and will switch the worlds based on the result 
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class SortAgainButton extends Button
{
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the replay button was pressed.
     * If it was pressed, it will recreate the sorting screen, resetting all variables and info.
     */
    public void act()
    {
        //Check if button was pressed
        if(isClicked() == true){
            //Instantiate and set world
            SortingVisualization sortingScreen = new SortingVisualization();
            Greenfoot.setWorld(sortingScreen);
        }
    }
}
