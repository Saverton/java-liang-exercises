/**
 * Program to calculate the area of a regular polygon.
 * 
 * @author Scott M.
 * RegularPolygon.java
 */

import java.util.Scanner;

public class RegularPolygon {
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
        
        System.out.print("The area of the polygon is " + area(sides, length));
    }
    /**
     * Method to calculate the area of a regular polygon.
     */
    public static double area(int sides, double length) {
        return (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
    }
}
