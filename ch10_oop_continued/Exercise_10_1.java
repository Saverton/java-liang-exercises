/**
 * (The Time class) Design a class named Time. The class contains:
 *  ■ The data fields hour, minute, and second that represent a time.
 *  ■ A no-arg constructor that creates a Time object for the current time. (The 
 *    values of the data fields will represent the current time.)
 *  ■ A constructor that constructs a Time object with a specified elapsed time 
 *    since midnight, January 1, 1970, in milliseconds. (The values of the data 
 *    fields will represent this time.)
 *  ■ A constructor that constructs a Time object with the specified hour, minute, 
 *    and second.
 *  ■ Three getter methods for the data fields hour, minute, and second,
 *    respectively.
 *  ■ A method named setTime(long elapseTime) that sets a new time 
 *    for the object using the elapsed time. For example, if the elapsed time is 
 *    555550000 milliseconds, the hour is 10, the minute is 19, and the second is 
 *    10.
 * Draw the UML diagram for the class and then implement the class. Write 
 * a test program that creates two Time objects (using new Time() and new
 * Time(555550000)) and displays their hour, minute, and second in the format 
 * hour:minute:second.
 * @author Scott M.
 */
public class Exercise_10_1
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

class Time
{
    private int hour, min, sec;
    
    /**
     * Construct a new Time object with a specific amount of elapsed time.
     * @param elapseTime long: total time in milliseconds
     */
    public Time(long elapseTime)
    {
        elapseTime /= 1000;
        this.sec = (int)elapseTime % 60;
        elapseTime /= 60;
        this.min = (int)elapseTime % 60;
        elapseTime /= 60;
        this.hour = (int)elapseTime % 24;
    }

    /**
     * Construct a new Time object with the current time set as the elapsed time.
     */
    public Time()
    {
        this(System.currentTimeMillis());
    }
    
    /**
     * Construct a new Time object with a specific number of hours, minutes, and seconds.
     * @param hour int: number of hours
     * @param min int: number of minutes
     * @param sec int: number of seconds
     */
    public Time(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    /**
     * Return the number of seconds
     * @return int: number of seconds
     */
    public int getSeconds()
    {
        return this.sec;
    }
    
    /**
     * Return the number of minutes
     * @return int: number of minutes
     */
    public int getMinutes()
    {
        return this.min;
    }
    
    /**
     * Return the number of hours
     * @return int: number of hours
     */
    public int getHour()
    {
        return this.hour;
    }
    
    /**
     * Set the time to a new elapsed time in milliseconds.
     * @param elapseTime long: elapsed time in milliseconds
     */
    public void setTime(long elapseTime)
    {
        elapseTime /= 1000;
        this.sec = (int)elapseTime % 60;
        elapseTime /= 60;
        this.min = (int)elapseTime % 60;
        elapseTime /= 60;
        this.hour = (int)elapseTime % 24;
    }
}