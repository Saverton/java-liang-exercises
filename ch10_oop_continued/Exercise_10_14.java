/**
 * (The MyDate class) Design a class named MyDate. The class contains:
 *  ■ The data fields year, month, and day that represent a date. month is 
 *    0-based, i.e., 0 is for January.
 *  ■ A no-arg constructor that creates a MyDate object for the current date.
 *  ■ A constructor that constructs a MyDate object with a specified elapsed time 
 *    since midnight, January 1, 1970, in milliseconds.
 *  ■ A constructor that constructs a MyDate object with the specified year, 
 *    month, and day.
 *  ■ Three getter methods for the data fields year, month, and day, respectively.
 *  ■ A method named setDate(long elapsedTime) that sets a new date for 
 *    the object using the elapsed time.
 * Draw the UML diagram for the class and then implement the class. Write a 
 * test program that creates two MyDate objects (using new MyDate() and new
 * MyDate(34355555133101L)) and displays their year, month, and day.
 * @author Scott M.
 * MyDate.java
 */

import java.util.GregorianCalendar;

public class Exercise_10_14 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        MyDate today = new MyDate();
        MyDate date1 = new MyDate(34355555133101L);
        
        System.out.println(today);
        System.out.println(date1);
    }
}

class MyDate
{
    private int day, month, year;
    public final String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    /**
     * Construct a MyDate object with the current time and date.
     */
    public MyDate()
    {
        this.year = new GregorianCalendar().get(GregorianCalendar.YEAR);
        this.month = new GregorianCalendar().get(GregorianCalendar.MONTH);
        this.day = new GregorianCalendar().get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    /**
     * Construct a MyDate object with a specified time elapsed since Jan. 1, 1970.
     * @param millis long: time elapsed in milliseconds
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
     * Construct a MyDate object with a specific year, month, and day.
     * months => 0=Jan,1=Feb,...,11=Dec
     * @param year int: year
     * @param month int: month number
     * @param day int: day
     */
    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /**
     * Return the year of this MyDate
     * @return int: year
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Return the month number of this MyDate
     * months => 0=Jan,1=Feb,...,11=Dec
     * @return int: month
     */
    public int getMonth()
    {
        return this.month;
    }
    
    /**
     * Return the day of this MyDate
     * @return int: day
     */
    public int getDay()
    {
        return this.day;
    }
    
    /**
     * Set this MyDate by setting the time elapsed since Jan. 1, 1970.
     * @param millis long: milliseconds elapsed
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
     * Return a String of this MyDate
     * @return String: MyDate string (i.e. "Oct. 18, 2022")
     */
    public String toString()
    {
        return monthNames[this.month] + ". " + this.day + ", " + this.year;
    }
}