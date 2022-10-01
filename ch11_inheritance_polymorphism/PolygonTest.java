/**
 * Program to test the Polygon class. Constructs a polygon and finds its area.
 * 
 * @author Scott M.
 * PolygonTest.java
 */

public class PolygonTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Polygon p = new Polygon();
        
        for (int i = 0; i < p.getPoints().length; i++)
        {
            for (int j = 0; j < p.getPoints()[i].length; j++)
            {
                System.out.print(p.getPoints()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Area is: " + p.getArea());
    }
}