/**
 * Program to show current time as a twelve hour clock.
 * 
 * @author Scott M.
 * CurrentTime.java
 */

import java.util.Scanner;

public class CurrentTime {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //start scanner, declare sec, mins, hours, milli, half and offset vars
        Scanner kb = new Scanner (System.in);
        
        //get time offset from GMT
        System.out.print("Enter the offset from GMT: ");
        int offset = kb.nextInt();
        
        //display current time
        long milli = System.currentTimeMillis();
        long sec = milli / 1000;
        long min = sec / 60;
        sec %= 60;
        long hours = min / 60;
        min %= 60;
        String half;
        hours += offset;
        hours %= 24;
        if (hours >= 12)
        {
            half = "PM";
        }
        else 
        {
            half = "AM";
        }
        hours %= 12;
        if (hours == 0)
        {
            hours = 12;
        }
        System.out.print("The current time is: " + hours + ":" + min + ":" + sec + " " + half + ".");
    }
}