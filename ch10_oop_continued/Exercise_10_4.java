/**
 * (The MyPoint class) Design a class named MyPoint to represent a point with 
 * x- and y-coordinates. The class contains:
 *  ■ The data fields x and y that represent the coordinates with getter 
 * methods.
 *  ■ A no-arg constructor that creates a point (0, 0).
 *  ■ A constructor that constructs a point with specified coordinates.
 *  ■ A method named distance that returns the distance from this point to a 
 * specified point of the MyPoint type.
 *  ■ A method named distance that returns the distance from this point to 
 * another point with specified x- and y-coordinates.
 * Draw the UML diagram for the class and then implement the class. Write a 
 * test program that creates the two points (0, 0) and (10, 30.5) and displays the 
 * distance between them.
 * @author Scott M.
 */

public class Exercise_10_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        
        System.out.print("Distance between p1 and p2 is " + p1.distance(p2));
    }
}

class MyPoint
{
    private double x, y;
    
    /**
     * Construct a new MyPoint object with a specified X and Y coordinate.
     * @param x double: x position
     * @param y double: y position
     */
    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Construct a new default MyPoint object with x and y position of (0.0, 0.0)
     */
    public MyPoint()
    {
        this(0.0, 0.0);
    }

    /**
     * Return the distance between this MyPoint and an x, y coordinate.
     * @param x double: x coordinate of other point
     * @param y double: y coordinate of other point
     * @return double: distance between points
     */
    public double distance(double x, double y)
    {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    
    /**
     * Return the distance between this MyPoint object and other MyPoint obejct.
     * @param p MyPoint: other point to check distance to
     * @return double: distance between points
     */
    public double distance(MyPoint p)
    {
        return this.distance(p.x, p.y);
    }
}