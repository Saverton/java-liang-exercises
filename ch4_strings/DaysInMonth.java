/**
 * Program to tell how many days are in a month.
 * 
 * @author Scott M.
 * DaysInMonth.java
 */

import java.util.Scanner;

public class DaysInMonth {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, declare vars
        Scanner kb = new Scanner (System.in);
        String month;
        int year, days = 0;
        
        //get month and year
        System.out.print("Enter the first three letters of the month followed by the year: ");
        month = kb.next();
        year = kb.nextInt();
        if (year <= 0) {
            System.out.print("Invalid year format.");
            System.exit(1);
        }
        
        //determine # of days
        if (month.equals("jan")) {
            days = 31;
        }
        else if (month.equals("feb")) {
            days = 28;
        }
        else if (month.equals("mar")) {
            days = 31;
        }
        else if (month.equals("apr")) {
            days = 30;
        }
        else if (month.equals("may")) {
            days = 31;
        }
        else if (month.equals("jun")) {
            days = 30;
        }
        else if (month.equals("jul")) {
            days = 31;
        }
        else if (month.equals("aug")) {
            days = 31;
        }
        else if (month.equals("sep")) {
            days = 30;
        }
        else if (month.equals("oct")) {
            days = 31;
        }
        else if (month.equals("nov")) {
            days = 30;
        }
        else if (month.equals("dec")) {
            days = 31;
        }
        else {
            System.out.print("Invalid month input.");
            System.exit(1);
        }
        
        //determine if leap year
        if (year % 4 == 0 && month.equals("feb")) {
            days = 29;
        }
        
        //display result
        System.out.print("There are " + days + " days in " + month + " of " + year);
    }
}