/**
 * (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using 
 * the following header:
 *      public static void printMatrix(int n)
 * Each element is 0 or 1, which is generated randomly. Write a test program that 
 * prompts the user to enter n and displays an n-by-n matrix.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_17 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int n;
        
        System.out.print("Enter the dimension for the matrix: ");
        n = kb.nextInt();
        kb.close();
        
        printMatrix(n);
    }
    /**
     * print a matrix of given size of 0s and 1s
     * @param int: size of matrix n
     */
    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(randomBinary() + " ");
            }
            System.out.println();
        }
    }
    /**
     * Generate random binary digit 0 or 1.
     * @return int: random binary digit (0 or 1)
     */
    public static int randomBinary() {
        return (int)(Math.random() * 2);
    }
}