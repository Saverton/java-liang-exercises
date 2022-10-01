/**
 * Program to test handling an array out of bounds exception.
 * 
 * @author Scott M.
 * ArrayOutOfBounds.java
 */

import java.util.Scanner;

public class ArrayOutOfBounds {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        
        System.out.print("Enter an array index: ");
        try {
            int value = arr[kb.nextInt()];
            System.out.print("value is " + value);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print("Out of bounds");
        }
    }
}
