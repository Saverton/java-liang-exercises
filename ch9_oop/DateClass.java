/**
 * Program to test the Java library Date class by returning the current date and time
 * after certain times in milliseconds have elapsed.
 * 
 * @author Scott M.
 * DateClass.java
 */

import java.util.Date;

public class DateClass
{
    /**
     * Main method to run program
     */
    public static void main(String[] args)
    {
        Date date = new Date(10000);
        for (int i = 4; i <= 11; i++)
        {
            date.setTime((long)Math.pow(10, i));
            System.out.println(date.toString());
        }
    }
}