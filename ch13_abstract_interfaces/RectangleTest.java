/** Driver class to test the Rectangle class and its implementation of the equals
 * method.
 * 
 * @author Scott M.
 * RecangleTest.java
 */

public class RectangleTest {
    /** Main method to run program. */
    public static void main(String[] args) {
        GeometricObject r1 = new Rectangle(3.0, 4.0);
        Rectangle r2 = new Rectangle(5.0, 6.0);
        Rectangle r3 = new Rectangle(3.0, 4.0);
        
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Area of r3: " + r3.getArea());
        
        System.out.println("r1 == r2? " + ((Rectangle)r1).equals(r2));
        System.out.println("r1 == r3? " + ((Rectangle)r1).equals(r3));
    }
}