import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class WhatIsBubbleButton will check if the bubble explanation button has been pressed, and will switch the worlds based on the result.
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class WhatIsBubbleButton extends Button
{
    /**
     * This Act method is called constantly and will call on the isClicked method to see whether or not the What Is Bubble Sort button was pressed.
     * If it was pressed, it will change the world to the bubble sort explanation screen.
     */
    public void act()
    {
        // Check if button was pressed
        if(isClicked() == true){
            //Instantiate and change the world
            WhatIsBubbleSortScreen bubbleExplainScreen = new WhatIsBubbleSortScreen();
            Greenfoot.setWorld(bubbleExplainScreen);
        }
    }
}
