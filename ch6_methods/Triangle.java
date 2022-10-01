/**
 * Program to determine if a triangle is valid and if so calculates the area.
 * 
 * @author Scott M.
 * Triangle.java
 */

import java.util.Scanner;

public class Triangle {
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
        
        if(isValid(side1, side2, side3)) {
            System.out.println("The triange is valid.");
            System.out.print("The area is " + area(side1, side2, side3));
        }
        else {
            System.out.print("The triangle is not valid.");
        }
    }
    /**
     * Method to determine if a triangle is valid.
     */
    public static boolean isValid(double side1, double side2, double side3) {
        String temp = displaySortedNumbers(side1, side2, side3);
        double max, mid, min;
        max = Double.parseDouble(temp.substring(0, temp.indexOf(" ")));
        mid = Double.parseDouble(temp.substring(temp.indexOf(" "), temp.lastIndexOf(" ")));
        min = Double.parseDouble(temp.substring(temp.lastIndexOf(" ")));
        if (max < mid + min) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Method to compute the area of a triangle using side lengths.
     */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    /**
     * Method to sort three doubles.
     */
    public static String displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 < num3) {
                    temp = num2;
                    num2 = num3;
                    num3 = temp;
                }
            }
            else {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
        }
        else if (num1 < num2) {
            temp = num1;
            if (num2 > num3) {
                num1 = num2;
                if (temp > num3) {
                    num2 = temp;
                }
                else {
                    num2 = num3;
                    num3 = temp;
                }
            }
            else {
                num1 = num3;
                num3 = temp;
            }
        }
        return "" + num1 + " " + num2 + " " + num3;
    }
}