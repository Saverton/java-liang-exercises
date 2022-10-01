/** Test driver class to check the implementation of the Circle class and its
 * compatability with the Comparable interface.
 * 
 * @author Scott M.
 * CircleTest.java
 */

public class CircleTest {
    /** Main method to run program */
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(1.0);
        GeometricObject c2 = new Circle(3.0);
        GeometricObject c3 = new Circle(1.0);
        
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c1.compareTo(c2));
        
        System.out.println("c1 == c2? " + ((Circle)c1).equals((Circle)c2));
        System.out.println("c1 == c3? " + ((Circle)c1).equals((Circle)c3));
    }
}