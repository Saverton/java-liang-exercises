/**
 * Program to display calendar for a specified month and year.
 * 
 * @author Scott M.
 * PrintCalendar.java
 */

import java.util.Scanner;

public class PrintCalendar {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int year, month;
        
        System.out.print("Enter the year: ");
        year = kb.nextInt();
        System.out.print("Enter the month (1-Jan, ..., 12-Dec): ");
        month = kb.nextInt();
        
        printCalendar(year, month);
    }
    /**
     * Method to print the calendar for a month.
     */
    public static void printCalendar(int year, int month) {
        int firstDay, day, monthDay = 0, date = 1;
        String firstDayName = "", monthName = "";
        //display calendar
        //1. Find first day of month and set new firstday
        day = getFirstDay(year, month);
        switch (month) {
            case 1: monthName = "January";
                    monthDay = 31;
                    break;
            case 2: monthName = "February";
                    if (year % 4 == 0) {
                        monthDay = 29;
                    }
                    else {
                        monthDay = 28;
                    }
                    break;
            case 3: monthName = "March";
                    monthDay = 31;
                    break;
            case 4: monthName = "April";
                    monthDay = 30;
                    break;
            case 5: monthName = "May";
                    monthDay = 31;
                    break;
            case 6: monthName = "June";
                    monthDay = 30;
                    break;
            case 7: monthName = "July";
                    monthDay = 31;
                    break;
            case 8: monthName = "August";
                    monthDay = 31;
                    break;
            case 9: monthName = "September";
                    monthDay = 30;
                    break;
            case 10: monthName = "October";
                     monthDay = 31;
                     break;
            case 11: monthName = "November";
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
    }
    /**
     * Method to find the first day of the week of the month.
     */
    public static int getFirstDay(int year, int month) {
        //create scanner, delcare vars for date, month, year, and day
        int century, yearOfCentury;
        
        //make necessary conversions
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }
        century = year / 100;
        yearOfCentury = year % 100;
        
        //calculate day of the week
        return ((1 + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) - 1) % 7;
    }
}

