/**
 * (Find the index of the smallest element) Write a method that returns the index of 
 * the smallest element in an array of integers. If the number of such elements is 
 * greater than 1, return the smallest index. Use the following header:
 *      public static int indexOfSmallestElement(double[] array)
 * Write a test program that prompts the user to enter ten numbers, invokes this 
 * method to return the index of the smallest element, and displays the index.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_10 {
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
        System.out.print("The index of the minimum number is: " + indexOfMin(array));
    }
    /**
     * Return the index of the minimum value in an array of doubles.
     * @param array double[]: array of doubles
     * @return int: index of minimum value
     */
    public static int indexOfMin(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}