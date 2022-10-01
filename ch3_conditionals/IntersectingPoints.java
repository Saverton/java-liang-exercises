/**
 * Program to find out where two lines defined by points intersect.
 * 
 * @author Scott M.
 * IntersectingPoints.java
 */

import java.util.Scanner;

public class IntersectingPoints {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars for x1, x2, x3, x4, and y1-4, a-f, and fx, fy, start scanner
        Scanner kb = new Scanner (System.in);
        double x1, x2, x3, x4, y1, y2, y3, y4, a, b, c, d, e, f, fx, fy;
        
        //get x1-4 and y1-4
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        x3 = kb.nextDouble();
        y3 = kb.nextDouble();
        x4 = kb.nextDouble();
        y4 = kb.nextDouble();
        
        //find a-f
        a = y1 - y2;
        b = x1 - x2;
        c = y3 - y4;
        d = x3 - x4;
        e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
        
        //calculate solution according to Cramer's rule
        fx = (e * d - b * f) / (a * d - b * c);
        fy = (a * f - e * c) / (a * d - b * c);
        
        //display resultant point
        System.out.print("The lines intersect at (" + fx + ", " + fy + ").");
    }
}