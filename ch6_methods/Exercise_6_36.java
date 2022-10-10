/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon 
 * in which all sides are of the same length and all angles have the same degree (i.e., 
 * the polygon is both equilateral and equiangular). The formula for computing the 
 * area of a regular polygon is
 *                  n * s^2
 *      Area = -----------------
 *              4 * tan(PI / 5)
 * Write a method that returns the area of a regular polygon using the following header:
 * public static double area(int n, double side)
 * Write a main method that prompts the user to enter the number of sides and the 
 * side of a regular polygon and displays its area. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_36 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double length;
        int sides;
        
        System.out.print("Enter the number of sides: ");
        sides = kb.nextInt();
        System.out.print("Enter the side length: ");
        length = kb.nextDouble();
        kb.close();
        
        System.out.print("The area of the polygon is " + area(sides, length));
    }
    /**
     * Return the area of a regular polygon given the number of sides and the side length
     * @param int: number of sides, double: side length
     * @return double: area of regular polygon
     */
    public static double area(int sides, double length) {
        return (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
    }
}
