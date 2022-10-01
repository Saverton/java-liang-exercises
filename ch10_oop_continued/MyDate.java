/**
 * Class to define the MyDate class.
 * 
 * @author Scott M.
 * MyDate.java
 */

import java.util.GregorianCalendar;

public class MyDate
{
    private int day, month, year;
    public final String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    /**
     * Constructor to create a MyDate object for the current Time.
     */
    public MyDate()
    {
        this.year = new GregorianCalendar().get(GregorianCalendar.YEAR);
        this.month = new GregorianCalendar().get(GregorianCalendar.MONTH);
        this.day = new GregorianCalendar().get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    /**
     * Constructor to create a MyDate object for a specified elapsed time since Jan. 1, 1970
     * 
     * @param (elapsed time since Jan. 1, 1970 in Milliseconds)
     */
    public MyDate(long millis)
    {
        GregorianCalendar temp = new GregorianCalendar();
        temp.setTimeInMillis(millis);
        this.year = temp.get(GregorianCalendar.YEAR);
        this.month = temp.get(GregorianCalendar.MONTH);
        this.day = temp.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    /**
     * Constructor to create a MyDate object with a specified year, month, and day.
     * 
     * @params (the year of the date) (the month of the date) (the day of the month)
     */
    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /**
     * Method to get the year for this object.
     * 
     * @return (the year of the date)
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Method to get the month for this object.
     * 
     * @return (the month of the year (0-11))
     */
    public int getMonth()
    {
        return this.month;
    }
    
    /**
     * Method to get the Day for this object.
     * 
     * @return (the day of the month)
     */
    public int getDay()
    {
        return this.day;
    }
    
    /**
     * Method to set the date to a specified elapsed time since Jan. 1, 1970
     * 
     * @params (the amount of milliseconds since Jan. 1, 1970)
     */
    public void setDate(long millis)
    {
        GregorianCalendar temp = new GregorianCalendar();
        temp.setTimeInMillis(millis);
        this.year = temp.get(GregorianCalendar.YEAR);
        this.month = temp.get(GregorianCalendar.MONTH);
        this.day = temp.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    /**
     * Method to return a string of the month, date and year.
     * 
     * @return (String of MONTH, DAY, YEAR)
     */
    public String toString()
    {
        return monthNames[this.month] + ". " + this.day + ", " + this.year;
    }
}