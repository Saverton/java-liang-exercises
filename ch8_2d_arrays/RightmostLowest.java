/**
 * Program to find the rightmost lowest point from a list of user
 * entered points.
 * 
 * @author Scott M.
 * RightmostLowest.java
 */

import java.util.Scanner;

public class RightmostLowest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] points = new double[6][2];
        double[] rl;
        
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextDouble();
            }
        }
        
        rl = getRightmostLowestPoint(points);
        
        System.out.print("The rightmost lowest point is (" + rl[0] + ", " + rl[1] + ")");
    }
    
    /**
     * Method to find the rightmost lowest point in a 2d array of points.
     */
    public static double[] getRightmostLowestPoint(double[][] p)
    {
        double[] output = {p[0][0], p[0][1]};
        for (int i = 1; i < p.length; i++)
        {
            if (p[i][1] < output[1])
            {
                output[0] = p[i][0];
                output[1] = p[i][1];
            }
            else if (p[i][1] == output[1] && p[i][0] > output[0])
            {
                output[0] = p[i][0];
            }
        }
        return output;
    }
}