/**
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubble-sort 
 * algorithm makes several passes through the array. On each pass, successive 
 * neighboring pairs are compared. If a pair is not in order, its values are swapped; 
 * otherwise, the values remain unchanged. The technique is called a bubble sort or 
 * sinking sort because the smaller values gradually “bubble” their way to the top 
 * and the larger values “sink” to the bottom. Write a test program that reads in ten 
 * double numbers, invokes the method, and displays the sorted numbers.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_18 {
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
        kb.close();
        
        printArray(bubbleSort(testArray));
    }
    /**
     * Return a sorted array of doubles using a double sort.
     * @param array double[]: array to sort
     * @return double[]: sorted array
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
     * Print an array of doubles separated by commas.
     * @param list double[]: array
     */
    public static void printArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print((i == list.length - 1) ? list[i] : list[i] + ", ");
        }
    }
}