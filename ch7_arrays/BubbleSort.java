/**
 * Program to perform a "Bubble Sort" on a list of numbers.
 * 
 * @author Scott M.
 * BubbleSort.java
 */

import java.util.Scanner;

public class BubbleSort {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] testArray = new double[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = kb.nextDouble();
        }
        
        printArray(bubbleSort(testArray));
    }
    /**
     * Method to perform a bubble sort.
     */
    public static double[] bubbleSort(double[] array) {
        boolean doNextPass = false;
        double temp;
        do  {
            doNextPass = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    doNextPass = true;
                }
            }
        } while (doNextPass);
        return array;
    }
    /**
     * Method to print a double array.
     */
    public static void printArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print((i == list.length - 1) ? list[i] : list[i] + ", ");
        }
    }
}