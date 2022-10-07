/**
 * (Geometry: two rectangles) Write a program that prompts the user to enter the 
 * center x-, y-coordinates, width, and height of two rectangles and determines 
 * whether the second rectangle is inside the first or overlaps with the first, as shown 
 * in Figure 3.9.
 * @author Scott M.
 * TwoRectangles.java
 */

import java.util.Scanner;

public class Exercise_3_28 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner, declare c1x, c1y, c1w, c1h, and c2 stats
        Scanner kb = new Scanner (System.in);
        double c1x, c1y, r1w, r1h, c2x, c2y, r2w, r2h, distx, disty, wx, wy, hx, hy;
        
        //get c1 and c2 stats
        System.out.print("Enter the center x- and y-coordinates, width, and height for rectangle 1: ");
        c1x = kb.nextDouble();
        c1y = kb.nextDouble();
        r1w = kb.nextDouble();
        r1h = kb.nextDouble();
        System.out.print("Enter the center x- and y-coordinates, width, and height for rectangle 2: ");
        c2x = kb.nextDouble();
        c2y = kb.nextDouble();
        r2w = kb.nextDouble();
        r2h = kb.nextDouble();
        kb.close();
        
        //find dist between centers, x > y
        distx = Math.abs(c1x - c2x);
        disty = Math.abs(c1y - c2y);
        if (r1w > r2w)
        {
            wx = r1w;
            hx = r1h;
            wy = r2w;
            hy = r2h;
            System.out.println("Rectangle 1 is now rectangle x, and rectangle 2 is rectangle y.");
        }
        else
        {
            wx = r2w;
            hx = r2h;
            wy = r1w;
            hy = r1h;
            System.out.println("Rectangle 2 is now rectangle x, and rectangle 1 is rectangle y.");
        }
        
        //find rectangle status
        if ((distx + (0.5 * wy) <= (0.5 * wx)) && (disty + (0.5 * hy) <= (0.5 * hy))) {
            System.out.print("Rectangle y is inside rectangle x.");
        }
        else if ((distx - (0.5 * wy) <= (0.5 * wx)) && (disty - (0.5 * hy) <= (0.5 * hx))) {
            System.out.print("Rectangle x and y are overlapping.");
        }
        else {
            System.out.print("Rectangle x and y do not intersect.");
        }
    }
}