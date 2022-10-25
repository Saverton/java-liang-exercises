/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * ■ Creates an array with 100 randomly chosen integers.
 * ■ Prompts the user to enter the index of the array, then displays the corresponding 
 *   element value. If the specified index is out of bounds, display the 
 *   message Out of Bounds.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_12_3 {
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
        kb.close();
    }
}
