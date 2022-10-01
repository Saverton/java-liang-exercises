/**
 * Subclass of the Geometric Object class to define a Triangle object.
 * 
 * @author Scott M.
 * Triangle.java
 */

public class Triangle extends GeometricObject
{
    private double side1, side2, side3;
    
    /**
     * Constructor to define a Triangle object with explicit side lengths for side1,
     * side2, and side3.
     * 
     * @params (side1 length) (side2 length) (side3 length)
     */
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Default no-arg constructor to define a triangle with side lengths of 1.0.
     */
    public Triangle()
    {
        this(1.0, 1.0, 1.0);
    }
    
    /**
     * Accessor method to get side1's length
     * 
     * @return (side1 length)
     */
    public double getSide1()
    {
        return this.side1;
    }
    
    /**
     * Accessor method to get side2's length
     * 
     * @return (side2 length)
     */
    public double getSide2()
    {
        return this.side2;
    }
    
    /**
     * Accessor method to get side3's length
     * 
     * @return (side3 length)
     */
    public double getSide3()
    {
        return this.side3;
    }
    
    /**
     * Method to get the area of the Triangle.
     * 
     * @return (triangle's area)
     */
    public double getArea()
    {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    /**
     * Method to get the perimeter of the Triangle.
     * 
     * @return (triangle's perimeter)
     */
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    /**
     * Method to override Geometric Object's toString() method and add on relevant
     * information for the triangle class.
     * 
     * @return (String representing the object)
     */
    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " +
                side3;
    }
}