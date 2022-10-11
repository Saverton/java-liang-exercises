/**
 * (Count occurrence of numbers) Write a program that reads the integers between 1 
 * and 100 and counts the occurrences of each. Assume the input ends with 0. 
 * Note that if a number occurs more than one time, the plural word “times” is used 
 * in the output.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_3 {
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
        kb.close();
        
        //4. Count the occurences of each number in the array
        int[] count = countOccurrences(input, length);
        
        //5. Display occurences
        displayOccurrences(count);
    }
    /**
     * Count the occurences of numbers from 1-100 in an array, return a new array with elements corresponding to the amount of times their index
     * appeared in the passed array.
     * @param input int[]: the array to be counted from
     * @param length int: the length of countable input in the array
     * @return int[]: an array with counts for each index's appearance (e.g. if 12 appears 5 times then count[12] = 5)
     */
    public static int[] countOccurrences(int[] input, int length) {
        int[] count = new int[100];
        for (int i = 0; i < length - 1; i++) {
            count[input[i]]++;
        }
        return count;
    }
    /**
     * Print out each index's value greater than 0 formatted to describe this as the amount of times index i occurs.
     * @param count int[]: the array with the counts for each index
     */
    public static void displayOccurrences(int[] count) {
        for (int i = 1; i < 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " time" + ((count[i] > 1) ? "s" : ""));
            }
        }
    }
}