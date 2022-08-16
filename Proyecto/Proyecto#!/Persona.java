import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona extends Actor
{
    /**
     * Act - do whatever the Persona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Persona (){
        //Hace que se ve a bien la imagen
        GreenfootImage myImage = getImage();
        int newheith = (int)myImage.getHeight()/2;
        int newwight= (int)myImage.getWidth()/2;
        myImage.scale(newheith, newwight); 
    }
    public void act()
    {
        //Hace que se mueva para abajo
        setLocation(getX(), getY()+ 1);
        if(isAtEdge()){
            setLocation(getX(), 0);
        }
    }
    
}
