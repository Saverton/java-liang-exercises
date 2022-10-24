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