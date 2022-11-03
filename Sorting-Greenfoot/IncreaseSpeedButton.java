import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class IncreaseSpeedButton will check if the increase speed button has been pressed, and will decrease 
 * the delay increment for the sorting of the list
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class IncreaseSpeedButton extends Button
{
    int newDelay;
    
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the button was pressed.
     * If it was pressed, it will decrease the delay increment for the sorting of the list.
     */
    public void act()
    {
        // Check if clicked
        if(isClicked() == true){
            // Instantiate the world
            SortingVisualization myWorld = (SortingVisualization) getWorld();
            
            // If the delay increment is not already at the lowest it can be
            if (myWorld.getDelay1Increment() != 0){
                // Get the current delay increment and call on a function that will set the new delay increment
                newDelay = myWorld.getDelay1Increment() - 1;
                myWorld.setDelay1Increment(newDelay);
            }
            
            // If the delay increment is not already at the lowest it can be
            if (myWorld.getDelay2Increment() != 0){
                // Get the current delay increment and call on a function that will set the new delay increment
                newDelay = myWorld.getDelay2Increment() - 1;
                myWorld.setDelay2Increment(newDelay);
            }
        }
    }
}
