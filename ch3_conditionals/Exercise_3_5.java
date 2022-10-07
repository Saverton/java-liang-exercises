/**
 * (Find future dates) Write a program that prompts the user to enter an integer for 
 * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also 
 * prompt the user to enter the number of days after today for a future day and display 
 * the future day of the week.
 * @author Scott M.
 * FutureDates.java
 */

import java.util.Scanner;

public class Exercise_3_5 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars and start scanner
        int now, days, fday;
        Scanner kb = new Scanner (System.in);
        
        //prompt day entry
        System.out.print("Enter today's day (0-Sun, 1-Mon, etc...): ");
        now = kb.nextInt();
        
        //prompt elapsed entry
        System.out.print("Enter the amount of days elapsed since today: ");
        days = kb.nextInt();
        kb.close();
        
        //calculate
        fday = (now + days) % 7;
        //display
        switch (fday) {
            case 0: System.out.print("The day is Sunday");
            break;
            case 1: System.out.print("The day is Monday");
            break;
            case 2: System.out.print("The day is Tuesday");
            break;
            case 3: System.out.print("The day is Wednesday");
            break;
            case 4: System.out.print("The day is Thursday");
            break;
            case 5: System.out.print("The day is Friday");
            break;
            case 6: System.out.print("The day is Saturday");
        }
    }
}