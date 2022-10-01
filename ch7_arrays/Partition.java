/**
 * Program to form a partitioned list on the pivot of the first index of an array.
 * 
 * @author Scott M.
 * Partition.java
 */

import java.util.Scanner;

public class Partition {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter list: ");
        int[] list = new int[kb.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = kb.nextInt();
        }
        
        partition(list);
        System.out.print("Partitioned list is: ");
        printArray(list);
    }
    /**
     * Method to partition a list.
     */
    public static void partition(int[] list) {
        int pivot = list[0], temp, pivotIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] < pivot) {
                temp = list[i];
                list[i] = pivot;
                list[pivotIndex] = temp;
                pivotIndex = i;
            }
        }
    }
    /**
     * method to print the list.
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}