/** Program to reverse an input String using a recursive method with a helper method.
 * 
 * @author Scott M.
 * ReverseString.java
 */

import java.util.Scanner;

public class ReverseString {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a String: ");
        System.out.print("Reverse string is \"" + reverseDisplay(kb.nextLine()) + "\"");
    }
    
    /** Return a string that is in the reverse order of the input String.
     * @params Origin String
     * @return Reverse String
     */
    public static String reverseDisplay(String s) {
        return (reverseDisplay(s, s.length()));
    }
    
    /** Return a string that is in the reverse order of the input String.
     * @params Origin String, index of swap
     * @return Reverse String
     */
    public static String reverseDisplay(String s, int high) {
        high--;
        if (high == 0) {
            return (s);
        }
        else {
            return (s.charAt(high) + reverseDisplay(s.substring(0, high)));
        }
    }
}