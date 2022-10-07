/**
 * (Student major and status) Write a program that prompts the user to enter two 
 * characters and displays the major and status represented in the characters. The first 
 * character indicates the major and the second is number character 1, 2, 3, 4, which 
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose 
 * the following chracters are used to denote the majors:
 *      M: Mathematics
 *      C: Computer Science
 *      I: Information Technology
 * @author Scott M.
 * StudentMajor.java
 */

import java.util.Scanner;

public class Exercise_4_18 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String input, year, major;
        
        System.out.print("Enter two characters (M, C, I and 1, 2, 3, 4): ");
        input = kb.next();
        kb.close();
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