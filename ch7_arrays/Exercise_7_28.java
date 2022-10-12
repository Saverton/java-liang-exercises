/**
 * (Math: combinations) Write a program that prompts the user to enter 10 integers 
 * and displays all combinations of picking two numbers from the 10.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_28 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] list = new int[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = kb.nextInt();
        }
        kb.close();
        
        printCombos(list);
    }
    /**
     * Print all possible combinations of numbers in a given integer array.
     * @param list int[]: integer array
     */
    public static void printCombos(int[] list) {
        int count = 0;
        System.out.println("All possible combos: ");
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.println(list[i] + ", " + list[j]);
                count++;
            }
        }
        System.out.print("Number of combos: " + count);
    }
}