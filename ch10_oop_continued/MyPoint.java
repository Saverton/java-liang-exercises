/**
 * Class to define data fields and behaviors for a MyPoint object. data fields x and y,
 * behaviors to construct points, get distance to another MyPoint or specified
 * x and y.
 * 
 * @author Scott M.
 */

public class MyPoint
{
    /**
     * Datafields
     */
    private double x, y;
    
    /**
     * Behaviors
     */
    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public MyPoint()
    {
        this(0.0, 0.0);
    }
    
    public double distance(double x, double y)
    {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    
    public double distance(MyPoint p)
    {
        return this.distance(p.x, p.y);
    }
}