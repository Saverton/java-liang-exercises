/** 
 * (NumberFormatException) Listing 6.8 implements the hex2Dec(String 
 * hexString) method, which converts a hex string into a decimal number.
 * Implement the hex2Dec method to throw a NumberFormatException if the 
 * string is not a hex string.
 * @author Scott M.
 */

import java.util.Scanner;
public class Exercise_12_6 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        input.close();
        
        try {
            System.out.print("The decimal value for hex number " + hex + " is " + hexToDec(hex.toUpperCase()));
        }
        catch (NumberFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    /** 
     * Return the decimal equivalent of a hexadecimal String, throws NumberFormatException if given String is not in Hexadecimal form.
     * @param hex String: hexadecimal number
     * @return int: decimal equivalent
     */
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
    
    /**
     * Return the integer equivalent of a hexadecimal character.
     * @param ch char: hexadecimal character.
     * @return int: decimal equivalent
     */
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
