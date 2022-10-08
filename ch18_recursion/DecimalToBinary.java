/** Program to recursively convert a decimal number into its binary equivalent.
 * 
 * @author Scott M.
 * DecimalToBinary.java
 */

import java.util.Scanner;

public class DecimalToBinary {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input;
        
        System.out.print("Enter a positive integer: ");
        input = kb.nextInt();
        System.out.print("Binary equivalent is " + decToBin(input));
    }
    
    /** Return Binary equivalent of in as a string.
     * @params Integer: int
     * @return Binary number: String
     */
    public static String decToBin(int num) {
        if (num == 0) {
            return ("");
        }
        else {
            if (num % 2 == 0) {
                return (decToBin(num / 2) + "0");
            }
            else {
                return (decToBin(num / 2) + "1");
            }
        }
    }
}