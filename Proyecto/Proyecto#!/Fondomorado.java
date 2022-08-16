import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondomorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondomorado extends World
{
    //Contadores que aparecen a la izquierda de la pantalla
    public static int score=0;
    public static int muertes=5;
    
    GreenfootSound myMusic = new GreenfootSound("Lofi.wav");
    public Fondomorado()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject (new Globo(), 500,200);
        //Usa la función de abajo para crear enemigos
        creaerenemigo(2);
        crearpersonas(4);        
    }
    public void act(){
        showText("Personas rescatadas: "+ score, 120, 25);
        showText("Vidas: " + muertes, 50, 55);
        //Música
        myMusic.play();
        //Hace que si ve que los contadores llegar a un punto imprimen los carteles 
        if (muertes==0){
            addObject (new GameOver(), 300,200);
            Greenfoot.stop();
        }
        if (score==8){
            addObject (new youwin(), 300,200);
            Greenfoot.stop();
        }
    }
    public void creaerenemigo (int numero){
        score=0;
        muertes= 3;
        addObject (new Enemy(), 400,100);
        addObject (new Enemy(), 300,25);
        addObject (new Enemy(), 150,100);
        addObject (new Enemy(), 400,300);
        addObject (new Enemy(), 20,300);
        addObject (new Enemy(), 0,50);
        addObject (new Enemy(), 0,220);
        addObject (new Enemy(), 200,200);
        addObject (new Enemy(), 100,170);
        addObject (new Enemy(), 300,370);
        //añadir enemigos en lugares randoms cuando se reinicia el juego
        for(int i=0; i<numero;i++)
        {
          Enemy Enemy=new Enemy();
          int x=Greenfoot.getRandomNumber(300);
          int y=Greenfoot.getRandomNumber(400);
          addObject(Enemy, x, y);
        }
    }
    public void crearpersonas (int numero1){
        //añadir personas en lugares randoms cuando se reinicia el juego
        addObject (new Persona(), 100,0);
        addObject (new Persona(), 200,0);
        addObject (new Persona(), 300,0);
        addObject (new Persona(), 400,0);
        for(int i=0; i<numero1;i++)
        {
            Persona Persona=new Persona();
            int x=Greenfoot.getRandomNumber(600);
            int y=Greenfoot.getRandomNumber(50);
            addObject(Persona, x, y);
        }
    
    }
 }
