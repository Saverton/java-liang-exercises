/**
 * Program to generate a random uppercase letter.
 * 
 * @author Scott M.
 * RandomLetter.java
 */

public class RandomLetter {
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