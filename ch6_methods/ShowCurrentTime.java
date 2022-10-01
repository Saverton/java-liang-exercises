/**
 * Program to display the current time and date.
 * 
 * @author Scott M.
 * ShowCurrentTime.java
 */

import java.util.Scanner;

public class ShowCurrentTime {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int offset;
        
        System.out.print("Enter the offset from GMT: ");
        offset = kb.nextInt();
        
        System.out.println(showTime(offset));
        System.out.print(showDate(offset));
    }
    /**
     * Method to show the current time.
     */
    public static String showTime(int offset) {
        long totalSeconds, currentSeconds, totalMins, currentMin, totalHours, currentHour;
        
        totalSeconds = System.currentTimeMillis() / 1000;
        currentSeconds = totalSeconds % 60;
        
        totalMins = totalSeconds / 60;
        currentMin = totalMins % 60;
        
        totalHours = totalMins / 60;
        currentHour = totalHours % 24;
        
        return (currentHour + offset) + ":" + currentMin + ":" + currentSeconds;
    }
    /**
     * Method to show the current date.
     */
    public static String showDate(int offset) {
        long totalDays, days = 364;
        int year = 1970;
        String month = "";
        
        totalDays = (System.currentTimeMillis() + (offset * 60 * 60 * 1000)) / (1000 * 60 * 60 * 24);
        
        //Find year
        while (days < totalDays) {
            days += (year % 4 == 0) ? 366 : 365;
            year++;
        }
        days -= (year % 4 == 0) ? 366 : 365;
        totalDays %= days;
        
        //Find month & day
        for (int i = 1; month.equals(""); i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                if (totalDays <= 31) {
                    switch (i) {
                        case 1: month = "January";
                                break;
                        case 3: month = "March";
                                break;
                        case 5: month = "May";
                                break;
                        case 7: month = "July";
                                break;
                        case 8: month = "August";
                                break;
                        case 10: month = "September";
                                break;
                        case 12: month = "December";
                                break;
                        default: month = "Error";
                    }
                }
                else {
                    totalDays -= 31;
                }
            }
            else if (i == 4 || i == 6 || i == 9 || i == 11) {
                if (totalDays <= 30) {
                    switch (i) {
                        case 4: month = "April";
                                break;
                        case 6: month = "June";
                                break;
                        case 9: month = "September";
                                break;
                        case 11: month = "November";
                                break;
                        default: month = "Error";
                    }
                }
                else {
                    totalDays -= 30;
                }
            }
            else if (year % 4 == 0 && i == 2) {
                if (totalDays <= 29) {
                    month = "February";
                }
                else {
                    totalDays -= 29;
                }
            }
            else if (year % 4 != 0 && i == 2) {
                if (totalDays <= 28) {
                    month = "February";
                }
                else {
                    totalDays -= 28;
                }
            }
            else {
                month = "Error: Default";
            }
        }
        
        return month + " " + totalDays + ", " + year;
    }
}