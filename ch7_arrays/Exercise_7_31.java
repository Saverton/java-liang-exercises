/**
 * (Merge two sorted lists) Write the following method that merges two sorted lists 
 * into a new sorted list.
 *      public static int[] merge(int[] list1, int[] list2)
 * Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. Write a test program that prompts the user to enter two 
 * sorted lists and displays the merged list. Here is a sample run. Note that the first 
 * number in the input indicates the number of the elements in the list. This number 
 * is not part of the list.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_31 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        
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
        
        //Sort list1 and list2
        sortList(list1);
        sortList(list2);
        
        //merge lists and sort;
        int[] list3 = merge(list1, list2);
        sortList(list3);
        
        System.out.print("List3 is: ");
        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i] + ", ");
        }
    }
    /**
     * Return a merged array from two arrays of integers
     * @param list1 int[]: first array of integers
     * @param list2 int[]: seconds array of integers
     * @return int[]: merged array
     */
    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
        for (int i = 0; i < list3.length; i++) {
            if (i < list1.length) {
                list3[i] = list1[i];
            }
            else {
                list3[i] = list2[i - list1.length];
            }
        }
        return list3;
    }
    /**
     * Sort an array of integers using a selection sort.
     * @param array int[]: array of integers
     */
    public static void sortList(int[] array) {
        boolean doNextPass = false;
        int temp;
        do  {
            doNextPass = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    doNextPass = true;
                }
            }
        } while (doNextPass);
    }
}