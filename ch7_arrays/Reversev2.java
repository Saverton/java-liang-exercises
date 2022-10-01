/**
 * Program to reverse an array in a method by editing the same array.
 * 
 * @author Scott M.
 * Reversev2.java
 */

import java.util.Scanner;

public class Reversev2 {
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
        
        reverse(array);
        Reverse.printArray(array);
    }
    /**
     * Method to reverse an int array.
     */
    public static void reverse(int[] list) {
        int temp;
        
        for (int i = 0, j = list.length - 1; i <= (double)(list.length - 1) / 2; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}