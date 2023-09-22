import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        addObject(new pswt2(), getWidth() / 4, getHeight() / 2);
        addObject(new pswt(), getWidth() * 3 / 4, getHeight() / 2);
    }
}
