/**
 * Program to calculate the high score on a test from students.
 * 
 * @author Scott M.
 * HighScorev2.java
 */

import java.util.Scanner;

public class HighScorev2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int highScore = 0, input, secondScore = 0;
        String highStudent = "", inputS = "", highStudent1, highStudent2, secondStudent = "", secondStudent1, secondStudent2;
        
        do {
            System.out.print("Enter a student's first name followed by their score (80 = 80%). Input ends when student's name is \"End\": ");
            inputS = kb.next();
            if ((inputS.toUpperCase()).equals("END")) {
                break;
            }
            input = kb.nextInt();
            if (input > highScore) {
                secondScore = highScore;
                secondStudent = highStudent;
                highScore = input;
                highStudent = inputS;
            }
            else if (input == highScore) {
                highStudent += ", " + inputS;
            }
            else if (input == secondScore) {
                secondStudent += ", " + inputS;
            }
        } while (!(inputS.toUpperCase()).equals("END"));
        
        if (highStudent.contains(",")) {
            highStudent1 = highStudent.substring(0, highStudent.lastIndexOf(','));
            highStudent2 = highStudent.substring(highStudent.lastIndexOf(',') + 1);
            highStudent = highStudent1 + " and" + highStudent2;
        }
        
        if (secondStudent.contains(",")) {
            secondStudent1 = secondStudent.substring(0, secondStudent.lastIndexOf(','));
            secondStudent2 = secondStudent.substring(secondStudent.lastIndexOf(',') + 1);
            secondStudent = secondStudent1 + " and" + secondStudent2;
        }
        System.out.printf("\nThe high score is %2d/100, held by %s.", highScore, highStudent);
        System.out.printf("\nThe second highest score is %2d/100, held by %s.", secondScore, secondStudent);
    }
}
