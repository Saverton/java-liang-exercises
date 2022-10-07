/**
 * (Random character) Write a program that displays a random uppercase letter 
 * using the Math.random() method.
 * @author Scott M.
 * RandomLetter.java
 */

public class Exercise_4_16 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars
        char letter;
        
        //generate random number from 1-26, and assign it to a letter
        letter = (char)('A' + (int)(Math.random() * 26));
        
        //display the letter
        System.out.print(letter);
    }
}