/**
 * Program to calculate the final digit of an ISBN10 video.
 * 
 * @author Scott M.
 * ISBN10.java
 */

import java.util.Scanner;

public class ISBN10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //get scanner & vars
        int input, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        Scanner kb = new Scanner (System.in);
        
        //get the 1st nine digits
        System.out.print("Enter the first 9 digits of the ISBN10 number: ");
        input = kb.nextInt();
        d9 = input % 10;
        input -= d9;
        d8 = input % 100 / 10;
        input -= d8 * 10;
        d7 = input % 1000 / 100;
        input -= d7 * 100;
        d6 = input % 10000 / 1000;
        input -= d6 * 1000;
        d5 = input % 100000 / 10000;
        input -= d5 * 10000;
        d4 = input % ((int)Math.pow(10, 6)) / ((int)Math.pow(10, 5));
        input -= d4 * 100000;
        d3 = input % ((int)Math.pow(10, 7)) / ((int)Math.pow(10, 6));
        input -= d3 * 1000000;
        d2 = (input % ((int)Math.pow(10, 8))) / ((int)Math.pow(10, 7));
        input -= d2 * 10000000;
        d1 = input % ((int)Math.pow(10, 9)) / ((int)Math.pow(10, 8));
        
        //calc and display d10
        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if (d10 == 10)
            System.out.println("ISBN: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        else
            System.out.println("ISBN: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    }
}