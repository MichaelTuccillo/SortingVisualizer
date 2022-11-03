import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Creates a bubble sorter that will sort a given list of blocks. It will highlight the blocks that are being compared, and make 
 * the sorted blocks a different colour.
 * @author Michael Tuccillo
 * @version 1.0
 */
public class BubbleSortVisualization extends Actor
{
    int position = 1;
    int delay = 0;
    Block lastCompBlock; 
    boolean oneComp = false;
    int numSorted = 0;
    
    
    /**
     * This method will sort the given list of blocks, and change the colours of the blocks being compared, and the blocks that have already 
     * been sorted. This is done to make understanding the sorting easier.
     * 
     * @param - blockList is the list of blocks that need to be sorted
     */
    public void sort(List blockList){
        
        // Checks if all blocks have been sorted
        if (numSorted < blockList.size()){
            // Checks if the block has not reached the bottom of the list
            if (position < blockList.size()-numSorted) {
                
                //If there has been atleast 1 comparison done
                if (oneComp == true){
                    // Set the last compared block back to the colour black
                    lastCompBlock.createDisplayImage(Color.BLACK);
                }
                
                // Gets the 2 blocks that will be compared
                Block firstBlock = (Block)blockList.get(position-1);
                Block secondBlock = (Block)blockList.get(position);
                
                // Make the 2 blocks being compared pink
                firstBlock.createDisplayImage(Color.PINK);
                secondBlock.createDisplayImage(Color.PINK);
                
                // If the First block is larger than the second one
                if ( firstBlock.getValue() > secondBlock.getValue() ) {
                    // Switch the positions
                    Object temp = blockList.get(position-1);
                    blockList.set(position-1, blockList.get(position));
                    blockList.set(position, temp); 
                }
                
                // Get the last block that was compared
                lastCompBlock = (Block)blockList.get(position-1);
                //Increase the position in the list
                position += 1;
                // This means there has been 1 comparison done
                oneComp = true;

            }
            
            // If the block has reached the bottom of the list
            if (position == blockList.size() - numSorted){
                // Get the last sorted block
                Block sortedBlock = (Block)blockList.get(position - 1);
                // Set last sorted block to blue
                sortedBlock.createDisplayImage(Color.BLUE);
                
                // Increase the number of sorted blocks, reset the position variable
                numSorted += 1;
                position = 1;
            }
        }
    }
}
