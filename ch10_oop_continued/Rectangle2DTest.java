/**
 * Program to test the Rectangle2D class.
 * 
 * @author Scott M.
 * Rectangle2DTest.java
 */

public class Rectangle2DTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Rectangle2D r1 = new Rectangle2D(2, 2, 5.5, 4.9);
        
        System.out.println("Area: " + r1.getArea() + "\tPerimeter: " + r1.getPerimeter());
        System.out.println("contains [3, 3]? " + r1.contains(new Point(3, 3)));
        System.out.println("contains rectangle x = 4, y = 5, w = 10.5, h = 3.2? " + r1.contains(new Rectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("overlaps rectangle x = 3, y = 5, w = 2.3, h = 5.4? " + r1.overlaps(new Rectangle2D(3, 5, 2.3, 5.4)));
    }
}