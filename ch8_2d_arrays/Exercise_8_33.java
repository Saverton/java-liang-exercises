/**
 * (Geometry: polygon subareas) A convex 4-vertex polygon is divided into four 
 * triangles, as shown in Figure 8.9.
 * Write a program that prompts the user to enter the coordinates of four vertices and 
 * displays the areas of the four triangles in increasing order. 
 * @author Scott M.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_8_33
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat ("0.##");
        double[][] points = new double[4][2];
        double[] intersection = new double[2];
        double[] areas = new double[4];
        
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:\n\t");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextDouble();
            }
        }
        kb.close();
        
        //sets up points array for intersection points method
        for (int i = 0; i < points[1].length; i++)
        {
            double temp = points[1][i];
            points[1][i] = points[2][i];
            points[2][i] = temp;
        }
        
        intersection = getIntersectingPoint(points);
        
        //return points to normal positions
        for (int i = 0; i < points[1].length; i++)
        {
            double temp = points[1][i];
            points[1][i] = points[2][i];
            points[2][i] = temp;
        }
        
        for (int i = 0; i < areas.length; i++)
        {
            double[][] temp = new double[3][2];
            for (int j = 0; j < temp.length; j++)
            {
                for (int k = 0; k < temp[j].length; k++)
                {
                    if (j == 2)
                    {
                        temp[j][k] = intersection[k];
                    }
                    else
                    {
                        temp[j][k] = points[(i + j) % areas.length][k];
                    }
                }
            }
            areas[i] = getTriangleArea(temp);
        }
        
        selectionSort(areas);
        
        System.out.print("The areas are");
        for (double i: areas)
        {
            System.out.print(" " + fmt.format(i));
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
    
    /**
     * Return a sorted array using a selection sort.
     * @param a double[]: array to sort
     * @return double[]: sorted array
     */
    public static double[] selectionSort(double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            double min = a[i];
            int minIndex = i;
            for (int j = i; j < a.length; j++)
            {
                if (a[j] < min)
                {
                    min = a[j];
                    minIndex = j;
                }
            }
            double temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        return a;
    }
}