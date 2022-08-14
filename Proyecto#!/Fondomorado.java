import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondomorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondomorado extends World
{
    public static int score=0;
    public static int muertes=3;
    /**
     * Constructor for objects of class Fondomorado.
     * 
     */
    
    public Fondomorado()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Globo n1 = new Globo ();
        addObject (new Globo(), 100,300);
        creaerenemigo(5);
        crearpersonas(2);
    }
    public void act(){
        showText("Personas rescatadas: "+ score, 120, 25);
        showText("Vidas: " + muertes, 50, 55);
    }
    public void creaerenemigo (int numero){
        score=0;
        muertes= 3;
        for(int i=0; i<numero;i++)
        {
            Enemy Enemy=new Enemy();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(Enemy, x, y);
        }
    }
    public void crearpersonas (int numero1){
        for(int i=0; i<numero1;i++)
        {
            Persona Persona=new Persona();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(Persona, x, y);
        }
    }
}
