/**
 * (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for 
 * n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . . 
 * Write a method with the following header that returns a pentagonal number:
 *      public static int getPentagonalNumber(int n)
 * Write a test program that uses this method to display the first 100 pentagonal 
 * numbers with 10 numbers on each line.
 * @author Scott M.
 */

public class Exercise_6_1 {
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
    /** Return the pentagonal number given a number n
     * for n(3n - 1) / 2
     * @params int: number n
     * @return int: pentagonal number
     */
    public static int getPentagonalNumber(int n) {
        //1. Convert number to its pentagonal form.
        n = (int)(n * (3 * n - 1) / 2.0);
        //2. return number
        return n;
    }
}