/** Program to recursively convert a binary number into its decimal equivalent.
 * 
 * @author Scott M.
 * BinaryToDecimal.java
 */

import java.util.Scanner;

public class BinaryToDecimal {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;
        
        System.out.print("Enter a binary number: ");
        input = kb.nextLine();
        System.out.print("Decimal equivalent is " + binToDec(input));
    }
    
    /** Return the Decimal equivalent of a Binary number.
     * 
     * @params Binary number: String
     * @return Decimal number: int
     */
    public static int binToDec(String binary) {
        if (binary.length() == 0) {
            return (0);
        }
        else {
            if (binary.charAt(0) == '1') {
                return ((int)Math.pow(2, binary.length() - 1) + binToDec(binary.substring(1, binary.length())));
            }
            else if (binary.charAt(0) == '0') {
                return (binToDec(binary.substring(1, binary.length())));
            }
            else {
                System.out.println("Binary number is invalid.");
                return (0);
            }
        }
    }
}