/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays 
 * the current time in GMT. Revise the program so that it prompts the user to enter 
 * the time zone offset to GMT and displays the time in the specified time zone. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_8 {
    /** Main method to run program */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long currentTimeMilliseconds;
        int offset, hours, minutes, seconds;
        final int MILLISECONDS_PER_SECOND = 1000, MILLISECONDS_PER_MINUTE = MILLISECONDS_PER_SECOND * 60, 
            MILLISECONDS_PER_HOUR = MILLISECONDS_PER_MINUTE * 60, MILLISECONDS_PER_DAY = MILLISECONDS_PER_HOUR * 24;
        System.out.print("Enter the time zone offset to GMT: ");
        offset = kb.nextInt();
        kb.close();
        currentTimeMilliseconds = (System.currentTimeMillis() + (offset * MILLISECONDS_PER_HOUR)) % MILLISECONDS_PER_DAY; // get the current time in milliseconds of this day
        hours = (int) (currentTimeMilliseconds / MILLISECONDS_PER_HOUR);
        currentTimeMilliseconds %= MILLISECONDS_PER_HOUR;
        minutes = (int) (currentTimeMilliseconds / MILLISECONDS_PER_MINUTE);
        currentTimeMilliseconds %= MILLISECONDS_PER_MINUTE;
        seconds = (int) (currentTimeMilliseconds / MILLISECONDS_PER_SECOND);
        System.out.print("The current time is " + hours + ":" + minutes + ":" + seconds);
    }
}
