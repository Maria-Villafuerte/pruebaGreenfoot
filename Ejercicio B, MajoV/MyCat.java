import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        if(hasCompany() == false){
            sleep(1);
        } else{
            shoutHooray();
        }
    for (int i=0; i<4; i++) 
        {
            setImage("cat-eat.png");
            wait(8);
            setImage("cat-eat-2.png");
            wait(6);
        }
    }    
}