/**
 * The Time class contains fields for the Hour, minute, and second. There is behavior
 * to get these fields, and to set the time to a certain amount of milliseconds that
 * have elapsed since January 1, 1970.
 * 
 * @author Scott M.
 * Time.java
 */

public class Time
{
    /**
     * Data fields
     */
    private int hour, min, sec;
    
    /**
     * Constructors
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
    
    public Time()
    {
        this(System.currentTimeMillis());
    }
    
    public Time(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    public int getSeconds()
    {
        return this.sec;
    }
    
    public int getMinutes()
    {
        return this.min;
    }
    
    public int getHour()
    {
        return this.hour;
    }
    
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