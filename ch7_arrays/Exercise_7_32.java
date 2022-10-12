/**
 * (Partition of a list) Write the following method that partitions the list using the 
 * first element, called a pivot.
 * public static int partition(int[] list)
 * After the partition, the elements in the list are rearranged so that all the elements 
 * before the pivot are less than or equal to the pivot and the elements after the pivot 
 * are greater than the pivot. The method returns the index where the pivot is located in 
 * the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition, 
 * the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes 
 * at most list.length comparisons. Write a test program that prompts the user 
 * to enter a list and displays the list after the partition. Here is a sample run. Note 
 * that the first number in the input indicates the number of the elements in the list. 
 * This number is not part of the list.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_32 {
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
        kb.close();
        
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