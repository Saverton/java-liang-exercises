/** 
 * (IllegalTriangleException) Programming Exercise 11.1 defined the 
 * Triangle class with three sides. In a triangle, the sum of any two sides is 
 * greater than the other side. The Triangle class must adhere to this rule. 
 * Create the IllegalTriangleException class, and modify the constructor 
 * of the Triangle class to throw an IllegalTriangleException object if a 
 * triangle is created with sides that violate the rule, as follows:
 *      /** Construct a triangle with the specified sides /
 *      public Triangle(double side1, double side2, double side3)
 *          throws IllegalTriangleException {
 *          // Implement it
 *      }
 * @author Scott M.
 */

 import java.util.Date;

public class Exercise_12_5 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1, 2, 1);
            System.out.print(t);
        }
        catch(IllegalTriangleException ex) {
            System.out.print(ex);
        }
    }
}

class IllegalTriangleException extends Exception {
    /** Construct a new IllegalTriangleException. */
    public IllegalTriangleException() {
        super("Triangle side lengths are not possible");
    }
    
    /**
     * Return a message with information about the IllegalTriangleException.
     * @return String: exception info
     */
    public String getMessage() {
        return ("Triangle side lengths are not possible");
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
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
    {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Construct a default Triangle with side lengths of 1.0 each.
     */
    public Triangle() throws IllegalTriangleException
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