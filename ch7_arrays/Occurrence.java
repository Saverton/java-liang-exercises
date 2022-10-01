/**
 * Program to count the occurrence of numbers in an array.
 * 
 * @author Scott M.
 * Occurrence.java
 */

import java.util.Scanner;

public class Occurrence {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int lastInput = -1, length = 0;
        
        //1. Create an array of size 100 for input
        int[] input = new int[100];
        
        //2. Get input for the array, end input with '0', set variable length to first index of 0
        System.out.print("Enter the integers between 1 and 100 (input ends with 0): ");
        while (lastInput != 0) {
            input[length] = lastInput = kb.nextInt();
            length++;
        }
        
        //3. Create an array with counts of integers 1-100
        int[] count = new int[100];
        
        //4. Count the occurences of each number in the array
        countOccurrences(input, count, length);
        
        //5. Display occurences
        displayOccurrences(count, length);
    }
    /**
     * Method to count occurrences of integers in an array.
     */
    public static int[] countOccurrences(int[] input, int[] count, int length) {
        for (int i = 0; i < length - 1; i++) {
            count[input[i]]++;
        }
        
        return count;
    }
    /**
     * Method to display the occurrences of integers.
     */
    public static void displayOccurrences(int[] count, int length) {
        for (int i = 0; i < 100; i++) {
            if (count[i] > 0) {
                System.out.println((count[i] == 1) ? i + " occurs " + count[i] + " time" : i + " occurs " + count[i] + " times");
            }
        }
    }
}