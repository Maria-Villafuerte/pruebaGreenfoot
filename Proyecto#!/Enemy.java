import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Mari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy (){
        GreenfootImage myImage = getImage();
        int newheith = (int)myImage.getHeight()/10;
        int newwight= (int)myImage.getWidth()/10;
        myImage.scale(newheith, newwight); 
    }
    public void act()
    {
        move(-1);
    }
}