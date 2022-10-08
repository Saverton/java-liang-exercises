/**
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest 
 * of them, and counts its occurrences. Assume that the input ends with number 
 * 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest 
 * is 5 and the occurrence count for 5 is 4.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_41 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input, max = 0, occur = 1;
        
        do {
            System.out.print("Enter an Integer (input ends when 0 is entered): ");
            input = kb.nextInt();
            kb.close();
            if (input > max) {
                max = input;
                occur = 1;
            }
            else if (input == max) {
                occur += 1;
            }
        } while (input != 0);
        
        System.out.print("The max number, " + max + ", occurs " + occur + " times.");
    }
}