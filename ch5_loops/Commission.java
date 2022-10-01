/**
 * Program to calculate the minimum sales needed to earn $30,000 a year in a sales job.
 * 
 * @author Scott M.
 * Commission.java
 */

public class Commission {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double salary = 5000, sales = 10000;
        
        for ( ; salary < 30000; sales++) {
            salary = 5000;
            salary += 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
        }
        
        System.out.printf("$%,4.2f in sales required to earn at least $30,000 salary.", sales);
    }
}