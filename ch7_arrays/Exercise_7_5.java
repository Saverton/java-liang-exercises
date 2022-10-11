/**
 * (Print distinct numbers) Write a program that reads in ten numbers and displays 
 * the number of distinct numbers and the distinct numbers separated by exactly one 
 * space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 * Read a number and store it to an array if it is new. If the number is already in the 
 * array, ignore it.) After the input, the array contains the distinct numbers. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_5 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[] list = new int[10];
        int[] distinct = new int [10];
        int count = 0;
        
        //1. Enter the 10 integers;
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = kb.nextInt();
        }
        kb.close();
        
        //2. process the array, counting distinct numbers and adding distinct numbers to an array;
        for (int i = 0; i < list.length; i++) {
            if (!searchArray(list, list[i], i)) {
                distinct[count] = list[i];
                count++;
            }
        }
        
        //3. Display the distinct numbers and array;
        System.out.println("There are " + count + " distinct numbers");
        printArray(distinct, count);
    }
    /**
     * Check if an array of integers contains a certain key after a specified start index.
     * @param list int[]: the array to be searched
     * @param key int: the key to search for
     * @param startIndex int: the index to start searching (0=start of array)
     * @return boolean: true = key was found in the array after startIndex, false otherwise
     */
    public static boolean searchArray(int[] list, int key, int startIndex) {
        for (int i = startIndex + 1; i < list.length; i++) {
            if (key == list[i]) {
                return true;
            }
        }
        return false;
    }
    /**
     * Print out every value in an integer array up to a specified index, excluding any 0s
     * @param distinct int[]: array of integers
     * @param stopIndex int: index to stop printing before
     */
    public static void printArray(int[] array, int stopIndex) {
        for (int i = 0; i < stopIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }
}