/** Rectangle class; subclass of Geometric Object, contains instance data for width
 * and height.
 * 
 * @author Scott M.
 * Rectangle.java
 */

public class Rectangle extends GeometricObject {
    private double width = 1.0, height = 1.0;
    
    /** Construct a default rectangle */
    public Rectangle() {
    }
    
    /** Construct a rectangle with a specified width and height.
     * @params Width, Height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    /** Return the width.
     * @return width
     */
    public double getWidth() {
        return (width);
    }
    
    /** Return the height.
     * @return height
     */
    public double getHeight() {
        return (height);
    }
    
    /** Set a new width.
     * @params width
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    /** Set a new height.
     * @params height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /** Return the area.
     * @return area
     */
    @Override
    public double getArea() {
        return (width * height);
    }
    
    /** Return the perimeter.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return (2 * width + 2 * height);
    }
    
    /** Check if the rectangle is equal to another rectangle object
     * @params Rectangle 2
     * @return true if rectangles are equal, false otherwise
     */
    public boolean equals(Rectangle r2) {
        return (compareTo(r2) == 0);
    }
}