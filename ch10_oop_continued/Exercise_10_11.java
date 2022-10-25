/**
 * (Geometry: the Circle2D class) Define the Circle2D class that contains:
 *  ■ Two double data fields named x and y that specify the center of the circle 
 *    with getter methods.
 *  ■ A data field radius with a getter method.
 *  ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
 *    for radius.
 *  ■ A constructor that creates a circle with the specified x, y, and radius.
 *  ■ A method getArea() that returns the area of the circle.
 *  ■ A method getPerimeter() that returns the perimeter of the circle.
 *  ■ A method contains(double x, double y) that returns true if the 
 *    specified point (x, y) is inside this circle (see Figure 10.21a).
 *  ■ A method contains(Circle2D circle) that returns true if the specified 
 *    circle is inside this circle (see Figure 10.21b).
 *  ■ A method overlaps(Circle2D circle) that returns true if the specified 
 *    circle overlaps with this circle (see Figure 10.21c).
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
 * displays its area and perimeter, and displays the result of c1.contains(3,
 * 3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
 * Circle2D(3, 5, 2.3)).
 * @author Scott M.
 */

public class Exercise_10_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        
        System.out.println("Area is " + c1.getArea() + " and perimeter is " + c1.getPerimeter());
        System.out.println("Contains 3, 3, 1? " + c1.contains(new Circle2D(3, 3)));
        System.out.println("Contains 4, 5, 10.5? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Overlaps 3, 5, 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D
{
    private Point center;
    private double radius;
    
    /**
     * Construct a new Circle2d with a specific center point and radius.
     * @param center Point: center point
     * @param radius double: radius
     */
    public Circle2D(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }
    
    /**
     * Construct a new Circle2d with a specific center x, y coordinate, and radius.
     * @param x double: center x coordinate
     * @param y double: center y cooridnate
     * @param radius double: radius
     */
    public Circle2D(double x, double y, double radius)
    {
        this(new Point(x, y), radius);
    }
    
    /**
     * Construct a new Circle2d with a specific center x and y coordinate and a radius of 1.
     * @param x double: center x coordinate
     * @param y double: center y coordinate
     */
    public Circle2D(double x, double y)
    {
        this(x, y, 1);
    }
    
    /**
     * Construct a new Circle2d with a specific center point and radius of 1.
     * @param center Point: center point
     */
    public Circle2D(Point center)
    {
        this(center, 1);
    }
    
    /**
     * Construct a default Circle2d with center at (0, 0) and radius of 1.
     */
    public Circle2D()
    {
        this(0, 0, 1);
    }
    
    /**
     * Return the radius of the circle.
     * @return double: radius
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Return x coordinate of circle center.
     * @return double: center x coordinate
     */
    public double getX()
    {
        return this.center.getX();
    }
    
    /**
     * Return y coordinate of circle center.
     * @return double: center y coordinate
     */
    public double getY()
    {
        return this.center.getY();
    }
    
    /**
     * Return the center point of the circle.
     * @return Point: center point
     */
    public Point getCenter()
    {
        return this.center;
    }
    
    /**
     * Return the area of the circle.
     * @return double: circle area
     */
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    /**
     * Return the perimeter of the circle.
     * @return double: circle perimeter
     */
    public double getPerimeter()
    {
        return Math.PI * 2 * this.radius;
    }
    
    /**
     * Check if a circle contains a point given it's x and y coordinates.
     * @param x double: point x coordinate
     * @param y double: point y coordinate
     * @return boolean: true = circle contains this point, false otherwise
     */
    public boolean contains(double x, double y)
    {
        return this.center.getDistance(x, y) < this.radius;
    }
    
    /**
     * Check if a circle contains another Circle2d object.
     * @param circle Circle2D: other circle
     * @return boolean: true = this circle contains the other circle, false otherwise
     */
    public boolean contains(Circle2D circle)
    {
        return this.getRadius() > circle.getRadius() && this.getCenter().getDistance(circle.center) + circle.getRadius() < this.getRadius();
    }
    
    /** Check if a circle overlaps another Circle2D object.
     * @param circle Circle2D: other circle
     * @return boolean: true = this circle overlaps the other circle, false otherwise
     */
    public boolean overlaps(Circle2D circle)
    {
        double dist = this.center.getDistance(circle.center);
        return dist > Math.min(this.radius, circle.radius) && this.radius + circle.radius > dist;
    }
}

class Point
{
    private double x, y;
    
    /**
     * Construct a new Point with a specific x and y coordinate.
     * @param x double: x position
     * @param y double: y position
     */
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Construct a default point at 0, 0.
     */
    public Point()
    {
        this(0, 0);
    }
    
    /**
     * Return the x position of the point.
     * @return double: x position
     */
    public double getX()
    {
        return this.x;
    }
    
    /**
     * Return the y position of the point.
     * @return double: y position
     */
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Set the x position of the Point.
     * @param x double: x position
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**
     * Set the y position of the Point.
     * @param y double: y position
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**
     * Return the distance between this point and another x and y position.
     * @param x double: x position
     * @param y double: y position
     * @return double: distance
     */
    public double getDistance(double x, double y)
    {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    
    /**
     * Return the distance between this Point and another Point.
     * @param p Point: other point
     * @return double: distance
     */
    public double getDistance(Point p)
    {
        return this.getDistance(p.x, p.y);
    }
    
    /**
     * Return a String with information about the Point formatted as:
     *      [<x>, <y>]
     * @return String: Point info
     */
    public String toString()
    {
        return "[" + x + ", " + y + "]";
    }
}