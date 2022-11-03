import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class DecreaseSpeedButton will check if the decrease speed button has been pressed, and will increase 
 * the delay increment for the sorting of the list
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class DecreaseSpeedButton extends Button
{
    int newDelay;
    
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the button was pressed.
     * If it was pressed, it will increase the delay increment for the sorting of the list.
     */
    public void act()
    {
        // Check if clicked
        if(isClicked() == true){
            // Instantiate the world
            SortingVisualization myWorld = (SortingVisualization) getWorld();
            // Increase delay by 5
            newDelay = myWorld.getDelay1Increment() + 5;
            myWorld.setDelay1Increment(newDelay);
            
            // This ensures there is a gap between the delay of when the list gets sorted, and when it is displayed on screen.
            if (myWorld.getDelay1Increment() > 5){
                // Increase delay
                newDelay = myWorld.getDelay2Increment() + 5;
                myWorld.setDelay2Increment(newDelay);
            }
        }
    }
}
