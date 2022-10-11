/**
 * (Reverse the numbers entered) Write a program that reads ten integers and displays 
 * them in the reverse of the order in which they were read.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_7_2 {
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
        kb.close();
        
        list = reverse(list);
        
        printArray(list);
    }
    /**
     * Return a new array that is a copy in reverse order of another array.
     * @param list int[]: the normal array
     * @return int[]: the new reversed array
     */
    public static int[] reverse(int[] list) {
        int[] reverseList = new int[list.length];
        
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverseList[i] = list[j];
        }
        
        return reverseList;
    }
    /**
     * Print out each element of an array separated by commas
     * @param int[]: array of integers
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print((i == list.length - 1) ? list[i] : list[i] + ", ");
        }
    }
}