/** Program to convert hexidecimal Strings to Decimal values, uses exception to detect invalid
 * input.
 * 
 * @author Scott M.
 * HexToDec.java
 */

import java.util.Scanner;
public class HexToDec {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        
        try {
            System.out.print("The decimal value for hex number " + hex + " is " + hexToDec(hex.toUpperCase()));
        }
        catch (NumberFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    /** Convert a hex String into a decimal int */
    public static int hexToDec(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!Character.isDigit(hexChar) && (hexChar < 'A' || hexChar > 'F'))
                throw new NumberFormatException("String is not a hex value");
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    
    /** Convert a hex Char into a decimal int */
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
