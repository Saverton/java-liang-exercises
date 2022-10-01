/**
 * Program to calculate the final digit of an ISBN10 video.
 * 
 * @author Scott M.
 * ISBN10v3.java
 */

import java.util.Scanner;

public class ISBN10v3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //get scanner & vars
        String input;
        int d, d10, sum = 0;
        Scanner kb = new Scanner (System.in);
        
        //get the 1st nine digits
        System.out.print("Enter the first 9 digits of the ISBN10 number: ");
        input = kb.nextLine();
        
        //get the 10 digits
        for (int i = 0; i < 9; i++) {
            d = input.charAt(i) - '0';
            sum += (i + 1) * d;
        }
        
        //calc and display d10
        d10 = sum % 11;
        if (d10 == 10)
            System.out.println("ISBN: " + input + "X");
        else
            System.out.println("ISBN: " + input + d10);
    }
}