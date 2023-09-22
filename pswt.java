import greenfoot.*;

/**
 * 
 */
public class pswt extends Actor
{
    private int speed = 2;
    private boolean shouldRemove = false;
    /**
     * Act - do whatever the pswt wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { setLocation(getX() - speed, getY());
        
        if (isTouching(pswt2.class)) {
        getWorld().addObject(new duar(), getX(), getY());
        getWorld().removeObject(this);
        getWorld().removeObject(getOneIntersectingObject(pswt2.class));
    }
}
}