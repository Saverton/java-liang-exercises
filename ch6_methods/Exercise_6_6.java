/**
 * (Display patterns) Write a method to display a pattern as follows: 
 *                    1
 *                  2 1
 *                3 2 1
 *      ...
 *      n n-1 ... 3 2 1
 * The method header is
 *      public static void displayPattern(int n)
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_6 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int n;
        
        System.out.print("Enter the number of lines: ");
        n = kb.nextInt();
        kb.close();
        
        displayPattern(n);
    }
    /**
     * Method to print out a special pattern with n rows.
     * @param int: number of rows in the pattern
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