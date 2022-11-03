import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class PausePlayButton will check if the run pause/play button has been pressed, and controls the variable pause which determines
 * if the sorting should be paused or playing
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class PausePlayButton extends Button
{
    boolean pause = true;
    
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the pause/play button was pressed.
     * If it was pressed, it will either set pause to true or false depending on the current state of the program.
     */    
    public void act()
    {
        // Check if it was clicked
        if(isClicked() == true){
            // If sorting is paused set it to play (unpaused)
            if (pause == true){
                pause = false;
            }
            // If sorting is not paused, pause the sorting
            else if (pause == false){
                pause = true;
            }
        }
    }
    
    /**
     * This method will return the value of pause
     * @return boolean pause is a boolean that controls if the program should pause or play the sorting.
     */
    public boolean getPause(){
        return pause;
    }
}
