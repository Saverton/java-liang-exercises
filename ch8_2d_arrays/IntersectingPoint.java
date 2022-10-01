/**
 * Program to find the intersection point of 2 lines defined by a pair of user
 * defined coordinates.
 * 
 * @author Scott M.
 * IntersectingPoint.java
 */

import java.util.Scanner;

public class IntersectingPoint
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[][] points = new double[4][2];
        double[] intersection;
        
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextDouble();
            }
        }
        
        intersection = getIntersectingPoint(points);
        
        if (intersection == null)
        {
            System.out.print("The two lines are parallel");
        }
        else
        {
            System.out.print("The intersecting point is at (" + intersection[0] + ", " + intersection[1] + ")");
        }
    }
    
    /**
     * Method to find and return the intersection point of a set of 4 points
     */
    public static double[] getIntersectingPoint(double[][] p)
    {
        double[][] a = new double[2][2];
        double[] b = new double [2];
        
        a[0][0] = p[0][1] - p[1][1];
        a[0][1] = -1 * (p[0][0] - p[1][0]);
        a[1][0] = p[2][1] - p[3][1];
        a[1][1] = -1 * (p[2][0] - p[3][0]);
        
        b[0] = a[0][0] * p[0][0] + a[0][1] * p[0][1];
        b[1] = a[1][0] * p[2][0] + a[1][1] * p[2][1];
        
        return linearEquation(a, b);
    }
    
    /**
     * Method to solve a linear equation using Crammer's rule
     */
    public static double[] linearEquation(double[][] a, double[] b)
    {
        double[] solution = new double[2];
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
        {
            solution = null;
        }
        else
        {
            solution[0] = (b[0] * a[1][1] - a[0][1] * b[1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            solution[1] = (b[1] * a[0][0] - a[1][0] * b[0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        }
        return solution;
    }
}