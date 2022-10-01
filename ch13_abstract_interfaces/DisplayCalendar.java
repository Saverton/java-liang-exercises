/** Program to display a Calendar using the Gregorian Calendar class.
 * 
 * @author Scott M.
 * DisplayCalendar.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendar {
    /** Main method to run program. */
    public static void main(String[] args) {
        int year = (args.length > 0 && args[0].length() > 0) ? Integer.parseInt(args[0]) : new GregorianCalendar().get(Calendar.YEAR);
        int month = (args.length > 0 && args[1].length() > 0) ? Integer.parseInt(args[1]) - 1 : new GregorianCalendar().get(Calendar.MONTH);
        printCalendar(year, month);
    }
    
    /** Method to print a calendar for a given month and year 
     * @params year, month
     */
    public static void printCalendar(int year, int month) {
        Calendar c = new GregorianCalendar(year, month, 1);
        printTitle(c);
        printHeader();
        printBody(c);
    }
    
    /** Method to print a calendar Title
     * @params Calendar
     */
    public static void printTitle(Calendar c) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                            "Oct", "Nov", "Dec"};
        System.out.printf("%16s %4d\n", months[c.get(Calendar.MONTH)], c.get(Calendar.YEAR));
    }
    
    /** Method to print a calendar Header */
    public static void printHeader() {
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int i = 0; i < 7; i++) {
            System.out.printf(" %s ", days[i]);
        }
        System.out.println();
        for (int i = 0; i < 35; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
    
    /** Method to print a calendar body
     * @params Calendar
     */
    public static void printBody(Calendar c) {
        String[][] days = getDays(c);
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.printf(" %-3s ", days[i][j]);
            }
            System.out.println();
        }
    }
    
    /** Method to get an array representing the calendar body
     * @params Calendar
     */
    public static String[][] getDays(Calendar c) {
        String[][] calendar = new String[5][7];
        int month = c.get(Calendar.MONTH);
        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < calendar[0].length; j++) {
                if (j >= c.get(Calendar.DAY_OF_WEEK) - 1 && c.get(Calendar.MONTH) == month) {
                    calendar[i][j] = "" + c.get(Calendar.DATE);
                    c.set(Calendar.DATE, c.get(Calendar.DATE) + 1);
                }
                else
                    calendar[i][j] = "";
            }
        }
        return calendar;
    }
}