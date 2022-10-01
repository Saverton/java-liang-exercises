/**
 * Program to display all leap years from 101 - 2100.
 * 
 * @author Scott M.
 * LeapYears.java
 */

public class LeapYears {
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