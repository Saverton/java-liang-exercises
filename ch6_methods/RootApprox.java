/**
 * Program that uses the Babylonian method to approximate a square root.
 * 
 * @author Scott M.
 * RootApprox.java
 */

import java.util.Scanner;

public class RootApprox {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int number;
        
        System.out.print("Enter an integer: ");
        number = kb.nextInt();
        
        System.out.print("The square root is " + sqrt(number));
    }
    /**
     * Method to approximate square root.
     */
    public static double sqrt(long n) {
        double nextGuess = 1, lastGuess;
        
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        } while (Math.abs(nextGuess - lastGuess) >= 0.0001);
        
        return nextGuess;
    }
}