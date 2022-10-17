/**
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides 
 * have the same length and all angles have the same degree (i.e., the polygon is 
 * both equilateral and equiangular). Design a class named RegularPolygon that 
 * contains:
 *  ■ A private int data field named n that defines the number of sides in the polygon 
 *    with default value 3.
 *  ■ A private double data field named side that stores the length of the side with 
 *    default value 1.
 *  ■ A private double data field named x that defines the x-coordinate of the polygon’s 
 *    center with default value 0.
 *  ■ A private double data field named y that defines the y-coordinate of the polygon’s 
 *    center with default value 0.
 *  ■ A no-arg constructor that creates a regular polygon with default values.
 *  ■ A constructor that creates a regular polygon with the specified number of sides 
 *    and length of side, centered at (0, 0).
 *  ■ A constructor that creates a regular polygon with the specified number of sides, 
 *    length of side, and x- and y-coordinates.
 *  ■ The accessor and mutator methods for all data fields.
 *  ■ The method getPerimeter() that returns the perimeter of the polygon.
 *  ■ The method getArea() that returns the area of the polygon. The formula for 
 *   computing the area of a regular polygon is:
 *                  n * s^2
 *      Area = -----------------
 *              4 * tan(PI / n)
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that creates three RegularPolygon objects, created using the no-arg 
 * constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
 * 4, 5.6, 7.8). For each object, display its perimeter and area.
 * @author Scott M.
 */

public class Exercise_9_9 {
     /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        RegularPolygon[] rp = new RegularPolygon[3];
        rp[0] = new RegularPolygon();
        rp[1] = new RegularPolygon(6, 4);
        rp[2] = new RegularPolygon(10, 4, 5.6, 7.8);
        
        for (int i = 0; i < rp.length; i++)
        {
           System.out.println(rp[i]);
        }
    }
}

class RegularPolygon
{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    /**
     * Construct a Regular polygon with specific number of sides, side lengths, x position, and y position.
     * @param n int: number of sides
     * @param side double: side length
     * @param x double: x position
     * @param y double: y position
     */
    public RegularPolygon(int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Construct a Regular polygon with specific number of sides and side lengths.
     * @param n int: number of sides
     * @param side double: side length
     */
    public RegularPolygon(int n, double side)
    {
        this(n, side, 0, 0);
    }
    
    /**
     * Construct a default Regular polygon with 3 sides, side length of 1, and a positon of (0, 0).
     */
    public RegularPolygon()
    {
        this(3, 1, 0, 0);
    }
    
    /**
     * return the number of sides.
     * @return int: number of sides
     */
    public int getN()
    {
        return this.n;
    }
    
    /**
     * return the side lengths.
     * @return double: side lengths
     */
    public double getSides()
    {
        return this.side;
    }
    
    /**
     * return x positon of Regular Polygon.
     * @return double: x position
     */
    public double getX()
    {
        return this.x;
    }
    
    /**
     * return y position of Regular Polygon.
     * @return double: y position
     */
    public double getY()
    {
        return this.y;
    }
    
    /**
     * set the number of sides of the Regular polygon
     * @param n int: number of sides
     */
    public void setN(int n)
    {
        this.n = n;
    }
    
    /**
     * Set the side lengths of the Regular Polygon.
     * @param side double: side length
     */
    public void setSides(double side)
    {
        this.side = side;
    }
    
    /**
     * Set the x and y position of the Regular Polygon.
     * @param x double: x position
     * @param y double: y position
     */
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Return the perimeter of the Regular Polygon.
     * @return double: perimeter of Regular Polygon
     */
    public double getPerimeter()
    {
        return side * n;
    }
    
    /**
     * Return the area of the Regular Polygon.
     * @return double: area of Regular Polygon
     */
    public double getArea()
    {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    /**
     * Return a String with the Perimeter and Area of the Regular Polygon.
     * @return String: Perimeter and Area of Regular Polygon
     */
    public String printPolygon()
    {
        return "Perimeter: " + getPerimeter() + "\tArea: " + getArea();
    }
}