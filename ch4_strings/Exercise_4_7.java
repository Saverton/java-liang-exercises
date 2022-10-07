/**
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point 
 * at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts 
 * the user to enter the radius of the bounding circle of a pentagon and displays the 
 * coordinates of the five corner points on the pentagon. 
 * @author Scott M.
 * CornerPointCoordinates.java
 */

import java.util.Scanner;

public class Exercise_4_7 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        double radius, angle, x, y;
        int count = 0;
        
        //get radius of bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        radius = kb.nextDouble();
        kb.close();

        // calculate & display the 5 points
        System.out.println("The coordinates of the pentagon are");
        angle = Math.toRadians(18) + Math.toRadians(72 * count++);
        x = Math.cos(angle) * radius;
        y = Math.sin(angle) * radius;
        System.out.println("(" + x + ", " + y + ")");
        angle = Math.toRadians(18) + Math.toRadians(72 * count++);
        x = Math.cos(angle) * radius;
        y = Math.sin(angle) * radius;
        System.out.println("(" + x + ", " + y + ")");
        angle = Math.toRadians(18) + Math.toRadians(72 * count++);
        x = Math.cos(angle) * radius;
        y = Math.sin(angle) * radius;
        System.out.println("(" + x + ", " + y + ")");
        angle = Math.toRadians(18) + Math.toRadians(72 * count++);
        x = Math.cos(angle) * radius;
        y = Math.sin(angle) * radius;
        System.out.println("(" + x + ", " + y + ")");
        angle = Math.toRadians(18) + Math.toRadians(72 * count++);
        x = Math.cos(angle) * radius;
        y = Math.sin(angle) * radius;
        System.out.println("(" + x + ", " + y + ")");
    }
}