/**
 * Program to calculate a series sum using a method and build a table based on different degrees of the summation.
 * 
 * @author Scott M.
 * SumSeriesv1.java
 */

public class SumSeriesv1 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "i", "m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%10.4f\n", i, sum(i));
        }
    }
    /**
     * Method to find the sum of a series.
     */
    public static double sum(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += (double)j / (j + 1);
        }
        return sum;
    }
}