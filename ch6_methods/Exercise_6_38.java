/**
 * (Generate random characters) Use the methods in RandomCharacter in Listing 
 * 6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
 * @author Scott M.
 */

public class Exercise_6_38 {
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
     * Generate a random uppercase letter.
     * @return char: random uppercase letter
     */
    public static char randomLetter() {
        return (char)((int)(Math.random() * 26) + 'A');
    }
    /**
     * return a random single digit.
     * @return int: random single digit
     */
    public static int randomDigit() {
        return (int)(Math.random() * 10);
    }
}