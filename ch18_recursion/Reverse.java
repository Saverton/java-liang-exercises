/** Program to display an integer in reverse order.
 * 
 * @author Scott M.
 * Reverse.java
 */

import java.util.Scanner;

public class Reverse {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        reverseDisplay(kb.nextInt());
        kb.nextLine();
        System.out.println();
        
        System.out.print("Enter a String: ");
        reverseDisplay(kb.nextLine());
    }
    
    /** Return the reverse integer
     * @params integer
     */
    public static void reverseDisplay(int value) {
        System.out.print(value % 10);
        if (value > 10)
            reverseDisplay(value / 10);
    }
    
    /** Return the reverse String
     * @params String
     */
    public static void reverseDisplay(String value) {
        System.out.print(value.charAt(value.length() - 1));
        if (value.length() > 1)
            reverseDisplay(value.substring(0, value.length() - 1));
    }
}