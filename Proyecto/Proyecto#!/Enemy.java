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
    //Reescalar el cartel
    public Enemy (){
        GreenfootImage myImage = getImage();
        int newheith = (int)myImage.getHeight()/10;
        int newwight= (int)myImage.getWidth()/10;
        myImage.scale(newheith, newwight); 
    }
    public void act()
    {
        //Hace que se mueva para la izquierda
        move(1);
        Actor Enemy = getOneObjectAtOffset(0, 0, Enemy.class);
        World m=getWorld();
        //Si toca el fondo aprarece otra vez en el mundo del otro lado 
        if(isAtEdge()){
            setLocation(0, getY());
        }
    }
}