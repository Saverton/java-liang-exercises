/** Test to check Triangle class.
 * 
 * @author Scott M.
 * TriangleTest.java
 */

public class TraingleTest {
    /** Main method to run program. */
    public static void main(String[] args) {
        GeometricObject t1 = new Triangle(3, 4, 5);
        System.out.println(t1.toString());
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        
        GeometricObject t2 = new Triangle(6, 8, 10);
        System.out.println(t2.getArea());
        System.out.println(t1.compareTo(t2));
    }
}