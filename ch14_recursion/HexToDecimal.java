/** Program to recursively convert a Hexadecimal number to a decimal number.
 * 
 * @author Scott M.
 * HexToDecimal.java
 */

import java.util.Scanner;

public class HexToDecimal {
    /** Hexadecimal translation String. */
    public static final String HEX_STRING = "0123456789ABCDEF";
    
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String hex;
        
        System.out.print("Enter a Hexadecimal number: ");
        hex = kb.nextLine();
        System.out.print("Decimal equivalent is " + hexToDec(hex));
    }
    
    /** Return a decimal equivalent of a hexadecimal number.
     * @params Hexadecimal number: String
     * @return Decimal number: int
     */
    public static int hexToDec(String hex) {
        if (hex.length() == 0) {
            return (0);
        }
        else {
            return ((HEX_STRING.indexOf(hex.charAt(0)) * (int)Math.pow(16, hex.length() - 1)) + hexToDec(hex.substring(1, hex.length())));
        }
    }
}