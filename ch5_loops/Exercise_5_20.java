/**
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all 
 * the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers 
 * per line. Numbers are separated by exactly one space.
 * @author Scott M.
 */

public class Exercise_5_20 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count = 0;
        boolean prime = true;
        
        for (int number = 2; number <= 1000; number++) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(number + " ");
                count++;
            }
            else {
                prime = true;
            }
            if (count == 8) {
                System.out.println();
                count = 0;
            }
        }
    }
}