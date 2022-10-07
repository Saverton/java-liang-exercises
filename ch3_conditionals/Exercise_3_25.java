/**
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b. 
 * The intersecting point of the two lines can be found by solving the following 
 * linear equation:
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).
 * If the equation has no solutions, the two lines are parallel (Figure 3.8c).
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 * @author Scott M.
 * IntersectingPoints.java
 */

import java.util.Scanner;

public class Exercise_3_25
 {
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
        kb.close();
        
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