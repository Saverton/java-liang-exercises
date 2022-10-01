/**
 * Program to test the Circle2D class. The program creates a Circle2D object, displays
 * its perimeter and area, then compares itself to a few other Circle2D objects.
 * 
 * @author Scott M.
 * TestCircle2D.java
 */

public class TestCircle2D
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        
        System.out.println("Area is " + c1.getArea() + " and perimeter is " + c1.getPerimeter());
        System.out.println("Contains 3, 3, 1? " + c1.contains(new Circle2D(3, 3)));
        System.out.println("Contains 4, 5, 10.5? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Overlaps 3, 5, 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}