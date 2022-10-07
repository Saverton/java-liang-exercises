/**
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a 
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the 
 * circle, as shown in Figure 3.7a.
 * @author Scott M.
 * PointInCircle.java
 */

import java.util.Scanner;

public class Exercise_3_22 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner and declare vars for x and y and dist
        Scanner kb = new Scanner (System.in);
        double x, y, dist;
        
        //get points x and y
        System.out.print("Enter a point with two coordinates: ");
        x = kb.nextDouble();
        y = kb.nextDouble();
        kb.close();
        
        //caclulate distance between (0,0) and (x,y)
        dist = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
        
        //if dist < 10, point inside circle
        if (dist <= 10)
            System.out.print("The point ("+ x + " ," + y + ") is in the circle.");
        else
            System.out.print("The point ("+ x + " ," + y + ") is not in the circle.");
    }
}