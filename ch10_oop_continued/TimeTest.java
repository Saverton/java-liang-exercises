/**
 * Program to test the Time Class. The test program creates 3 time objects, using each
 * of the three possible constructors, and displays their values.
 * 
 * @author Scott M.
 * TimeTest.java
 */

public class TimeTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        final long TIME_ELAPSED = 555550000L;
        Time t1 = new Time();
        Time t2 = new Time(TIME_ELAPSED);
        Time t3 = new Time(5, 23, 55);
        
        printTime(t1);
        printTime(t2);
        printTime(t3);
    }
    
    public static void printTime(Time t)
    {
        System.out.println(t.getHour() + ":" + t.getMinutes() + ":" + t.getSeconds());
    }
}