/**
 * Find if a circle is inside, outside, or overlapping another circle.
 * 
 * @author Scott M.
 * TwoCircles.java
 */

import java.util.Scanner;

public class TwoCircles {
    /**
     * Main method to run programs.
     */
    public static void main(String[] args) {
        //import scanner and declare variables
        Scanner kb = new Scanner (System.in);
        double x1, y1, x2, y2, r1, r2, dist;
        //prompt user and get circle stats
        System.out.print("Enter circle 1's x-coord, y-coord, and radius: ");
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        r1 = kb.nextDouble();
        System.out.print("Enter circle 2's x-coord, y-coord, and radius: ");
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        r2 = kb.nextDouble();
        //calculate distance between cent1 and cent2
        dist = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        
        //if distc < r1, c2 is inside or overlapping c2
        if (dist <= Math.abs(r1 - r2)) {
            System.out.println("Circle 2 is inside Circle 1.");
        }
        else if (dist <= (r1 + r2)) {
            System.out.println("Circle 2 is overlapping with Circle 1.");
        }
        else {
            System.out.println("Circle 2 does not overlap with Circle 1.");
        }
    }
}