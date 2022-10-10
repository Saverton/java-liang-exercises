/**
 * (Sort three numbers) Write a method with the following header to display three 
 * numbers in increasing order:
 *      public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the 
 * method to display them in increasing order.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_5 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double num1, num2, num3;
        
        System.out.print("Enter three numbers: ");
        num1 = kb.nextDouble();
        num2 = kb.nextDouble();
        num3 = kb.nextDouble();
        kb.close();
        
        displaySortedNumbers(num1, num2, num3);
    }
    /**
     * Method to sort three doubles and display them in a string
     * @params int: number 1, number 2, number 3
     */
    public static void displaySortedNumbers(double num1, double num2, double num3) {
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
        System.out.print("The numbers from largest to smallest are " + num1 + ", " + num2 + ", " + num3);
    }
}