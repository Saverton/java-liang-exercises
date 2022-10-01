/**
 * Superclass to define common data fields and methods for geometric objects
 * such as circles, rectangles, and trianges.
 * 
 * @author Scott M.
 * GeometricObject.java
 */

import java.util.Date;

public class GeometricObject
{
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    /**
     * Constructor to create a Geometric object with a specified
     * color and fill status.
     * 
     * @params (color of the geometric object) (true: object is filled, false:
     *          object is outlined)
     */
    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    
    /**
     * Overloaded no-arg constructor to create a default geometric object
     * that is white and not filled.
     */
    public GeometricObject()
    {
        this("white", false);
    }
    
    /**
     * Method to get the color of this geometric object.
     * 
     * @return (the color of the geometric object)
     */
    public String getColor()
    {
        return this.color;
    }
    
    /**
     * Method to set the color of this geometric object.
     * 
     * @params (the new color of this geometric object)
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    
    /**
     * Method to check if the geometric object is filled.
     * 
     * @return (true: the object is filled, false: the object is outlined)
     */
    public boolean isFilled()
    {
        return this.filled;
    }
    
    /**
     * Method to set whether or not the geometric object is filled.
     * 
     * @params (true: set to filled, false: set to outlined)
     */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    
    /**
     * Method to get the date this object was created in the form of a 
     * java.util.Date object.
     * 
     * @return (The date this object was created)
     */
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    
    /**
     * Method to override the default toString() method. Returns a string that
     * shows the color, whether or not the object is filled, and the date the
     * object was created.
     * 
     * @return (String representing the object)
     */
    public String toString()
    {
        return "Color:\t" + this.color + "\nFilled:\t" + this.filled + "\n" +
                this.dateCreated.toString();
    }
}