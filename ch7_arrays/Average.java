/**
 * Program to calculate the average of 10 values entered into the console.
 * 
 * @author Scott M.
 * Average.java
 */

import java.util.Scanner;

public class Average {
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
        //4. Calculate & display average.
        System.out.print("Average is " + average(array));
    }
    /**
     * Method to find the int average of an int array.
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    /**
     * Method to find the double average of a double array.
     */
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}