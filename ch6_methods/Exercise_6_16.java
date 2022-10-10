/**
 * (Number of days in a year) Write a method that returns the number of days in a 
 * year using the following header:
 *      public static int numberOfDaysInAYear(int year)
 * Write a test program that displays the number of days in year from 2000 to 2020.
 * @author Scott M.
 */

public class Exercise_6_16 {
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
     * Return the number of days in a given year
     * @param int: year
     * @return int: number of days in year
     */
    public static int daysInYear(int year) {
        if (year % 4 == 0) {
            return 366;
        }
        return 355;
    }
}