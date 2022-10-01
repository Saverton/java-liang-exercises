/**
 * Program to convert decimal integers into binary code.
 * 
 * @author Scott M.
 * DecToOct.java
 */

import java.util.Scanner;

public class DecToOct {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int input, digits = 0;
        String octal = "";
        
        System.out.print("Enter an integer: ");
        input = kb.nextInt();
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
