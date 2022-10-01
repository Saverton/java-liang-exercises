/**
 * Program to convert a 2 character code into a college student status.
 * 
 * @author Scott M.
 * StudentMajor.java
 */

import java.util.Scanner;

public class StudentMajor {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, year, major;
        
        System.out.print("Enter two characters (M, C, I and 1, 2, 3, 4): ");
        input = kb.next();
        if (input.length() != 2) {
            System.out.print("Enter only 2 characters please.");
            System.exit(1);
        }
        
        if (Character.toUpperCase(input.charAt(0)) == 'M') {
            major = "Mathematics";
        }
        else if (Character.toUpperCase(input.charAt(0)) == 'C') {
            major = "Computer Science";
        }
        else if (Character.toUpperCase(input.charAt(0)) == 'I') {
            major = "Information Technology";
        }
        else {
            major = "";
            System.out.print("Invalid input.");
            System.exit(1);
        }
        
        switch (input.charAt(1)) {
            case '1': year = "Freshman";
                      break;
            case '2': year = "Sophomore";
                      break;
            case '3': year = "Junior";
                      break;
            case '4': year = "Senior";
                      break;
            default: year = "";
                     System.out.print("Invalid input.");
                     System.exit(1);
        }
        
        System.out.print(major + " " + year + ".");
    }
}