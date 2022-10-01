/**
 * Program to find the minimum value of an array.
 * 
 * @author Scott M.
 * Min.java
 */

import java.util.Scanner;

public class Min {
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
        
        System.out.print("The minimum number is: " + min(array));
    }
    /**
     * Method to find the minimum value of an array.
     */
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }
}