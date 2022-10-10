/**
 * (Check password) Some websites impose certain rules for passwords. Write a 
 * method that checks whether a string is a valid password. Suppose the password 
 * rules are as follows:
 *   ■ A password must have at least eight characters.
 *   ■ A password consists of only letters and digits.
 *   ■ A password must contain at least two digits.
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_18 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String password;
        
        System.out.print("Enter a password: ");
        password = kb.nextLine();
        kb.close();
        
        checkPassword(password);
    }
    /**
     * Break down a given password and return a boolean corresponding to if the password is considered valid.
     * @param String: password
     * @return boolean: True = password is valid, false otherwise
     */
    public static boolean checkPassword(String password) {
        int digits = 0, other = 0;
        char temp;
        
        for (int i = 0; i < password.length(); i++) {
            temp = password.charAt(i);
            if (Character.isDigit(temp)) {
                digits++;
            }
            else if (Character.isLetter(temp)) {
            }
            else {
                other++;
            }
        }
        // password must be at least 8 chars long, have no nonalphanumeric characters, and have at least 2 digits
        return (password.length() >= 8 && other == 0 && digits >= 2);
    }
}