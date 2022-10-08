/**
 * (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It 
 * uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum, 
 * which is calculated from the other digits using the following formula:
 *      10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 * If the checksum is 10, replace it with 0. Your program should read the input as a 
 * string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_47 {
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
        kb.close();
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