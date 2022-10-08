/**
 * (Financial application: compute future tuition) Suppose that the tuition for a university 
 * is $10,000 this year and increases 5% every year. In one year, the tuition 
 * will be $10,500. Write a program that computes the tuition in ten years and the 
 * total cost of four years’ worth of tuition after the tenth year.
 * @author Scott M.
 * ComputeTuition.java
 */

public class Exercise_5_7 {
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