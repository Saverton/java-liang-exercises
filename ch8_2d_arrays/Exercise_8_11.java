/**
 * (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some 
 * face up and some face down. You can represent the state of the coins using a 
 * 3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
 *      0 0 0   1 0 1   1 1 0   1 0 1   1 0 0
 *      0 1 0   0 0 1   1 0 0   1 1 0   1 1 1
 *      0 0 0   1 0 0   0 0 1   1 0 0   1 1 0 
 * Each state can also be represented using a binary number. For example, the preceding 
 * matrices correspond to the numbers
 *      000010000 101001100 110100001 101110100 100111110
 * There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, 
 * . . . , and 511 to represent all states of the matrix. Write a program that prompts 
 * the user to enter a number between 0 and 511 and displays the corresponding 
 * matrix with the characters H and T. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int number;
        String binary;
        
        System.out.print("Enter a number between 0 and 511: "); 
        number = kb.nextInt();
        kb.close();
        
        binary = Integer.toBinaryString(number);
        System.out.println(binary);
        while (binary.length() < 9) {
            binary = "0" + binary;
        }
        System.out.println(binary);
        
        printHOrT(binary);
    }
    /**
     * Print out a 9 character long binary string representing 9 coin flips (0=heads,1=tails) in a 3x3 grid.
     * @param binary String: string of 0s and 1s representing 9 coin flips
     */
    public static void printHOrT(String binary) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((binary.charAt(i * 3 + j) == '0') ? "H " : "T ");
            }
            System.out.println();
        }
    }
}