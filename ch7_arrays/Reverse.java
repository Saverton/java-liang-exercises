/**
 * Program to reverse the inputs of an array.
 * 
 * @author Scott M.
 * Reverse.java
 */

import java.util.Scanner;

public class Reverse {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] list = new int[10];
        
        System.out.print("Enter 10 Integers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = kb.nextInt();
        }
        
        list = reverse(list);
        
        printArray(list);
    }
    /**
     * Method to reverse an int array.
     */
    public static int[] reverse(int[] list) {
        int[] reverseList = new int[list.length];
        
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverseList[i] = list[j];
        }
        
        return reverseList;
    }
    /**
     * Method to print an array.
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print((i == list.length - 1) ? list[i] : list[i] + ", ");
        }
    }
}