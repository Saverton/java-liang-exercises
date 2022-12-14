/**
 * (Display the first days of each month) Write a program that prompts the user to 
 * enter the year and first day of the year, and displays the first day of each month 
 * in the year. For example, if the user entered the year 2013, and 2 for Tuesday, 
 * January 1, 2013, your program should display the following output:
 *      January 1, 2013 is Tuesday
 *      ...
 *      December 1, 2013 is Sunday
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_5_28 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int year, day, month;
        String dayName = "", monthName = "";
        
        System.out.print("Enter the year: ");
        year = kb.nextInt();
        System.out.print("Enter the day of the week (0-Sunday, 1-Monday... 6- Saturday): ");
        day = kb.nextInt();
        kb.close();
        
        for (month = 1; month <= 12; month++) {
            switch (day % 7) {
                case 0: dayName = "Sunday";
                        break;
                case 1: dayName = "Monday";
                        break;
                case 2: dayName = "Tuesday";
                        break;
                case 3: dayName = "Wednesday";
                        break;
                case 4: dayName = "Thursday";
                        break;
                case 5: dayName = "Friday";
                        break;
                case 6: dayName = "Saturday";
            }
            
            switch (month) {
                case 1: monthName = "January";
                        day += 31;
                        break;
                case 2: monthName = "February";
                        if (year % 4 == 0) {
                            day += 29;
                        }
                        else {
                            day += 28;
                        }
                        break;
                case 3: monthName = "March";
                        day += 31;
                        break;
                case 4: monthName = "April";
                        day += 30;
                        break;
                case 5: monthName = "May";
                        day += 31;
                        break;
                case 6: monthName = "June";
                        day += 30;
                        break;
                case 7: monthName = "July";
                        day += 31;
                        break;
                case 8: monthName = "August";
                        day += 31;
                        break;
                case 9: monthName = "September";
                        day += 30;
                        break;
                case 10: monthName = "October";
                         day += 31;
                         break;
                case 11: monthName = "November";
                         day += 30;
                         break;
                case 12: monthName = "December";
            }
            
            System.out.println(monthName + " 1st is on a " + dayName + ".");
        }
    }
}