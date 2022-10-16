/**
 * (Geometry: rightmost lowest point) In computational geometry, often you need 
 * to find the rightmost lowest point in a set of points. Write the following method 
 * that returns the rightmost lowest point in a set of points.
 * public static double[]
 * getRightmostLowestPoint(double[][] points)
 * Write a test program that prompts the user to enter the coordinates of six points 
 * and displays the rightmost lowest point. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_34
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
        kb.close();
        
        rl = getRightmostLowestPoint(points);
        
        System.out.print("The rightmost lowest point is (" + rl[0] + ", " + rl[1] + ")");
    }
    
    /**
     * Return the point that is the furthest right and lowest point in an array of points.
     * @param p double[][]: array of points
     * @return double[]: rightmost lowest point
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