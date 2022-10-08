/**
 * (Business application: checking ISBN) Use loops to simplify Programming 
 * Exercise 3.9.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_36 {
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
        kb.close();
        
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