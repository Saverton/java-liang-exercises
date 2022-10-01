/**
 * Program to calculate a pentagonal number and then display the first 100 pentagonal numbers.
 * 
 * @author Scott M.
 * Pentagonal.java
 */

public class Pentagonal {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //1. display 50 pentagonal numbers with 10 numbers per line.
        for (int i = 1; i <= 50; i++) {
            if (i % 10 != 0) {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
            else {
                System.out.printf("%7d\n", getPentagonalNumber(i));
            }
        }
    }
    public static int getPentagonalNumber(int n) {
        //1. Convert number to its pentagonal form.
        n = (int)(n * (3 * n - 1) / 2.0);
        //2. return number
        return n;
    }
}