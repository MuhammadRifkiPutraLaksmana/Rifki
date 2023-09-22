import greenfoot.*;

/**
 * 
 */
public class duar extends Actor
{
    private int age = 0;
    /**
     * Act - do whatever the duar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        age++;
        if (age >= 20) {
            getWorld().removeObject(this);
    }
}
}
