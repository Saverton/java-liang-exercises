/**
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, 
 * which is calculated from the other nine digits using the following formula:
 *      (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 
 * convention. Write a program that prompts the user to enter the first 9 digits and 
 * displays the 10-digit ISBN (including leading zeros). Your program should read 
 * the input as an integer. 
 * @author Scott M.
 * ISBN10.java
 */

import java.util.Scanner;

public class Exercise_3_9 {
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
        kb.close();
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