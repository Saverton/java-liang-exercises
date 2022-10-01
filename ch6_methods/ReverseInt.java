/**
 * Program to reverse an integer and display its output.
 * 
 * @author Scott M.
 * ReverseInt.java
 */

import java.util.Scanner;

public class ReverseInt {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = kb.nextInt();
        
        System.out.print(num + " reversed is " + NumPalindrome.reverse(num));
    }
}