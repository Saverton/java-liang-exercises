/**
 * Program to calculate tuition after 10 years for 1 and 4 years of college.
 * 
 * @author Scott M.
 * ComputeTuition.java
 */

public class ComputeTuition {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double tuition = 10000;
        for (int i = 0; i < 10; i++) {
            tuition *= 1.05;
        }
        System.out.printf("Tuition is $%,4.2f for 1 year and $%,4.2f for 4 years.", tuition, (tuition * 4));
    }
}