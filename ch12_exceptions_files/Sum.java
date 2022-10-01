/**
 * Class to test an input mismatch exception.
 * 
 * @author Scott M.
 * Sum.java
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Sum {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input1, input2;
        
        do {
            try {
                System.out.print("Enter integer1 and integer2: ");
                input1 = kb.nextInt();
                input2 = kb.nextInt();
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Input should be integer.");
                kb.nextLine();
                continue;
            }
        } while (true);
        
        System.out.print(input1 + " + " + input2 + " = " + (input1 + input2));
    }
}
