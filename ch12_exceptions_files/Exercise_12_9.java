/** 
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method 
 * to throw a BinaryFormatException if the string is not a binary string. 
 * Define a custom exception called BinaryFormatException. Implement the 
 * bin2Dec method to throw a BinaryFormatException if the string is not a 
 * binary string
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_12_9 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binaryString = kb.nextLine();
        kb.close();
        
        try {
            System.out.print("The decimal value for binary number " + binaryString +
                             " is " + binToDec(binaryString));
        }
        catch (BinaryFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    /** 
     * Return the decimal equivalent of a Binary number passed as a String. Throw a BinaryFormatException if the Binary String is invalid.
     * @param binaryString String: binary number
     * @return int: decimal equivalent
     */
    public static int binToDec(String binaryString) throws BinaryFormatException {
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char binChar = binaryString.charAt(i);
            if (binChar < '0' || binChar > '1')
                throw new BinaryFormatException(binaryString);
            decimalValue = decimalValue * 2 + (binChar - '0');
        }
        return decimalValue;
    }
}

class BinaryFormatException extends NumberFormatException {
    String bin;
    
    /** Construct a Default BinaryFormatException */
    public BinaryFormatException() {
        this("(null)");
    }
    
    /** Construct a BinaryFormatException that holds the invalid binary String.
     * @param bin String: invalid binary String
     */
    public BinaryFormatException(String bin) {
        super("invalid binary format");
        this.bin = bin;
    }
    
    /** Return a String with info about the exception 
     * @return String: exception info
     */
    @Override
    public String getMessage() {
        return (super.getMessage() + " " + bin);
    }
}