/**
 * Class to define the point object.
 * 
 * @author Scott M.
 * Point.java
 */

public class Point
{
    private double x, y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Point()
    {
        this(0, 0);
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    public void setX(double x)
    {
        this.x = x;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }
    
    public double getDistance(double x, double y)
    {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    
    public double getDistance(Point p)
    {
        return this.getDistance(p.x, p.y);
    }
}