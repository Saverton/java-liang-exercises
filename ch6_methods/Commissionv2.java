/**
 * Program to compute commission on sales at various given sales amounts.
 * 
 * @author Scott M.
 * Commissionv2.java
 */

public class Commissionv2 {
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
     * Method to find commission given sales.
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