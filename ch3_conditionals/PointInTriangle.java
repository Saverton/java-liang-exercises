/**
 * Program to find if a given point is inside a right triangle.
 * 
 * @author Scott M.
 * PointInTriangle.java
 */

import java.util.Scanner;

public class PointInTriangle {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner, get x, y, and y check vars
        Scanner kb = new Scanner (System.in);
        double x, y;
        
        //get x and y from user
        System.out.print("Enter a point's x- and y-coordinates: ");
        x = kb.nextDouble();
        y = kb.nextDouble();
        
        //x and y must be positive, and -1/2x + 100 < 100 to be in triangle
        if (x < 0 || y < 0) {
            System.out.print("The point is not in the triangle.");
        }
        else if (y > ((0.5 * x) + 100)) {
            System.out.print("The point is not in the triangle.");
        }
        else {
            System.out.print("The point is in the triangle.");
        }
    }
}