/** Square Class; subclass of Geometric object, contains instance data for a side length.
 * 
 * @author Scott M.
 * Square.java
 */

public class Square extends GeometricObject implements Colorable {
    private double side = 1.0;
    
    /** Construct a default square. */
    public Square() {
    }
    
    /** Construct a square with a specified side length
     * @params Side length
     */
    public Square(double side) {
        this.side = side;
    }
    
    /** Return the side length.
     * @return Side length
     */
    public double getSide() {
        return (side);
    }
    
    /** Set a new side length.
     * @params Side length
     */
    public void setSide(double side) {
        this.side = side;
    }
    
    /** Return the area of the square.
     * @return Area
     */
    @Override
    public double getArea() {
        return (Math.pow(side, 2));
    }
    
    /** Return the perimeter of the square.
     * @return Perimeter
     */
    @Override
    public double getPerimeter() {
        return (4 * side);
    }
    
    /** Print how to color the Square */
    @Override
    public void howToColor() {
        System.out.print("Color all four sides.");
    }
    
    /** Return a string with info about the square.
     * @return String with square info
     */
    public String toString() {
        return ("Side: " + side);
    }
}