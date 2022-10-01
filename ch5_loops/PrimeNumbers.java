/**
 * Program to calculate and display all prime numbers from 2 to 1,000.
 * 
 * @author Scott M.
 * PrimeNumbers.java
 */

public class PrimeNumbers {
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