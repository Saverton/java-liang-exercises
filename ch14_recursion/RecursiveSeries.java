/** Program to calculate the summations of the series described in Programming exercises
 * 14.4 - 14.6.
 * 
 * @author Scott M.
 * RecursiveSeries.java
 */

public class RecursiveSeries {
    /** Main method to test program. */
    public static void main(String[] args) {
        System.out.println("Series 1\tSeries 2\tSeries 3");
        for (int i = 1; i <= 10; i++) {
            System.out.println(series1(i) + "\t\t" + series2(i) + "\t\t" + series3(i));
        }
    }
    
    /** Return the summation of series 14.4
     * @params length of series (value of i)
     * @return summation
     */
    public static double series1(int i) {
        if (i == 0)
            return 0;
        else
            return ((1.0 / i) + series1(i - 1));
    }
    
    /** Return the summation of series 14.5
     * @params value of i
     * @return summation
     */
    public static double series2(int i) {
        if (i == 0)
            return 0;
        else
            return ((1.0 / ((2 * i) + 1)) + series2(i - 1));
    }
    
    /** Return the summation of series 14.6
     * @params value of i
     * @return summation
     */
    public static double series3(int i) {
        if (i == 0) 
            return 0;
        else
            return (((double)i / (i + 1)) + series3(i - 1));
    }
}