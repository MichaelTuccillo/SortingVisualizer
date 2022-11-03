import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The WhatIsBubbleSortScreen class will instantiate and display the back button and example actor. 
 * It will also display an explanation of bubble sorting
 * 
 * @author Michael Tuccillo
 * @version 1.0
 * @since 2021-11-27
 */
public class WhatIsBubbleSortScreen extends World
{

    /**
     * Constructor for WhatIsBubbleSortScreen
     * This constructor is used to create the world,
     * and display the explanation of bubbleSorting.
     */
    public WhatIsBubbleSortScreen()
    {    
        // Explanation and example from https://www.geeksforgeeks.org/bubble-sort/ 
        
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        
        // Instantiate buttons/text
        BackButton backButton = new BackButton();
        BubbleSortExample example = new BubbleSortExample();
        DisplayText explanationText = new DisplayText();
        
        // Add buttons/text to world
        this.addObject(backButton, 325, 365);
        this.addObject(explanationText, 200, 40);
        this.addObject(example, 200, 200);
        
        // The explanation
        explanationText.setText("Bubble Sort is the simplest sorting algorithm. \n It works by repeatedly swapping \n the adjacent elements if they are in the wrong order.", 20, Color.WHITE);
    }
}
