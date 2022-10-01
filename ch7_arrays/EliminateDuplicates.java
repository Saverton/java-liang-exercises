/**
 * Program to eliminate duplicate entries of an array.
 * 
 * @author Scott M.
 * EliminateDuplicates.java
 */

import java.util.Scanner;

public class EliminateDuplicates {
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
        
        System.out.print("New array is ");
        Reverse.printArray(eliminateDuplicates(array));
    }
    /**
     * Method to eliminate duplicates from an array and return the resulting array.
     */
    public static int[] eliminateDuplicates(int[] list) {
        int count = 0;
        //1. Process each element of the array
        for (int i = 0; i < list.length; i++) {
            //2. Check if an element is found earlier in the array.
            if (searchArrayPortion(list, list[i], 0, i) == -1) {
                //3. If not, add it to the resulting array.
                list[count] = list[i];
                count++;
            }
        }
        //4. Return resulting array.
        return arraySegment(list, 0, count);
    }
    /**
     * Method to search for a key in an array from index a to b (not including b).
     */
    public static int searchArrayPortion(int[] array, int key, int a, int b) {
        for (int i = a; i < b; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    /**
     * Method to return an array from index a to b not including b.
     */
    public static int[] arraySegment(int[] array, int a, int b) {
        int[] newArray = new int[b - a];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i + a];
        }
        return newArray;
    }
}