/** Program to convert a String of binary numbers to its integer form.
 * 
 * @author Scott M.
 * BinToDec2.java
 */

import java.util.Scanner;

public class BinToDec2 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binaryString = kb.nextLine();
        
        try {
            System.out.print("The decimal value for binary number " + binaryString +
                             " is " + binToDec(binaryString));
        }
        catch (BinaryFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    /** Method to convert a Binary number String to an integer
     * @params Binary number
     * @return integer
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
