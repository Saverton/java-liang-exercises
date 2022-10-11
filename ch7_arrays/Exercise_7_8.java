/**
 * Average an array) Write two overloaded methods that return the average of an 
 * array with the following headers:
 *      public static int average(int[] array)
 *      public static double average(double[] array)
 * Write a test program that prompts the user to enter ten double values, invokes this 
 * method, and displays the average value.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //2. declare the array and get inputs.
        double[] array = new double[10];
        System.out.print("Enter 10 doubles: ");
        for (int i = 0; i < 10; i++) {
            array[i] = kb.nextDouble();
        }
        kb.close();
        //4. Calculate & display average.
        System.out.print("Average is " + average(array));
    }
    /**
     * Return the integer average of an integer array.
     * @param array int[]: array of integers
     * @return int: average
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    /**
     * Return the double/float average of a double array.
     * @param array double[]: double array
     * @return double: average
     */
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}