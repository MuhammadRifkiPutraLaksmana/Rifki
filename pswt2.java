import greenfoot.*;

/**
 * 
 */
public class pswt2 extends Actor
{
    private int speed = 2;
    private boolean shouldRemove = false;
    /**
     * Act - do whatever the pswt2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {setLocation(getX() + speed, getY());
        
        if (isTouching(pswt.class)) {
        getWorld().addObject(new duar(), getX(), getY());
        getWorld().removeObject(getOneIntersectingObject(pswt.class));
        getWorld().removeObject(this);
    }
}
}
