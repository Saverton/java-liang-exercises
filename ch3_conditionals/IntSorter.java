/**
 * Program to sort 3 ints in increasing order.
 * 
 * @author Scott M.
 * IntSorter.java
 */

import java.util.Scanner;

public class IntSorter {
    /**
     * Main method to run program
     */
    public static void main(String[] args) {
        //define vars and scanner
        int val1, val2, val3, temp, top, mid, low;
        Scanner kb = new Scanner (System.in);
        //get 3 ints
        System.out.print("Enter 3 integers: ");
        val1 = kb.nextInt();
        val2 = kb.nextInt();
        val3 = kb.nextInt();
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