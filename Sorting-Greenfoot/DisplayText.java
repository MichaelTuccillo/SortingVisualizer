import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class DisplayText will set the image of the actor DisplayText to a string. 
 * 
 * @author Michael Tucillo 
 * @version 1.0
 * @since 2021-11-27
 */
public class DisplayText extends Actor
{
    /**
     * The method setText will take in a string that will be displayed, the size of the text and the colour of the text.
     * It will then set the image of the actor to the text with the colour and size properties.
     * @param String text is the string that will be displayed
     * @param int size is the font size of the text
     * @param Color colour is the colour of the text
     */
    public void setText(String text, int size, Color colour){
        // Set the image to null
        GreenfootImage image = null;
        // Set the image to the text with the size and colour properties
        image = new GreenfootImage(text,size, colour, null);
        this.setImage(image);
    }
}
