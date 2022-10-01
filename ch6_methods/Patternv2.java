/**
 * Program to create a number pattern with n lines.
 * 
 * @author Scott M.
 * Patternv2.java
 */

import java.util.Scanner;

public class Patternv2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int n;
        
        System.out.print("Enter the number of lines: ");
        n = kb.nextInt();
        
        displayPattern(n);
    }
    /**
     * Method to display the pattern.
     */
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("    ");
            }
            for (int k = i; k > 0; k--) {
                System.out.printf("%-4d", k);
            }
            System.out.println();
        }
    }
}