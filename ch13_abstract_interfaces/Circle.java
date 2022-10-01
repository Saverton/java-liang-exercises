/** Circle class; Subclass of Geometric object, has instance data for its radius.
 * 
 * @author Scott M.
 * Circle.java
 */

public class Circle extends GeometricObject {
    private double radius = 1.0;
    
    /** Construct a default circle */
    public Circle() {
    }
    
    /** Construct a circle with a specified radius
     * @params radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /** Teturn radius.
     * @return radius
     */
    public double getRadius() {
        return (radius);
    }
    
    /** Set new radius.
     * @params radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /** Return the area of the circle.
     * @return area
     */
    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    /** Return the perimeter of the circle.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }
    
    /** Return a string with info on the circle
     * @return String
     */
    public String toString() {
        return ("Radius: " + radius);
    }
    
    /** Compares the radii of two circles 
     * @params Circle 2
     * @return 1 = larger, 0 = equal, -1 = smaller
     */
    public int compareTo(Circle c2) {
        if (radius > c2.radius) {
            return 1;
        }
        else if (radius < c2.radius) {
            return -1;
        }
        else
            return 0;
    }
    
    /** Return whether or not two circles are equal.
     * @params Circle 2
     * @return true: circles are equal, false otherwise
     */
    public boolean equals(Circle c2) {
        return (compareTo((Circle)c2) == 0);
    }
}