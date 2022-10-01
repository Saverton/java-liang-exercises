/**
 * Program to determine if two lists are identical (i.e. have the same contents).
 * 
 * @author Scott M.
 * Identical.java
 */

import java.util.Scanner;

public class Identical {
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
        
        System.out.print((equals(list1, list2)) ? "Two lists are identical" : "Two lists are not identical");
    }
    /**
     * Method to determine if two arrays are identical in contents.
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (!(contains(list2, list1[i], list1.length - i))) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method to perform a linear search in an array, set the found item to the max index.
     */
    public static boolean contains(int[] array, int key, int maxIndex) {
        int index, temp;
        for (int i = 0; i < maxIndex; i++) {
            if (array[i] == key) {
                temp = array[i];
                array[i] = array[maxIndex - 1];
                array[maxIndex - 1] = temp;
                return true;
            }
        }
        return false;
    }
}