/**
 * Program to convert a letter grade to a numerical grade.
 * 
 * @author Scott M.
 * LetterToGrade.java
 */

import java.util.Scanner;

public class LetterToGrade {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        String input, message;
        char grade;
        int gradeNumber = 0;
        
        //get input and convert to char
        System.out.print("Enter a Letter Grade (A-F): ");
        input = kb.next();
        if (input.length() > 1) {
            System.out.print("Please enter a single character.");
            System.exit(1);
        }
        grade = Character.toUpperCase(input.charAt(0));
        
        //convert char to int grade
        if (grade >= 'A' && grade <= 'D') {
            gradeNumber = -1 * (grade - 'E');
        }
        else if (grade == 'F') {
            gradeNumber = 0;
        }
        else {
            System.out.print("Invalid grade letter input.");
            System.exit(1);
        }
        
        //display
        System.out.print(grade + " is equivalent numerically to a " + gradeNumber + ".");
    }
}