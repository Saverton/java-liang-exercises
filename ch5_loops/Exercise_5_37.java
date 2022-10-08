/**
 * (Decimal to binary) Write a program that prompts the user to enter a decimal 
 * integer and displays its corresponding binary value. Don’t use Java’s Integer.toBinaryString(int) 
 * in this program.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_37 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input;
        long binary = 0;
        
        System.out.print("Enter an integer: ");
        input = kb.nextInt();
        kb.close();
        System.out.println(Integer.toBinaryString(input));
        
        for (int i = 20; i > 1; i--) {
            if (input / (int)Math.pow(2, i) > 0) {
                binary += Math.pow(10, i);
                input -= (int)Math.pow(2, i);
            }
        }
        if (input % 2 != 0) {
            binary += 1;
            input -= 1;
        }
        
        System.out.print(binary);
    }
}