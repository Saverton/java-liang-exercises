/**
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard 
 * deviation of numbers. This exercise uses a different but equivalent formula to
 * compute the standard deviation of n numbers.
 *                                                                   ______________________________________
 *              x1 + x2 + ... + xn                                  / (x1 - mean)^2 + ... + (xn - mean)^2
 *      mean = --------------------         standard deviation =   / -------------------------------------
 *                      n                                        \/                  n - 1
 * To compute the standard deviation with this formula, you have to store the individual 
 * numbers using an array, so that they can be used after the mean is obtained.
 * Your program should contain the following methods:
 *      /** Compute the deviation of double values /
 *      public static double deviation(double[] x) 
 *      /** Compute the mean of an array of double values /
 *      public static double mean(double[] x) 
 * Write a test program that prompts the user to enter ten numbers and displays the 
 * mean and standard deviation.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double[] array = new double[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextDouble();
        }
        kb.close();
        
        System.out.printf("The mean is %4.2f\n", mean(array));
        System.out.printf("The standard deviation is %7.5f", deviation(array));
    }
    /**
     * Return the mean (average) of an array of doubles.
     * @param array double[]: array of doubles
     * @return double: mean/average of array
     */
    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    /**
     * Return the standard deviation of an array of doubles.
     * @param array double[]: array of doubles
     * @return double: standard deviation of array
     */
    public static double deviation(double[] array) {
        double sum = 0, mean = mean(array);
        for (int i = 0; i < array.length; i++) {
            sum+= Math.pow(array[i] - mean, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }
}