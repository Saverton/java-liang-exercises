/** Driver class to test the Octagon class, specifically its implementation of the compareTo
 * method.
 * 
 * @author Scott M.
 * OctagonTest.java
 */

public class OctagonTest {
    /** Main method to run program */
    public static void main(String[] args) {
        Octagon o1 = new Octagon();
        Octagon o2 = new Octagon(3.0);
        Octagon o3 = new Octagon(3.0);
        
        System.out.println("o1 compareTo o2? " + o1.compareTo(o2));
        System.out.println("o2 compareTo o3? " + o2.compareTo(o3));
    }
}