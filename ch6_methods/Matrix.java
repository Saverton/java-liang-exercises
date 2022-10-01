/**
 * Program to generate a random matrix of numbers (0 or 1) of height and width n.
 * 
 * @author Scott M.
 * Matrix.java
 */

import java.util.Scanner;

public class Matrix {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int n;
        
        System.out.print("Enter the dimension for the matrix: ");
        n = kb.nextInt();
        
        printMatrix(n);
    }
    /**
     * Method to print a matrix of 0s and 1s.
     */
    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(rand() + " ");
            }
            System.out.println();
        }
    }
    /**
     * Method to generate a random number 0 or 1.
     */
    public static int rand() {
        return (int)(Math.random() * 2);
    }
}