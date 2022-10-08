/**
 * (Decimal to octal) Write a program that prompts the user to enter a decimal 
 * integer and displays its corresponding octal value. Don’t use Java’s Integer.toOctalString(int) 
 * in this program.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_38 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input, digits = 0;
        String octal = "";
        
        System.out.print("Enter an integer: ");
        input = kb.nextInt();
        kb.close();
        System.out.println(Integer.toOctalString(input));
        
        for (int i = 1; (int)(input / Math.pow(8, i)) > 0; i++) {
            digits = i;
        }
        
        for (int j = digits; j > 0; j--) {
            octal += (int)(input / Math.pow(8, j));
            input %= Math.pow(8, j);
        }
        octal += input;
        
        System.out.print(octal);
    }
}
