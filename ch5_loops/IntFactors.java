/**
 * Program to calculate the factors of a user entered integer.
 * 
 * @author Scott M.
 * IntFactors.java
 */

import java.util.Scanner;

public class IntFactors {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input, factor;
        String factors = "1";
        
        System.out.print("Enter an integer: ");
        input = kb.nextInt();
        
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