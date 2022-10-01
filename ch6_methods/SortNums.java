/**
 * Program to sort three double numbers in order from small to large.
 * 
 * @author Scott M.
 * SortNums.java
 */

import java.util.Scanner;

public class SortNums {
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
        
        displaySortedNumbers(num1, num2, num3);
    }
    /**
     * Method to sort three doubles and display them in a string
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