/**
 * (Geometry: intersecting point) Write a method that returns the intersecting point of 
 * two lines. The intersecting point of the two lines can be found by using the formula 
 * shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the 
 * two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
 *      public static double[] getIntersectingPoint(double[][] points)
 * The points are stored in a 4-by-2 two-dimensional array points with 
 * (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting 
 * point or null if the two lines are parallel. Write a program that prompts 
 * the user to enter four points and displays the intersecting point. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_31
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
        kb.close();
        
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
     * Return the intersection point of two lines defined by four points. 
     * @param p double[][]: array of points (line1=(x1,y1)->(x2,y2);line2=(x3,y3)->(x4,y4))
     * @return double[]: intersecting point
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
     * Return a set of roots of a linear equation given the variables in Crammer's rule.
     * @param a double[][]: left side of Crammer's rule vars (a, b, c, d)
     * @param b double[]: right side of Crammer's rule vars (e, f)
     * @return double[]: roots of linear equation
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