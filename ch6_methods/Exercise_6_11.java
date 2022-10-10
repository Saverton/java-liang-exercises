/**
 * (Financial application: compute commissions) Write a method that computes the 
 * commission, using the scheme in Programming Exercise 5.39. The header of the 
 * method is as follows:
 *      public static double computeCommission(double salesAmount)
 * Write a test program that displays the following table:
 *      Sales Amount     Commission
 *      10000            900.0
 *      15000            1500.0
 *      ...
 *      95000            11100.0
 *      100000           11700.0
 * @author Scott M.
 */

public class Exercise_6_11 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double sales = 10000;
        System.out.printf("%-15s%-15s\n", "Sales Amount", "Commission");
        System.out.println("------------------------------");
        while (sales <= 100000) {
            System.out.printf("$%-14.2f$%-14.2f\n", sales, commission(sales));
            sales += 5000;
        }
    }
    /**
     * Return the commision received given a sales amount.
     * @param double: worth of sales made
     * @return double: commission earned
     */
    public static double commission(double sales) {
        if (sales <= 5000) {
            return sales * 0.08;
        }
        else if (sales <= 10000) {
            return 5000 * 0.08 + (sales - 5000) * 0.10;
        }
        else {
            return 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
        }
    }
}