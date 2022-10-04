/**
 * (Find the number of years) Write a program that prompts the user to enter the 
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
 * For simplicity, assume a year has 365 days.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_7 {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int minutes, days, years;
        final int MINUTES_PER_DAY = 60 * 24, MINUTES_PER_YEAR = MINUTES_PER_DAY * 365;
        System.out.print("Enter the number of minutes: ");
        minutes = kb.nextInt();
        kb.close();
        years = minutes / MINUTES_PER_YEAR;
        minutes %= MINUTES_PER_YEAR; // minutes set to remainder of minutes after years.
        days = minutes / MINUTES_PER_DAY;
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
