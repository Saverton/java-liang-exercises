/**
 * Class to define the Circle2D class.
 * 
 * @author Scott M.
 * Circle2D.java
 */

public class Circle2D
{
    private Point center;
    private double radius;
    
    public Circle2D(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }
    
    public Circle2D(double x, double y, double radius)
    {
        this(new Point(x, y), radius);
    }
    
    public Circle2D(double x, double y)
    {
        this(x, y, 1);
    }
    
    public Circle2D(Point center)
    {
        this(center, 1);
    }
    
    public Circle2D()
    {
        this(0, 0, 1);
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getX()
    {
        return this.center.getX();
    }
    
    public double getY()
    {
        return this.center.getY();
    }
    
    public Point getCenter()
    {
        return this.center;
    }
    
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    public double getPerimeter()
    {
        return Math.PI * 2 * this.radius;
    }
    
    public boolean contains(double x, double y)
    {
        return this.center.getDistance(x, y) < this.radius;
    }
    
    public boolean contains(Circle2D circle)
    {
        return this.getRadius() > circle.getRadius() && this.getCenter().getDistance(circle.center) + circle.getRadius() < this.getRadius();
    }
    
    public boolean overlaps(Circle2D circle)
    {
        double dist = this.center.getDistance(circle.center);
        return dist > Math.min(this.radius, circle.radius) && this.radius + circle.radius > dist;
    }
    
    public String toString()
    {
        return "center: " + center.toString() + " radius: " + radius;
    }
}