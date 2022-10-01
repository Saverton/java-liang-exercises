/**
 * Program to determine all possible combinations of two numbers from two lists of 10 numbers.
 * 
 * @author Scott M.
 * Combos.java
 */

import java.util.Scanner;

public class Combos {
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
        
        printCombos(list);
    }
    /**
     * Method to print all possible combinations of integers from an int list.
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