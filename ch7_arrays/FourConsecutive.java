/**
 * Program to find if an array has four consecutive equal numbers.
 * 
 * @author Scott M.
 * FourConsecutive.java
 */

import java.util.Scanner;

public class FourConsecutive {
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
        System.out.print((isConsecutiveFour(array)) ? "The list contains four consecutive equal numbers" 
        : "The list does not contain four consecutive equal numbers");
    }
    /**
     * Method to check for four consecutive numbers.
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