/**
 * Program to calculate the day of the week x amount of days after a given day.
 * 
 * @author Scott M.
 * FutureDates.java
 */

import java.util.Scanner;

public class FutureDates {
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