/**
 * Program to display the first 100 Emirps (Prime #s who's reverse is also prime).
 * 
 * @author Scott M.
 * Emirp.java
 */

public class Emirp {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count = 0;
        String line = "";
        
        for (int i = 2; count <= 100; i++) {
            if (PalindromicPrime.isPrime(i) && !PalindromicPrime.isPalindrome(i) && reversePrime(i)) {
                line += i + " ";
                count++;
                if (count % 10 == 0) {
                    System.out.println(line);
                    line = "";
                }
            }
        }
    }
    /**
     * Method to check if the reverse of a number is prime.
     */
    public static boolean reversePrime(int num) {
        String str = "" + num, rstr = "";
        
        //reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        
        //get reverse int
        num = Integer.parseInt(rstr);
        
        //check if int is prime
        return PalindromicPrime.isPrime(num);
    }
}