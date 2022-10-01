/**
 * Program to calculate the final digit of an ISBN10 video.
 * 
 * @author Scott M.
 * ISBN10v2.java
 */

import java.util.Scanner;

public class ISBN10v2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //get scanner & vars
        String input;
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        Scanner kb = new Scanner (System.in);
        
        //get the 1st nine digits
        System.out.print("Enter the first 9 digits of the ISBN10 number: ");
        input = kb.nextLine();
        
        //get the 10 digits
        d1 = input.charAt(0) - '0';
        d2 = input.charAt(1) - '0';
        d3 = input.charAt(2) - '0';
        d4 = input.charAt(3) - '0';
        d5 = input.charAt(4) - '0';
        d6 = input.charAt(5) - '0';
        d7 = input.charAt(6) - '0';
        d8 = input.charAt(7) - '0';
        d9 = input.charAt(8) - '0';
                
        
        //calc and display d10
        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if (d10 == 10)
            System.out.println("ISBN: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        else
            System.out.println("ISBN: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    }
}