/**
 * (Identical arrays) The arrays list1 and list2 are identical if they have the 
 * same contents. Write a method that returns true if list1 and list2 are identical, 
 * using the following header:
 *      public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and displays 
 * whether the two are identical. Here are the sample runs. Note that the first 
 * number in the input indicates the number of the elements in the list. This number 
 * is not part of the list.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_26 {
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
        kb.close();
        
        System.out.print((equals(list1, list2)) ? "Two lists are identical" : "Two lists are not identical");
    }
    /**
     * Check if two arrays are strictly identical in their contents.
     * @param list1 int[]: the first integer array
     * @param list2 int[]: the second integer array
     * @return boolean: true = arrays are identical, false otherwise
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
     * Check if a key is inside an array before a given maximum index. If the key is found, swap it with the element at the max index.
     * @param array int[]: array of integers
     * @param key int: key to search for
     * @param maxIndex int: index to stop searching at and place the key at (if found)
     */
    public static boolean contains(int[] array, int key, int maxIndex) {
        int temp;
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