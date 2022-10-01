/**
 * Program to use the java API GregorianCalendar class to display the
 * current day, month, and year as well as the d, m, and y of the date
 * 1234567898765L milliseconds from 1/1/1970.
 * 
 * @author Scott M.
 * GregorianCalendarTest.java
 */

import java.util.GregorianCalendar;

public class GregorianCalendarTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(GregorianCalendar.YEAR));
        System.out.println(gc.get(GregorianCalendar.MONTH));
        System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();
        
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(GregorianCalendar.YEAR));
        System.out.println(gc.get(GregorianCalendar.MONTH));
        System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}