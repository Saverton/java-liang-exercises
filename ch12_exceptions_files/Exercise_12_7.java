/** 
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the 
 * bin2Dec method to throw a NumberFormatException if the string is not a 
 * binary string.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_12_7 {
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
        catch (NumberFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    /** 
     * Return the decimal equivalent of a binary number passed as a String. Throws NumberFormatException if String is not a valid binary number.
     * @param binaryString String: binary number
     * @return int: decimal equivalent
     */
    public static int binToDec(String binaryString) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char binChar = binaryString.charAt(i);
            if (binChar < '0' || binChar > '1')
                throw new NumberFormatException("Non-binary String");
            decimalValue = decimalValue * 2 + (binChar - '0');
        }
        return decimalValue;
    }
}
