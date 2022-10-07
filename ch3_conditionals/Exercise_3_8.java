/**
 * (Sort three integers) Write a program that prompts the user to enter three integers 
 * and display the integers in non-decreasing order.
 * @author Scott M.
 * IntSorter.java
 */

import java.util.Scanner;

public class Exercise_3_8 {
    /**
     * Main method to run program
     */
    public static void main(String[] args) {
        //define vars and scanner
        int val1, val2, val3, top, mid, low;
        Scanner kb = new Scanner (System.in);
        //get 3 ints
        System.out.print("Enter 3 integers: ");
        val1 = kb.nextInt();
        val2 = kb.nextInt();
        val3 = kb.nextInt();
        kb.close();
        //sort in order
        if (val1 > val2 && val1 > val3) {
            top = val1;
            if (val2 < val3) {
                low = val2;
                mid = val3;
            }
            else {
                low = val3;
                mid = val2;
            }
        }
        else if (val2 > val3 && val2 > val1) {
            top = val2;
            if (val1 < val3) {
                low = val1;
                mid = val3;
            }
            else {
                low = val3;
                mid = val1;
            }
        }
        else {
            top = val3;
            if (val2 < val1) {
                low = val2;
                mid = val1;
            }
            else {
                low = val1;
                mid = val2;
            }
        }
        //display
        System.out.println("The integers in order are: " + low + ", " + mid + ", " + top + ".");
    }
}