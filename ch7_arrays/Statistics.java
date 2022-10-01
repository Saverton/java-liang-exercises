/**
 * Program to calculate the mean and standard deviation of a list of ten doubles.
 * 
 * @author Scott M.
 * Statistics.java
 */

import java.util.Scanner;

public class Statistics {
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
        
        System.out.printf("The mean is %4.2f\n", mean(array));
        System.out.printf("The standard deviation is %7.5f", deviation(array, mean(array)));
    }
    /**
     * Method to compute mean of an array.
     */
    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    /**
     * Method to compute standard deviation of an array.
     */
    public static double deviation(double[] array, double mean) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= Math.pow(array[i] - mean, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }
}