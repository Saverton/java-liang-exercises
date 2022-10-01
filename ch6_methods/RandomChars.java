/**
 * Program to generate a field of random characters.
 * 
 * @author Scott M.
 * RandomChars.java
 */

public class RandomChars {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print((i % 10 == 0) ? randomLetter() + "\n" : randomLetter() + " ");
        }
        
        for (int i = 1; i <= 100; i++) {
            System.out.print((i % 10 == 0) ? randomDigit() + "\n" : randomDigit() + " ");
        }
    }
    /**
     * Method to generate a random uppercase letter.
     */
    public static char randomLetter() {
        return (char)((int)(Math.random() * 26) + 'A');
    }
    /**
     * Method to generate a random single digit.
     */
    public static int randomDigit() {
        return (int)(Math.random() * 10);
    }
}