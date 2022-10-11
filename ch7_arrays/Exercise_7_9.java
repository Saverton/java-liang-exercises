/**
 * (Find the smallest element) Write a method that finds the smallest element in an 
 * array of double values using the following header:
 * public static double min(double[] array)
 * Write a test program that prompts the user to enter ten numbers, invokes this 
 * method to return the minimum value, and displays the minimum value. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_9 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextDouble();
        }
        kb.close();
        
        System.out.print("The minimum number is: " + min(array));
    }
    /**
     * Return the minimum value in a double array.
     * @param array double[]: array of doubles
     * @return double: minimum value
     */
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }
}