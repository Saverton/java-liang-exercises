/**
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by 
 * Christian Zeller to calculate the day of the week. The formula is
 *     (      26 (m + 1)         k     j       )
 * h = ( q + ------------ + k + --- + --- + 5j ) % 7
 *     (          10             4     4       )
 * where
 *  ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: 
 * Wednesday, 5: Thursday, 6: Friday).
 *  ■ q is the day of the month.
 *  ■ m is the month (3: March, 4: April, …, 12: December). January and February 
 * are counted as months 13 and 14 of the previous year.
 *  ■ j is the century (i.e., year 100 ).
 *  ■ k is the year of the century (i.e., year % 100).
 * Note that the division in the formula performs an integer division. Write a program 
 * that prompts the user to enter a year, month, and day of the month, and 
 * displays the name of the day of the week.
 * @author Scott M.
 * DayOfTheWeek.java
 */

import java.util.Scanner;

public class Exercise_3_21 {
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
            kb.close();
            
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