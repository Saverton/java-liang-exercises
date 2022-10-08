/**
 * (Find the highest score) Write a program that prompts the user to enter the number 
 * of students and each student’s name and score, and finally displays the name 
 * of the student with the highest score.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_8 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int highScore = 0, input;
        String highStudent = "", inputS = "", highStudent1, highStudent2;
        
        do {
            System.out.print("Enter a student's first name followed by their score (80 = 80%). Input ends when student's name is \"End\": ");
            inputS = kb.next();
            if ((inputS.toUpperCase()).equals("END")) {
                break;
            }
            input = kb.nextInt();
            if (input > highScore) {
                highScore = input;
                highStudent = inputS;
            }
            else if (input == highScore) {
                highStudent += ", " + inputS;
            }
        } while (!(inputS.toUpperCase()).equals("END"));
        kb.close();
        
        if (highStudent.contains(",")) {
            highStudent1 = highStudent.substring(0, (highStudent.lastIndexOf(',') + 1));
            highStudent2 = highStudent.substring(highStudent.lastIndexOf(',') + 1);
            highStudent = highStudent1 + " and" + highStudent2;
        }
        System.out.printf("\nThe high score is %2d/100, held by %s.", highScore, highStudent);
    }
}