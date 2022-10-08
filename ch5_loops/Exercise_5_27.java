/**
 * (Display leap years) Write a program that displays all the leap years, ten per line, 
 * from 101 to 2100, separated by exactly one space. Also display the number of 
 * leap years in this period.
 * @author Scott M.
 */

public class Exercise_5_27 {
    /**
     * Main Method to run program.
     */
    public static void main(String[] args) {
        int year = 101, yearCount = 0, lineCount = 1;
        
        for ( ; year <= 2100; year++) {
            if (year % 4 == 0) {
                System.out.print(year + " ");
                yearCount++;
                lineCount++;
            }
            if (lineCount == 10) {
                System.out.println();
                lineCount = 1;
            }
        }
        
        System.out.print("\nThere are " + yearCount + " leap years from 101 - 2100.");
    }
}