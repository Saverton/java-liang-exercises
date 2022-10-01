/** Program to use the BigRational class to calculate a summation:
 *      1/2 + 2/3 + 3/4 + ... + 98/99 + 99/100
 *      
 * @author Scott M.
 * RationalSummation.java
 */

public class RationalSummation {
    /** Main method to run program. */
    public static void main(String[] args) {
        BigRational calc = new BigRational();
        
        for (int i = 2; i <= 100; i++) {
            calc = calc.add(new BigRational(i - 1, i));
        }
        
        System.out.print("result is " + calc);
    }
}