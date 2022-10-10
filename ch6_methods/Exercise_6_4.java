/**
 * (Display an integer reversed) Write a method with the following header to display 
 * an integer in reverse order:
 *      public static void reverse(int number)
 * For example, reverse(3456) displays 6543. Write a test program that prompts 
 * the user to enter an integer and displays its reversal.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = kb.nextInt();
        kb.close();
        
        System.out.print(num + " reversed is " + reverse(num));
    }
    /**
     * Method to reverse an int.
     * @param int: integer number
     * @return int: the reversed integer
     */
    public static int reverse(int num) {
        char temp;
        String reverse = "";
        while (num > 0) {
            temp = (char)('0' + (num % 10));
            reverse += temp;
            num /= 10;
        }
        return Integer.parseInt(reverse);
    }
}