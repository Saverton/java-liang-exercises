/**
 * Program to display a large array of numbers in a pyramid pattern.
 * 
 * @author Scott M.
 * Pyramid1.java
 */

import java.util.Scanner;

public class Pyramid1 {
    /**
     * Main method to run program.
     */
    public static void main(String [] args) {
        //Display a pyramid of numbers. user enters lines.
        Scanner kb = new Scanner (System.in);
        System.out.print("Enter the number of lines: ");
        int lines = kb.nextInt();
        if (lines > 15 || lines < 0) {
            System.out.print("Error: Invalid input.");
            System.exit(1);
        }
        //1. Get a number for the line.
        for (int line = 1; line <= lines; line++) {
            //2. enter 15 - line blank spaces
            for (int i = 1; i <= 15 - line; i++) {
                System.out.print("   ");
            }
            //3. enter line, line -1 ,line - 2, etc. until output is 1
            for (int j = line; j != 1; j--) {
                System.out.printf("%-3d", j);
            }
            //4. enter 1, 1 + 1, 1 + 2, etc. until output is line
            for (int k = 1; k <= line; k++) {
                System.out.printf("%-3d", k);
            }
            //5. break for the next line.
            System.out.println();
        }
    }
}
