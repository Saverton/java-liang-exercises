/**
 * (Reverse an array) The reverse method in Section  7.7 reverses an array by 
 * copying it to a new array. Rewrite the method that reverses the array passed in 
 * the argument and returns this array. Write a test program that prompts the user to 
 * enter ten numbers, invokes the method to reverse the numbers, and displays the 
 * numbers.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_12 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[] array = new int[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextInt();
        }
        kb.close();
        
        reverse(array);
        printArray(array);
    }
    /**
     * Reverse the integer array passed to this function.
     * @param list int[]: array of integers
     */
    public static void reverse(int[] list) {
        int temp;
        
        for (int i = 0, j = list.length - 1; i <= (double)(list.length - 1) / 2; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
    /**
     * Print out each element of an array separated by commas
     * @param int[]: array of integers
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print((i == list.length - 1) ? list[i] : list[i] + ", ");
        }
    }
}