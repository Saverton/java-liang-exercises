/**
 * Program to test the MyPoint class.
 * 
 * @author Scott M.
 * MyPointTest.java
 */

public class MyPointTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        
        System.out.print("Distance between p1 and p2 is " + p1.distance(p2));
    }
}