/**
 * Program to use the LinearEquation object class to solve a system of 2 lines
 * to find the intersecting point.
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
        LinearEquation intersect;
        int[][] points = new int[4][2];
        int[] inputs = new int[6];
        
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[i].length; j++)
            {
                points[i][j] = kb.nextInt();
            }
        }
        
        inputs[0] = points[0][1] - points[1][1];
        inputs[1] = -1 * (points[0][0] - points[1][0]);
        inputs[2] = points[2][1] - points[3][1];
        inputs[3] = -1 * (points[2][0] - points[3][0]);
        inputs[4] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        inputs[5] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        
        intersect = new LinearEquation(inputs[0], inputs[1], inputs[2], inputs[3], inputs[4], inputs[5]);
        
        if (intersect.isSolvable())
        {
            System.out.print("Intersecting point is at (" + intersect.getX() + ", " + intersect.getY() + ")");
        }
        else
        {
            System.out.print("The two lines are parallel");
        }
    }
}