/**
 * Program to find the index of the minimum number in an array.
 * 
 * @author Scott M.
 * IndexOfMin.java
 */

import java.util.Scanner;

public class IndexOfMin {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] array = new double[10];
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextDouble();
        }
        
        System.out.println("The minimum number is: " + Min.min(array));
        System.out.print("The index of the minimum number is: " + indexOf(array, Min.min(array), 0));
    }
    /**
     * Method to return the first index of a double key in a double array.
     */
    /**
     * Method to perform a search on an array after a certain index for a specified key and return t/f
     */
    public static int indexOf(double[] list, double key, int startIndex) {
        for (int i = startIndex + 1; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}