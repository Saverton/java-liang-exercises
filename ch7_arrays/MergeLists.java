/**
 * Program to merge two sorted lists into a new sorted list.
 * 
 * @author Scott M.
 * MergeLists.java
 */

import java.util.Scanner;

public class MergeLists {
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
     * Method to merge two lists.
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
     * Method to sort a list.
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