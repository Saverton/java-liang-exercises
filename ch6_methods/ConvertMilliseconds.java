/**
 * Program to convert Milliseconds into hours, minutes, and seconds.
 * 
 * @author Scott M.
 * ConvertMilliseconds.java
 */

import java.util.Scanner;

public class ConvertMilliseconds {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        long millis;
        
        System.out.print("Enter Milliseconds: ");
        millis = kb.nextLong();
        
        System.out.print("Total time is " + convertMillis(millis));
    }
    /**
     * Method to convert Milliseconds to hours, minutes, and seconds.
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