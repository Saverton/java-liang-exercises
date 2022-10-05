/**
 * (Geometry: distance of two points) Write a program that prompts the user to enter 
 * two points (x1, y1) and (x2, y2) and displays their distance between them. 
 * The formula for computing the distance is 
 *       ___________________________
 *      / (x2 - x1)^2 + (y2 - y1)^2
 *    \/
 * Note that you can use Math.pow(a, 0.5) to compute sqrt(a).
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_15 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x1, y1, x2, y2, distance;
        System.out.print("Enter x1 and y1: ");
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        kb.close();
        distance = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
        System.out.print("The distance between the two points is " + distance);
    }
}