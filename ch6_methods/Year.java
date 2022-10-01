/**
 * Program to calculate and display the numbers of days in years.
 * 
 * @author Scott M.
 * Year.java
 */

public class Year {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-5s%-5s\n", "Year", "Days");
        System.out.println("----------");
        
        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%-5d%-5d\n", year, daysInYear(year));
        }
    }
    /**
     * Method to determine how many days in a year.
     */
    public static int daysInYear(int year) {
        if (year % 4 == 0) {
            return 366;
        }
        return 355;
    }
}