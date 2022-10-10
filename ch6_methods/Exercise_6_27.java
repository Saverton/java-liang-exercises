/**
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number 
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17 
 * and 71 are emirps. Write a program that displays the first 100 emirps. Display 10 
 * numbers per line, separated by exactly one space, as follows:
 * 13 17 31 37 71 73 79 97 107 113 
 * 149 157 167 179 199 311 337 347 359 389
 * ...
 * @author Scott M.
 */

public class Exercise_6_27 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int count = 0;
        String line = "";
        
        for (int i = 2; count <= 100; i++) {
            if (isPrime(i) && !isPalindrome(i) && reversePrime(i)) {
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
     * Return whether or not a number is prime.
     * @param int: number
     * @return boolean: true = number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2.0; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Return whether or not a number is a palindrome.
     * @param int: number
     * @return boolean: true = number is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int num) {
        String str = "" + num;
        
        for (int i = 0; i + 1 <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Return true if the reverse of a number is prime
     * @param int: number
     * @return boolean: true = reverse is prime, false otherwise
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
        return isPrime(num);
    }
}