/**
 * Program to estimate PI to varying levels of accuracy.
 * 
 * @author Scott M.
 * EstPi.java
 */
public class EstPi {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s\n", "i", "pi(i)");
        System.out.println("----------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-10d%-10.4f\n", i, pi(i));
        }
    }   
    /**
     * Method to compute PI using a summation.
     */
    public static double pi(int i) {
        double pi = 0;
        for (int j = 0; j < i; j++) {
            pi = (j % 2 != 0) ? pi - 1.0 / (1 + 2 * j) : pi + 1.0 / (1 + 2 * j);
        }
        return 4 * pi;
    }
}