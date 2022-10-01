/**
 * Test driver class for the Triangle2D class.
 * 
 * @author Scott M.
 * Triangle2DTest.java
 */

public class Triangle2DTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Triangle2D t1 = new Triangle2D(new Point(2.5, 2), new Point(4.2, 3), new Point(5, 4));
        
        System.out.println("Area: " + t1.getArea() + "\tPerimeter: " + t1.getPerimeter());
        System.out.println("contains [3, 3]? " + t1.contains(new Point(3, 3)));
        System.out.println("contains Triangle: [2.9, 2], [4, 1], [1, 3.4]? " + t1.contains(new Triangle2D(new Point(2.9, 2), new Point(4, 1), new Point(1, 3.4))));
        System.out.println("overlaps Triangle: [2, 5.5], [4, -3], [2, 6.5]? " + t1.overlaps(new Triangle2D(new Point(2, 5.5), new Point(4, -3), new Point(2, 6.5))));
    }
}