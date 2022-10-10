/**
 * (The MyTriangle class) Create a class named MyTriangle that contains the 
 * following two methods:
 *      /** Return true if the sum of any two sides is 
 *      greater than the third side. /
 *      public static boolean isValid(double side1, double side2, double side3)
 * 
 *      /** Return the area of the triangle. / 
 *      public static double area(double side1, double side2, double side3)
 * Write a test program that reads three sides for a triangle and computes the area if 
 * the input is valid. Otherwise, it displays that the input is invalid. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_19 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double side1, side2, side3;
        
        System.out.print("Enter three side lengths: ");
        side1 = kb.nextDouble();
        side2 = kb.nextDouble();
        side3 = kb.nextDouble();
        kb.close();
        
        if(isValid(side1, side2, side3)) {
            System.out.println("The triange is valid.");
            System.out.print("The area is " + area(side1, side2, side3));
        }
        else {
            System.out.print("The triangle is not valid.");
        }
    }
    /**
     * Return true if triangle is considered valid, false otherwise.
     * @param double: side 1 length, side 2 length, side 3 length
     * @return boolean: true: triangle is valid, false otherwise
     */
    public static boolean isValid(double side1, double side2, double side3) {
        double min = Math.min(Math.min(side1, side2), side3), max = Math.max(Math.max(side1, side2), side3), mid;
        if (side1 > min && side1 < max)
            mid = side1;
        else if (side2 > min && side2 < max)
            mid = side2;
        else 
            mid = side3;

        if (max < mid + min) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Return the area of a triangle given three valid side lengths.
     * @params double: side 1 length, side 2 length, side 3 length
     * @return double: triangle area
     */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}