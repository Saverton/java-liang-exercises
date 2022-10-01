/**
 * Program to read an array of size 10, display the number of distinct numbers in the array, and then print the list of distinct numbers.
 * 
 * @author Scott M.
 * DistinctNums.java
 */

import java.util.Scanner;

public class DistinctNums {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[] list = new int[10];
        int[] distinct = new int [10];
        int count = 0;
        
        //1. Enter the 10 integers;
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = kb.nextInt();
        }
        
        //2. process the array, counting distinct numbers and adding distinct numbers to an array;
        for (int i = 0; i < list.length; i++) {
            if (!searchArray(list, list[i], i)) {
                distinct[count] = list[i];
                count++;
            }
        }
        
        //3. Display the distinct numbers and array;
        System.out.println("There are " + count + " distinct numbers");
        printArray(distinct, count);
    }
    /**
     * Method to perform a search on an array after a certain index for a specified key and return t/f
     */
    public static boolean searchArray(int[] list, int key, int startIndex) {
        for (int i = startIndex + 1; i < list.length; i++) {
            if (key == list[i]) {
                return true;
            }
        }
        return false;
    }
    /**
     * Method to print an array excluding values of 0.
     */
    public static void printArray(int[] distinct, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }
    }
}