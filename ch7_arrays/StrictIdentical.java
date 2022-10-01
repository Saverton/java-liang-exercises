/**
 * Program to determine if two arrays are strictly identical.
 * 
 * @author Scott M.
 * StrictIdentical.java
 */

import java.util.Scanner;

public class StrictIdentical {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
        int[] list1 = new int[kb.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = kb.nextInt();
        }
        
        System.out.print("Enter list2: ");
        int[] list2 = new int[kb.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = kb.nextInt();
        }
        
        System.out.print((equals(list1, list2)) ? "Two lists are strictly identical" : "Two lists are not strictly identical");
    }
    /**
     * Method to return true if two arrays are strictly identical.
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}