/**
 * (Find the factors of an integer) Write a program that reads an integer and displays 
 * all its smallest factors in increasing order. For example, if the input integer is 
 * 120, the output should be as follows: 2, 2, 2, 3, 5.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_16 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input, factor;
        String factors = "1";
        
        System.out.print("Enter an integer: ");
        input = kb.nextInt();
        kb.close();
        
        for (factor = 2; factor <= input; factor++) {
            if (input % factor == 0) {
                factors += ", " + factor ;
            }
        }
        
        String factors1 = factors.substring(0, factors.lastIndexOf(','));
        String factors2 = factors.substring(factors.lastIndexOf(',') + 1);
        factors = factors1 + " and" + factors2;
        
        System.out.print("The factors of " + input + " are: " + factors + ".");
        }
    }