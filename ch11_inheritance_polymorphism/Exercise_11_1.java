/**
 * (The Triangle class) Design a class named Triangle that extends 
 * GeometricObject. The class contains:
 *  ■ Three double data fields named side1, side2, and side3 with default 
 * values 1.0 to denote three sides of the triangle.
 *  ■ A no-arg constructor that creates a default triangle.
 *  ■ A constructor that creates a triangle with the specified side1, side2, and 
 * side3.
 *  ■ The accessor methods for all three data fields.
 *  ■ A method named getArea() that returns the area of this triangle.
 *  ■ A method named getPerimeter() that returns the perimeter of this triangle.
 *  ■ A method named toString() that returns a string description for the triangle.
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19.
 * The toString() method is implemented as follows:
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 * " side3 = " + side3;
 * Draw the UML diagrams for the classes Triangle and GeometricObject and 
 * implement the classes. Write a test program that prompts the user to enter three 
 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle 
 * is filled. The program should create a Triangle object with these sides and set 
 * the color and filled properties using the input. The program should display 
 * the area, perimeter, color, and true or false to indicate whether it is filled or not.
 * @author Scott M.
 */

import java.util.Date;

public class Exercise_11_1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Triangle t = new Triangle(1.0, 2.0, 3.0);
        t.setColor("Blue");
        t.setFilled(true);
        System.out.println(t);
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println(((GeometricObject)t));
    }
}

class Triangle extends GeometricObject
{
    private double side1, side2, side3;
    
    /**
     * Construct a new Triangle with 3 side lengths.
     * @param side1 double: first side length
     * @param side2 double: second side length
     * @param side3 double: third side length
     */
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Construct a default Triangle with side lengths of 1.0 each.
     */
    public Triangle()
    {
        this(1.0, 1.0, 1.0);
    }
    
    /**
     * Return the side length of side 1.
     * @return double: side length
     */
    public double getSide1()
    {
        return this.side1;
    }
    
    /**
     * Return the side length of side 2.
     * @return double: side length
     */
    public double getSide2()
    {
        return this.side2;
    }
    
    /**
     * Return the side length of side 3.
     * @return double: side length
     */
    public double getSide3()
    {
        return this.side3;
    }
    
    /**
     * Return the area of this Triangle.
     * @return double: area
     */
    public double getArea()
    {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    /**
     * Return the perimeter of the Triangle.
     * @return double: perimeter
     */
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    /**
     * Return a String with info about this triangle formatted:
     *      Triangle: side1 = <side1 length> side2 = <side2 length> side3 = <side3 length>
     * @return String: triangle info
     */
    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " +
                side3;
    }
}

class GeometricObject
{
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    /**
     * Construct a Geometric Object with a specific color and whether or not it is filled.
     * @param color String: color of Geometric Object
     * @param filled boolean: true = Geometric object is drawn filled, false otherwise
     */
    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    
    /**
     * Construct a default Geometric object colored white and not filled in.
     */
    public GeometricObject()
    {
        this("white", false);
    }
    
    /**
     * Return the color of this Geometric Object.
     * @return String: color
     */
    public String getColor()
    {
        return this.color;
    }
    
    /**
     * Set the color of this Geometric Object.
     * @param color String: color
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    
    /**
     * Check if the Geometric Object is filled.
     * @return boolean: true = Geometric Object is filled, false otherwise
     */
    public boolean isFilled()
    {
        return this.filled;
    }
    
    /**
     * Set the fill status of this Geometric Object.
     * @param filled boolean: true = Geometric object is filled, false otherwise
     */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    
    /**
     * Return the date on which this Geometric Object was created.
     * @return java.util.Date: date created
     */
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    
    /**
     * Return a String with information about this Geometric Object formatted as:
     *      Color:  <color>
     *      Filled: <fill status>
     *      <Date created>
     * @return String: Geometric Object info
     */
    public String toString()
    {
        return "Color:\t" + this.color + "\nFilled:\t" + this.filled + "\n" +
                this.dateCreated.toString();
    }
}