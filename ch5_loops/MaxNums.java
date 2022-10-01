/**
 * Program to read input of a certain amount of integers, determine the maximum value, and state how many times in the series that value occured.
 * 
 * @author Scott M.
 * MaxNums.java
 */

import java.util.Scanner;

public class MaxNums {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input, max = 0, occur = 1;
        
        do {
            System.out.print("Enter an Integer (input ends when 0 is entered): ");
            input = kb.nextInt();
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