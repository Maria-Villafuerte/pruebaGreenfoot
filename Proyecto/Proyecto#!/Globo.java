import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Globo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Globo extends Actor
{
    Fondomorado thisGame;
    //Hace que la imagen se vea bien
    public Globo (){
        GreenfootImage myImage = getImage();
        int newheith = (int)myImage.getHeight()/8;
        int newwight= (int)myImage.getWidth()/8;
        myImage.scale(newheith, newwight);
        
    }
    public void act(){
        //acciones para que el usuario peude mover el globo
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+ 3);
            pegar();
            rescatar();
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
            pegar ();
            rescatar();
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 3, getY());
            pegar();
            rescatar();
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 3, getY());
            pegar();
            rescatar();
        }
    }
    public void pegar(){
        //Hace que cada que toca un enemigo este desaparezca
        Actor Enemy = getOneObjectAtOffset(0, 0, Enemy.class);
        if (Enemy!=null){
            getWorld().removeObject(Enemy);
            thisGame.muertes --;
        }
    }
     public void rescatar(){
         //Hace que cada que toca una persona esta desaparece
        Actor Persona = getOneObjectAtOffset(0, 0, Persona.class);
        if (Persona!=null){
            getWorld().removeObject(Persona);
            thisGame.score ++;
        }
    }
   // public void contador(){
     //   Actor Enemy = getOneIntersectingObject(Enemy.class)
    
}
