// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 453, 62);
        Burger burger2 =  new  Burger();
        addObject(burger2, 401, 138);
        Pig pig =  new  Pig();
        addObject(pig, 296, 205);
        Burger burger3 =  new  Burger();
        addObject(burger3, 132, 35);
        Burger burger4 =  new  Burger();
        addObject(burger4, 217, 55);
        Burger burger5 =  new  Burger();
        addObject(burger5, 108, 141);
        Burger burger6 =  new  Burger();
        addObject(burger6, 42, 306);
        Burger burger7 =  new  Burger();
        addObject(burger7, 169, 339);
        Burger burger8 =  new  Burger();
        addObject(burger8, 453, 295);
        Burger burger9 =  new  Burger();
        addObject(burger9, 330, 348);
        Snake snake =  new  Snake();
        addObject(snake, 510, 341);
    }
}
