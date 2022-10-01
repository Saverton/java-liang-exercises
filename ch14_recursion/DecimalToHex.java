/** Program to recursively convert a decimal number into its Hexadecimal equivalent.
 * 
 * @author Scott M.
 * DecimalToHex.java
 */

import java.util.Scanner;

public class DecimalToHex {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input;
        
        System.out.print("Enter a positive nonzero integer: ");
        input = kb.nextInt();
        System.out.print("Hexadecimal equivalent is " + decToHex(input));
    }
    
    /** Return Hexadecimal equivalent of in as a string.
     * @params Integer: int
     * @return Hexadecimal number: String
     */
    public static String decToHex(int num) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (num == 0) {
            return ("");
        }
        else {
            return (decToHex(num / 16) + hex[num % 16]);
        }
    }
}