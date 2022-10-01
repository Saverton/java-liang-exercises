/**
 * Program to check if a password is valid to create.
 * 
 * @author Scott M.
 * checkPassword.java
 */

import java.util.Scanner;

public class CheckPassword {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String password;
        
        System.out.print("Enter a password: ");
        password = kb.nextLine();
        
        checkPassword(password);
    }
    /**
     * Method to process password.
     */
    public static void checkPassword(String password) {
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
        //System.out.println("Characters: " + password.length() + ", Other: " + other + ", Digts: " + digits);
        
        if (validPassword(password.length(), other, digits)) {
            System.out.print(password + " is a valid password");
        }
        else {
            System.out.print(password + " is not a valid password");
        }
    }
    /**
     * Method to determine if password is valid.
     */
    public static boolean validPassword(int characters, int other, int digits) {
        if (characters < 8) {
            return false;
        }
        else if (other > 0) {
            return false;
        }
        else if (digits < 2) {
            return false;
        }
        else {
            return true;
        }
    }
}