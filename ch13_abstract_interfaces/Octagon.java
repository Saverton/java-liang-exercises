/** Octagon Class; subclass of Geometric object, contains instance data for the 
 * length of each side.
 * 
 * @author Scott M.
 * Octagon.java
 */

public class Octagon extends GeometricObject {
    private double side = 1.0;
    
    /** Construct a default Octagon */
    public Octagon() {
    }
    
    /** Construct an Octagon with specific side lengths
     * @params Side length
     */
    public Octagon(double side) {
        this.side = side;
    }
    
    /** Return side length
     * @return Side length
     */
    public double getSide() {
        return (side);
    }
    
    
    /** Set a new side length
     * @params Side length
     */
    public void setSide(double side) {
        this.side = side;
    }
    
    /** Return the area.
     * @return Area
     */
    @Override
    public double getArea() {
        return ((2 + (4 / Math.sqrt(2))) * Math.pow(side, 2));
    }
    
    /** Return the perimeter.
     * @return Perimeter
     */
    @Override
    public double getPerimeter() {
        return (8 * side);
    }
    
    /** Compare this Octagon to another Octagon.
     * @params Octagon 2
     * @return 1 = larger, -1 = smaller, 0 = equal
     */
    public int compareTo(Octagon o2) {
        if (side > o2.side)
            return 1;
        else if (side < o2.side)
            return -1;
        else
            return 0;
    }
}