/**
 * Program to calculate the day of the week based on the date, month and year
 * 
 * @author Scott M.
 * DayOfTheWeek.java
 */

import java.util.Scanner;

public class DayOfTheWeek {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //create scanner, delcare vars for date, month, year, and day
        Scanner kb = new Scanner (System.in);
        int date, month, year, day, century, yearOfCentury;
        
        //prompt user to enter date month and year
        System.out.print("Enter the year: ");
        year = kb.nextInt();
        System.out.print("Enter the month (1-Jan, 2-Feb, ..., 12-Dec): ");
        month = kb.nextInt();
        if (month > 12 || month < 1)
            System.out.print("Error: That month doesn't exist!");
        else {
        System.out.print("Enter a date: ");
        date = kb.nextInt();
        
        //ensure entries are made correctly (days for each month, valid month)
        if (date > 31 || date < 1)
            System.out.print("Error: date must be between 1 and 31.");
        else if (month == 2 && date > 29)
            System.out.print("Error: February can only have a maximum of 29 days.");
        else if (year % 4 != 0 && month == 2 && date > 28)
            System.out.print("Error: On a non-leap year, Feb has max of 28 days.");
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30)
            System.out.print("Error: That month only has 30 days!");
        else {
        //make necessary conversions
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }
        century = year / 100;
        yearOfCentury = year % 100;
        
        //calculate day of the week
        day = (date + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
        
        //display according to switch statement
        switch (day) {
            case 0: System.out.print("\nDay of the week is: Saturday");
            break;
            case 1: System.out.print("\nDay of the week is: Sunday");
            break;
            case 2: System.out.print("\nDay of the week is: Monday");
            break;
            case 3: System.out.print("\nDay of the week is: Tuesday");
            break;
            case 4: System.out.print("\nDay of the week is: Wednesday");
            break;
            case 5: System.out.print("\nDay of the week is: Thursday");
            break;
            case 6: System.out.print("\nDay of the week is: Friday");
        }
        }
        }
    }
}