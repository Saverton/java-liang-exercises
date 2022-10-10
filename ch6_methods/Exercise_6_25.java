/**
 * (Convert milliseconds to hours, minutes, and seconds) Write a method that converts 
 * milliseconds to hours, minutes, and seconds using the following header:
 * public static String convertMillis(long millis)
 * The method returns a string as hours:minutes:seconds. For example, 
 * convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns 
 * a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_6_25 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        long millis;
        
        System.out.print("Enter Milliseconds: ");
        millis = kb.nextLong();
        kb.close();
        
        System.out.print("Total time is " + convertMillis(millis));
    }
    /**
     * Convert a quantity of milliseconds into a string "HH:MM:SS"
     * @param long: milliseconds
     * @return String: equivalent time "HH:MM:SS"
     */
    public static String convertMillis(long millis) {
        long tSec, cSec, tMin, cMin, tHrs;
        
        tSec = millis / 1000;
        cSec = tSec % 60;
        tMin = tSec / 60;
        cMin = tMin % 60;
        tHrs = tMin / 60;
        
        return tHrs + ":" + cMin + ":" + cSec;
    }
}