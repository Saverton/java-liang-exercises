/**
 * (Guess the capitals) Write a program that repeatedly prompts the user to enter 
 * a capital for a state. Upon receiving the user input, the program reports whether 
 * the answer is correct. Assume that 50 states and their capitals are stored in a two
 * dimensional array, as shown in Figure 8.10. The program prompts the user to 
 * answer all states’ capitals and displays the total correct count. The user’s answer 
 * is not case-sensitive.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_37
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int correct = 0;
        String[][] capitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Jeneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacremento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianappolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
        };
        
        for (int i = 0; i < capitals.length; i++)
        {
            System.out.print("What is the capital of " + capitals[i][0] + "? ");
            String answer = kb.nextLine();
            if (answer.equalsIgnoreCase(capitals[i][1]))
            {
                System.out.println("Your answer is correct");
                correct++;
            }
            else
            {
                System.out.println("The correct answer should be " + capitals[i][1]);
            }
        }
        kb.close();
        System.out.print("The correct count is " + correct);
    }
}