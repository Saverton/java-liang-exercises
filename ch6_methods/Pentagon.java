/**
 * Program to calculate the area of a pentagon.
 * 
 * @author Scott M.
 * Pentagon.java
 */

import java.util.Scanner;

public class Pentagon {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double side;
        
        System.out.print("Enter the side length: ");
        side = kb.nextDouble();
        
        System.out.print("The area is " + area(side));
    }
    /**
     * Method to calculate the area of a pentagon.
     */
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}