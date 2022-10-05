/**
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user 
 * to enter the number of years and displays the population after the number of years. 
 * Use the hint in Programming Exercise 1.11 for this program. The population 
 * should be cast into an integer. 
 *      (Population projection) The U.S. Census Bureau projects population based on the
 *      following assumptions:
 *          ■ One birth every 7 seconds
 *          ■ One death every 13 seconds
 *          ■ One new immigrant every 45 seconds
 *      Assume the current population is 312,032,486 and one year has 365 days.
 * @author Scott M.
 */

 import java.util.Scanner;

public class Exercise_2_11 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int years, population, births, deaths, immigrants;
        final int STARTING_POPULATION = 312032486;
        final double SECONDS_PER_YEAR = 60 * 60 * 24 * 365; // declare as double to count as doubles in calculation
        System.out.print("Enter the number of years: ");
        years = kb.nextInt();
        kb.close();
        births = (int)(years * (SECONDS_PER_YEAR / 7)); // one birth every 7 seconds
        deaths = (int)(years * (SECONDS_PER_YEAR / 13)); // one death every 13 seconds
        immigrants = (int)(years * (SECONDS_PER_YEAR / 45)); // one immigrant every 45 seconds
        population = STARTING_POPULATION + births - deaths + immigrants;
        System.out.print("The population in " + years + " years is " + population);
    }
}
