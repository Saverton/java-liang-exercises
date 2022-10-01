/**
 * Program to enter a two dimensional array and find the location of the largest element.
 * 
 * @author Scott M.
 * LocateLargest.java
 */

import java.util.Scanner;

public class LocateLargest {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int rows, columns;
        
        System.out.print("Enter the number of rows and columns in the array: ");
        rows = kb.nextInt();
        columns = kb.nextInt();
        
        double[][] array = Functions.createDouble2(rows, columns);
        
        int[] results = findLargest(array);
        
        System.out.print("The location of the largest element is at (" + results[0] + ", " + results[1] + ")");
    }
    /**
     * Method to locate the largest element of a two-dimensional array
     */
    public static int[] findLargest(double[][] array) {
        int[] results = {0, 0};
        double largestElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > largestElement) {
                    results[0] = i;
                    results[1] = j;
                    largestElement = array[i][j];
                }
            }
        }
        return results;
    }
}