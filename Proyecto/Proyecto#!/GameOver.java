import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Reescalar el cartel
    public GameOver (){
        GreenfootImage myImage = getImage();
        int newheith = (int)myImage.getHeight()/2;
        int newwight= (int)myImage.getWidth()/4;
        myImage.scale(newheith, newwight); 
    }
    public void act()    {  
    }
}
