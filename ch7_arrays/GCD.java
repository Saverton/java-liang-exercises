/**
 * Program to calculate GCD of an array of unspecified length.
 * 
 * @author Scott M.
 * GCD.java
 */

import java.util.Scanner;

public class GCD {
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
        
        System.out.print("GCD is " + getGCD(list));
    }
    /**
     * Method to calculate GCD of a list of unspecified list.
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
     * Method to check if a value is a GCD of an array.
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
     * Method to find the minimum value of an array.
     */
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }
}