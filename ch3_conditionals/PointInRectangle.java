/**
 * Program to determine if a given point is in a 10w 5h rectangle.
 * 
 * @author Scott M.
 * PointInRectangle.java
 */

import java.util.Scanner;

public class PointInRectangle {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare x, y vars
        Scanner kb = new Scanner (System.in);
        double x, y;
        
        //get x and y vars
        System.out.print("Enter a point with two coordinates: ");
        x = kb.nextDouble();
        y = kb.nextDouble();
        
        //if abs(x) < 5 and abs(y) < 2.5, point is in rectangle
        if (Math.abs(x) < 5 && Math.abs(y) < 2.5)
            System.out.print("The point (" + x + ", " + y + ") is in the rectangle.");
        else
            System.out.print("The point (" + x + ", " + y + ") is not in the rectangle.");
    }
}