/**
 * Program to find if a given point is inside a circle of radius 10.
 * 
 * @author Scott M.
 * PointInCircle.java
 */

import java.util.Scanner;

public class PointInCircle {
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
        
        //caclulate distance between (0,0) and (x,y)
        dist = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
        
        //if dist < 10, point inside circle
        if (dist <= 10)
            System.out.print("The point ("+ x + " ," + y + ") is in the circle.");
        else
            System.out.print("The point ("+ x + " ," + y + ") is not in the circle.");
    }
}