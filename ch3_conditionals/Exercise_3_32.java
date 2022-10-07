/**
 * (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1, 
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is 
 * on the left of the line, on the right, or on the same line (see Figure 3.11):
 *                                           { >0 p2 is on the left side of the line
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) { =0 p2 is on the same line
 *                                           { <0 p2 is on the right side of the line
 * @author Scott M.
 * PointPosition.java
 */

import java.util.Scanner;

public class Exercise_3_32 {
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
        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0) {
            System.out.print("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ").");
        }
        else if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) {
            System.out.print("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ").");
        }
        else {
            System.out.print("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ").");
        }
    }
}