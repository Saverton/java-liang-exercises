/** Driver class to test implementation of the Geometric object class and its child
 * classes by creating an array of Geometric objects and summing the area of each
 * element.
 * 
 * @author Scott M.
 * GeometricObjectArray.java
 */

public class GeometricObjectArray {
    /** Main method to run program. */
    public static void main(String[] args) {
        GeometricObject[] arr = 
            {new Triangle(3.0, 4.0, 5.0), new Circle(5.0), new Rectangle(4.0, 5.0),
             new Octagon(2.0)};
        System.out.println("Total area of the objects is " + sumArea(arr));
    }
    
    /** Return the total area of all Geometric objects in the array.
     * @params Array of Geometric Objects
     * @return Total Area
     */
    public static double sumArea(GeometricObject[] arr) {
        double sum = 0;
        for (GeometricObject obj: arr)
            sum += obj.getArea();
        return (sum);
    }
}