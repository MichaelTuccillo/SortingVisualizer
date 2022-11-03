import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Creates a world which can be used to visualize sorting methods by arranging "blocks" on 
 * the screen.  Each block is it's own object and has a value associated with it.  This value
 * is represented visually by it's width and a number display.
 * 
 * This might help you when programming - https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * 
 * 
 * @author C. Brooks-Prenger
 * @version 1.0
 */
public class SortingVisualization extends World
{
    int maxOfRange;  //Largest value for block (can't be less than 1)
    List blockList;  //List containing all of the block objects
    boolean debug = false;           //Shows extra info and debugging statements if true.
    BubbleSortVisualization sort = new BubbleSortVisualization();
    int timer = 0;
    int delay1 = 0;
    int delay2 = 0;
    int delay1Increment = 30;
    int delay2Increment = 5;
    
    // Instantiate objects
    PausePlayButton pausePlayButton = new PausePlayButton();
    DecreaseSpeedButton lowerSpeedButton = new DecreaseSpeedButton();
    IncreaseSpeedButton increaseSpeedButton = new IncreaseSpeedButton();
    RunOnceButton runOnceButton = new RunOnceButton();
    SortAgainButton newSort = new SortAgainButton();
    DisplayText speedMessage = new DisplayText();
    BackButton backButton = new BackButton();
    
    /**
     * Constructor for objects of class SortingVisualization.
     * 
     */
    public SortingVisualization()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        
        // Add buttons to world
        this.addObject(runOnceButton, 340, 275);
        this.addObject(pausePlayButton, 340, 350);
        this.addObject(lowerSpeedButton, 60, 350);
        this.addObject(increaseSpeedButton, 60, 275);
        this.addObject(newSort, 60, 50);
        this.addObject(speedMessage, 60, 220);
        this.addObject(backButton, 340, 50);
        
        // Set text showing speed of sort
        speedMessage.setText("Time to Sort: " + delay1Increment, 20,   Color.BLACK);
        
        maxOfRange = 100;       //Set the block values to range between 0 and 100 (exclusive)
        int numNewBlocks = 20;  //Note, 133 blocks maximum. Adding 134 blocks or more causes problems...bug in my code or a greenfoot limitation? Not sure and don't have the time to find out.
        
        if (debug) System.out.println("Generate the blocks for the world.");
        if (debug) System.out.println("maxOfRange: "+maxOfRange+ "   numNewBlocks: " + numNewBlocks);
        
        int sizeBlock = this.getHeight()/numNewBlocks;
        if (debug) System.out.println("sizeBlock: "+sizeBlock);
        
        //Create block objects and assign them to a list
        blockList = new ArrayList();
        for (int i = 0; i < numNewBlocks; i++) {
            blockList.add(new Block(sizeBlock,getWidth()-200,Greenfoot.getRandomNumber(maxOfRange),maxOfRange,debug)); 
            addObject( (Actor)blockList.get( blockList.size()-1 ),  getWidth()/2, (i*sizeBlock)+(sizeBlock/2) );
        }
            
        displayList();
    }
    
    /**
     * Display the list of blocks on the screen in same order as they are stored in the list
     */
    public void displayList() {
        int sizeBlock = this.getHeight()/blockList.size();
        for (int i = 0; i < blockList.size(); i++) {
            Block currentBlock = (Block)blockList.get(i);
            currentBlock.setLocation(getWidth()/2, (i*sizeBlock)+(sizeBlock/2) );
        }
        
    }
    
    /**
     * Return the max value that the block are able to have
     * 
     * @return The maximum integer value the blocks are allowed to have
     */
    public int getMaxOfRange() {
        return maxOfRange;
    }
    
    /**
     * Return the list of blocks
     * 
     * @return The list of blocks to be sorted
     */
    public List getBlockList() {
        return blockList;
    }
    
    /**
     * Sets the first delay increment
     * 
     * @param - delay is size of the delay increment
     */
    public void setDelay1Increment(int delay){
        delay1Increment = delay;
    }
    
    /**
     * Sets the second delay increment
     * 
     * @param - delay is size of the delay increment
     */
    public void setDelay2Increment(int delay){
        delay2Increment = delay;
    }
    
    /**
     * Returns the first delay increment
     * 
     * @return the first delay increment
     */
    public int getDelay1Increment(){
        return delay1Increment;
    }
    
    /**
     * Returns the second delay increment
     * 
     * @return the second delay increment
     */
    public int getDelay2Increment(){
        return delay2Increment;
    }
    
    /**
     * Sets the first delay 
     * 
     * @param - delay is size of the delay 
     */
    public void setDelay1(int delay){
        delay1 = delay;
    }
    
    /**
     * Returns the timer
     * 
     * @return the timer
     */
    public int getTimer(){
        return timer;
    }
    
    /**
     * This Act method is called constantly and will call on the sorter after a certain delay period.
     * 
     */
    public void act(){
        // Set text diplaying speed of sort
        speedMessage.setText("Time to Sort: " + delay1Increment, 20,   Color.BLACK);
        
        // If the sorting is not paused
        if (pausePlayButton.getPause() == false){
            // Make run once button somewhat transparent
            runOnceButton.getImage().setTransparency(100);
        }
        // Else if the sorting is paused
        else if (pausePlayButton.getPause() == true){
            // Make run once button not transparent
            runOnceButton.getImage().setTransparency(255);
        }
        
        // If the sorting is not paused, or user chose to do one step of sort
        if (pausePlayButton.getPause() == false || runOnceButton.getRunOnce() == true){
            // Increase the time
            timer += 1;
            
            // Checks if the delay is over
            if (delay1 <= timer){
                // Call on sorter
                sort.sort(blockList);
                
                // Increase the delay
                delay1 += delay1Increment;
                
                // Checks if the run once button is false
                if (runOnceButton.getRunOnce() == false){
                    // Increase delay that shows sorted list
                    delay2 = timer + delay2Increment;
                }
                // If the run once button is true
                else if (runOnceButton.getRunOnce() == true){
                    // Set delay2 to the timer, causing the delay period to be over
                    delay2 = timer;
                }
            }
            
            // If the delay to show updated list is over
            if (delay2 == timer){
                // Show updated list
                displayList();
                // If run once was true, set it to false
                if (runOnceButton.getRunOnce() == true){
                    runOnceButton.setRunOnce(false);
                }
            }
        }
    }
}
