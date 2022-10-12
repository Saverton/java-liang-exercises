/**
 * (Pattern recognition: consecutive four equal numbers) Write the following 
 * method that tests whether the array has four consecutive numbers with the same 
 * value. 
 *      public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays 
 * if the series contains four consecutive numbers with the same value. Your 
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_30 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[] array = new int[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = kb.nextInt();
        }
        kb.close();
        System.out.print((isConsecutiveFour(array)) ? "The list contains four consecutive equal numbers" 
        : "The list does not contain four consecutive equal numbers");
    }
    /**
     * Check for a sequence of four consecutive numbers in a passed array.
     * @param array int[]: array of integers
     * @return boolean: true = array contains consecutive array of four integers, false otherwise
     */
    public static boolean isConsecutiveFour(int[] array) {
        for (int i = 3; i < array.length; i++) {
            if (array[i] == array[i - 1] && array[i] == array[i - 2] && array[i] == array[i - 3]) {
                return true;
            }
        }
        return false;
    }
}