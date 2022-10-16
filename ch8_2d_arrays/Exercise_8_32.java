/**
 * (Geometry: area of a triangle) Write a method that returns the area of a triangle 
 * using the following header:
 * public static double getTriangleArea(double[][] points)
 * The points are stored in a 3-by-2 two-dimensional array points with points[0]
 * [0] and points[0][1] for (x1, y1). The triangle area can be computed using the 
 * formula in Programming Exercise 2.19. The method returns 0 if the three points 
 * are on the same line. Write a program that prompts the user to enter three points of 
 * a triangle and displays the triangle's area.
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_8_32
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
        kb.close();
        
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
     * Return the area of a triangle given it's vertices.
     * @param p double[][]: array of vertices
     * @return double: area of triangle
     */
    public static double getTriangleArea(double[][] p)
    {
        double area, s, product;
        double[] sides = new double[3];
        if (onSameLine(p))
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
     * Check if an array of points are all on the same line in a 2d coordinate grid
     * @param points double[][]: array of points {{p1x, p1y}, {p2x, p2y}, ...}
     * @return boolean: true = the points are all on the same line, false otherwise
     * Precondition: there must be at least 2 points in the points array
     */
    public static boolean onSameLine(double[][] points) {
        double slope = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        
        for (int i = 2; i < points.length; i++) {
            if (Math.abs(slope - ((points[i][1] - points[0][1]) / (points[i][0] - points[0][0]))) > 0.001) {
                return false;
            }
        }
        return true;
    }
}