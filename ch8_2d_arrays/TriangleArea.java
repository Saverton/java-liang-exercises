/**
 * Program to find the area of a triangle given it's 3 vertex points.
 * 
 * @author Scott M.
 * TriangleArea.java
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat ("0.##");
        double[][] points = new double[3][2];
        double area;
        
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextDouble();
            }
        }
        
        area = getTriangleArea(points);
        
        if (area == 0)
        {
            System.out.print("The three points are on the same line");
        }
        else
        {
            System.out.print("The area of the triangle is " + fmt.format(area));
        }
    }
    
    /**
     * Method to get the area of a triangle given its vertex points
     */
    public static double getTriangleArea(double[][] p)
    {
        double area, s, product;
        double[] sides = new double[3];
        if (sameLine(p))
        {
            area = 0;
        }
        else
        {
            for (int i = 0; i < sides.length; i++)
            {
                sides[i] = Math.sqrt(Math.pow(p[(i + 1) % sides.length][0] - p[i][0], 2) + Math.pow(p[(i + 1) % sides.length][1] - p[i][1], 2));
            }
            s = (sides[0] + sides[1] + sides[2]) / 2;
            product = s;
            for (int i = 0; i < sides.length; i++)
            {
                product *= (s - sides[i]);
            }
            area = Math.sqrt(product);
        }
        return area;
    }
    
    /**
     * Method to find if a certain amount of points are on the same line.
     */
    public static boolean sameLine(double[][] points) 
    {
        double slope = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        
        for (int i = 2; i < points.length; i++) 
        {
            if (slope != (points[i][1] - points[0][1]) / (points[i][0] - points[0][0])) 
            {
                return false;
            }
        }
        return true;
    }
}