/**
 * (Geometry: area of a pentagon) The area of a pentagon can be computed using the 
 * following formula:
 *                  5 * s^2
 *      Area = -----------------
 *              4 * tan(PI / 5)
 * Write a method that returns the area of a pentagon using the following header:
 *      public static double area(double side)
 * Write a main method that prompts the user to enter the side of a pentagon and 
 * displays its area.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_35 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double side;
        
        System.out.print("Enter the side length: ");
        side = kb.nextDouble();
        kb.close();
        
        System.out.print("The area is " + area(side));
    }
    /**
     * Return the area of a pentagon.
     * @param double: side length
     * @return double: area
     */
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}