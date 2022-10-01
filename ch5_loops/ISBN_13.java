/**
 * Program to calculate the final digit of an ISBN-13 number.
 * 
 * @author Scott M.
 * ISBN_13.java
 */

import java.util.Scanner;

public class ISBN_13 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, output;
        int d13, sum = 0, temp;
        
        //1. input the first 12 digits.
        System.out.print("Enter the first 12 figits of an ISBN-13 as a string: ");
        input = kb.nextLine();
        if (input.length() != 12) {
            System.out.print("Error: must enter exactly 12 digits.");
            System.exit(1);
        }
        //2. Sum digits as they are found, if the input digit is even x3 it before adding.
        for (int i = 0; i < 12; i++) {
            temp = input.charAt(i) - '0';
            if (i % 2 == 0) {
                temp *= 3;
            }
            sum += temp;
        }
        //3. calculate the 13th digit, if it is 10 set it to 0.
        d13 = 10 - (sum % 10);
        if (d13 == 10) {
            d13 = 0;
        }
        //4. add d13 to output.
        output = input + d13;
        //5. display output.
        System.out.print("The ISBN-13 number is " + output);
    }
}