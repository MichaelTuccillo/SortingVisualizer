import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The StartScreen class will instantiate and display 2 buttons, 
 * the button that leads the user to an explanation of bubble sorting, and the Sort button. This is the first world of the program.
 * 
 * @author Michael Tuccillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class StartScreen extends World
{

    /**
     * Constructor for class StartScreen.
     * This constructor is used to create the world and instantiate the Sort and bubble explanation button.
     * It will also display the buttons
     */
    public StartScreen()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        
        // Instantiates buttons/text
        DisplayText titleMessage = new DisplayText();
        WhatIsBubbleButton bubbleExplainButton = new WhatIsBubbleButton();
        SortButton sortButton = new SortButton();
        
        // Adds them to world
        this.addObject(sortButton, 200, 300);
        this.addObject(bubbleExplainButton, 200, 200);
        this.addObject(titleMessage, 200, 100);
        
        // Set title text
        titleMessage.setText("Bubble Sorter", 75,   Color.BLACK);
    }
}
