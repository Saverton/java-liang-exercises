/**
 * (Computing gcd) Write a method that returns the gcd of an unspecified number 
 * of integers. The method header is specified as follows:
 *      public static int gcd(int... numbers)
 * Write a test program that prompts the user to enter five numbers, invokes the 
 * method to find the gcd of these numbers, and displays the gcd.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_14 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[] list = new int[5];
        
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list[i] = kb.nextInt();
        }
        kb.close();
        System.out.print("GCD is " + getGCD(list));
    }
    /**
     * Return the GCD of an array of integers.
     * @param list int[]: array of integers
     * @return int: GCD
     */
    public static int getGCD(int[] list) {
        int gcd = min(list);
        while (gcd > 1) {
            if (isGCD(list, gcd)) {
                return gcd;
            }
            gcd--;
        }
        return 1;
    }
    /**
     * Check if a given number is a GCD of an array of integers.
     * @param list int[]: array of integers
     * @param gcd int: the GCD to check
     * @return boolean: true = number is gcd, false otherwise
     */
    public static boolean isGCD(int[] list, int gcd) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % gcd != 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Return the minimum value in an integer array.
     * @param array int[]: array of integers
     * @return int: minimum value of array
     */
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }
}