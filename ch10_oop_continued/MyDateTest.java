/**
 * Program to test the MyDate class.
 * 
 * @author Scott M.
 * MyDateTest.java
 */

public class MyDateTest
{
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