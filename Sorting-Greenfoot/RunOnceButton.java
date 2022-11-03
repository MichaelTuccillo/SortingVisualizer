import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class RunOnceButton will check if the run once button has been pressed, and will do one step of the sorting if the button was clicked.
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class RunOnceButton extends Button
{
    PausePlayButton pausePlayButton = new PausePlayButton();
    int time;
    boolean runOnce = false;
    
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the run once button was pressed.
     * If it was pressed, it will do one step of the sorting.
     */
    public void act()
    {
        // Check if button was pressed, and list sorting is paused
        if(isClicked() == true && pausePlayButton.getPause() == true){
            runOnce = true;
            
            //Instantiate world
            SortingVisualization myWorld = (SortingVisualization) getWorld();
            
            //Get time and set the delay to time, causing list to be sorted once
            time = myWorld.getTimer();
            myWorld.setDelay1(time);
        }
    }
    
    /**
     * This method will return the value of RunOnce
     * @return boolean runOnceIn is a boolean determing if run once is true or false
     */
    public boolean getRunOnce(){
        return runOnce;
    }
    
    /**
     * This method will take in a boolean stating if run once is true or false. It will then set run once to that value.
     * @param boolean runOnceIn is a boolean determing if run once is true or false
     */
    public void setRunOnce(boolean runOnceIn){
        runOnce = runOnceIn;
    }
}
