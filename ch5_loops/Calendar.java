/**
 * Program to display calendar's for each month of a year.
 * 
 * @author Scott M.
 * Calendar.java
 */

import java.util.Scanner;

public class Calendar {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int year, firstDay, month, day, monthDay = 0, date = 1;
        String firstDayName = "", monthName = "";
        
        System.out.print("Enter the year: ");
        year = kb.nextInt();
        System.out.print("Enter the day of the week of Jan 1st (0-Sunday, 1-MonfirstDay... 6- SaturfirstDay): ");
        firstDay = kb.nextInt();
        
        
        //find the firstDay of the week first in each month.
        
        
        //display calendar
        for (month = 1; month <= 12; month++) {
            //1. Find first day of month and set new firstday
            day = firstDay % 7;
            switch (month) {
                case 1: monthName = "January";
                        firstDay += 31;
                        monthDay = 31;
                        break;
                case 2: monthName = "February";
                        if (year % 4 == 0) {
                            firstDay += 29;
                            monthDay = 29;
                        }
                        else {
                            firstDay += 28;
                            monthDay = 28;
                        }
                        break;
                case 3: monthName = "March";
                        firstDay += 31;
                        monthDay = 31;
                        break;
                case 4: monthName = "April";
                        firstDay += 30;
                        monthDay = 30;
                        break;
                case 5: monthName = "May";
                        firstDay += 31;
                        monthDay = 31;
                        break;
                case 6: monthName = "June";
                        firstDay += 30;
                        monthDay = 30;
                        break;
                case 7: monthName = "July";
                        firstDay += 31;
                        monthDay = 31;
                        break;
                case 8: monthName = "August";
                        firstDay += 31;
                        monthDay = 31;
                        break;
                case 9: monthName = "September";
                        firstDay += 30;
                        monthDay = 30;
                        break;
                case 10: monthName = "October";
                         firstDay += 31;
                         monthDay = 31;
                         break;
                case 11: monthName = "November";
                         firstDay += 30;
                         monthDay = 30;
                         break;
                case 12: monthName = "December";
                         monthDay = 31;
                
            }
            //2. Display title of month and days
            System.out.println(monthName + " " + year);
            String h = "-----";
            System.out.println(h + h + h + h + h + h + h);
            System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
            
            //3. display blank spaces on first line.
            for (int blank = 0; blank < day; blank++) {
                System.out.print("     ");
            }
            date = 1;
            //4. display days
            for ( ; date <= monthDay; ) {
                for (int space = day; space <= 6 && date <= monthDay; space++) {
                    System.out.printf("%-5d", date);
                    date++;
                    day = 0;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
