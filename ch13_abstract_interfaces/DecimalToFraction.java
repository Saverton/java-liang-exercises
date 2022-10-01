/** Program to convert decimal numbers to fractions.
 * 
 * @author Scott M.
 * DecimalToFraction.java
 */

import java.util.Scanner;


public class DecimalToFraction {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;
        BigRational integer, fraction, result;
        
        System.out.print("Enter a decimal number: ");
        input = kb.nextLine();
        
        
        integer = new BigRational(Integer.parseInt(input.substring(0, input.indexOf('.'))), 1);
        fraction = new BigRational((long)Integer.parseInt(input.substring(input.indexOf('.') + 1)), (long)Math.pow(10, (input.substring(input.indexOf('.') + 1)).length()));
        result = integer.add(fraction);
        if (input.charAt(0) == '-' && input.charAt(1) == '0')
            result = result.multiply(new BigRational(-1, 1));
        System.out.println(result);
    }
}