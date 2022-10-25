/** (HexFormatException) Exercise 12.6 implements the hex2Dec method to 
 * throw a NumberFormatException if the string is not a hex string. Define 
 * a custom exception called HexFormatException. Implement the hex2Dec
 * method to throw a HexFormatException if the string is not a hex string.
 * @author Scott M.
 */

import java.util.Scanner;
public class Exercise_12_8 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a hex number: ");
        String hex = kb.nextLine();
        kb.close();
        
        try {
            System.out.print("The decimal value for hex number " + hex + " is " + hexToDec(hex.toUpperCase()));
        }
        catch (HexFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    /** 
     * Return the decimal equivalent of a hexadecimal String, throws HexFormatException if given String is not in Hexadecimal form.
     * @param hex String: hexadecimal number
     * @return int: decimal equivalent
     */
    public static int hexToDec(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!Character.isDigit(hexChar) && (hexChar < 'A' || hexChar > 'F'))
                throw new HexFormatException(hex);
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

class HexFormatException extends NumberFormatException {
    String hex;
    
    /** Construct a Default HexFormatException */
    public HexFormatException() {
        this("(null)");
    }
    
    /** Construct a HexFormatException that holds the invalid hex string.
     * @param hex String: invalid hex String
     */
    public HexFormatException(String hex) {
        super("invalid hex format");
        this.hex = hex;
    }
    
    /** Return a String with info about this exception 
     * @return String: exception info
     */
    @Override
    public String getMessage() {
        return (super.getMessage() + " " + hex);
    }
}
