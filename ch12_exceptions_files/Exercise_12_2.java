/**
 * (InputMismatchException) Write a program that prompts the user to read 
 * two integers and displays their sum. Your program should prompt the user to 
 * read the number again if the input is incorrect
 * @author Scott M.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise_12_2 {
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
        kb.close();
        
        System.out.print(input1 + " + " + input2 + " = " + (input1 + input2));
    }
}
