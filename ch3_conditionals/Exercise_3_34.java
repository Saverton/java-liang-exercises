/**
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test 
 * whether a point is on an unbounded line. Revise Programming Exercise 3.32 to 
 * test whether a point is on a line segment. Write a program that prompts the user 
 * to enter the three points for p0, p1, and p2 and displays whether p2 is on the line 
 * segment from p0 to p1.
 * @author Scott M.
 * PointOnLineSegment.java
 */

import java.util.Scanner;

public class Exercise_3_34 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare x0, x1, x2, y0 ,y1 ,y2 vars
        Scanner kb = new Scanner (System.in);
        double x0, y0, x1, y1, x2, y2;
        
        //get points to make line
        System.out.print("Enter the x- and y-coordinates for the endpoints of\nthe evaluation line (x1, y1, x2, y2): ");
        x0 = kb.nextDouble();
        y0 = kb.nextDouble();
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        
        //get tested point
        System.out.print("Enter the x- and y-coordinates for the point to be evaluated: ");
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        kb.close();
        
        //display results (if)
        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) {
            if (((x0 <= x1 && x2 >= x0 && x2 <= x1) || (x0 >= x1 && x2 >= x1 && x2 <= x0)) && ((y0 <= y1 && y2 >= y0 && y2 <= y1) || (y0 >= y1 && y2 >= y1 && y2 <= y0))) {
            System.out.print("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ").");
        }
        else {
            System.out.print("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ").");
        }
        }
        else {
            System.out.print("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ").");
        }
    }
}
