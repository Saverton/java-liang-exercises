/**
 * Program to find how many days in a given month from a given year
 * 
 * @author Scott M.
 * MonthDays.java
 */

import java.util.Scanner;

public class MonthDays {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //get scanner, input year, input month, days variable
        Scanner kb = new Scanner (System.in);
        int year, month, days = 0;
        String m = "month";
        
        //prompt user to get years, use % to find if it is a leap year
        System.out.print("Enter the year: ");
        year = kb.nextInt();
        System.out.print("Enter the month (1-Jan,2-Feb...12-Dec): ");
        month = kb.nextInt();
        
        //if (leap year and month = 2), 29 days
        if ((year % 4) == 0 && month == 2) {
            days = 29;
            m = "February";
        }
        else {
        //else: use switch case to determine days
        switch (month) {
            case 1: days = 31;
            m = "January";
            break;
            case 2: days = 28;
            m = "February";
            break;
            case 3: days = 31;
            m = "March";
            break;
            case 4: days = 30;
            m = "April";
            break;
            case 5: days = 31;
            m = "May";
            break;
            case 6: days = 30;
            m = "June";
            break;
            case 7: days = 31;
            m = "July";
            break;
            case 8: days = 31;
            m = "August";
            break;
            case 9: days = 30;
            m = "September";
            break;
            case 10: days = 31;
            m = "October";
            break;
            case 11: days = 30;
            m = "November";
            break;
            case 12: days = 31;
            m = "December";
        }
        }
        //output days
        System.out.print("There are " + days + " days in " + m + " of " + year + ".");
    }
}