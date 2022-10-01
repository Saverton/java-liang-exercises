/** BigRational class; subclass of number, represents rational numbers (fractions). contains instance data for
 * the numerator and denominator as well as behavior to perform four function operations. This implementation
 * uses BigInteger objects for the numerator and denominator.
 * 
 * @author Scott M.
 * BigRational.java
 */

import java.math.BigInteger;

public class BigRational extends Number implements Comparable<BigRational> {
    private BigInteger[] r = new BigInteger[2];
    
    /** Construct a default rational number equivalent to 0/1 */
    public BigRational() {
        this(0, 1);
    }
    
    /** Construct a rational number with a numerator and denominator.
     * @params Numerator, Denominator
     */
    public BigRational(long numerator, long denominator) {
        BigInteger num = new BigInteger("" + numerator);
        BigInteger den = new BigInteger("" + denominator);
        BigInteger gcd = num.gcd(den);
        r[0] = (((den.intValue() > 0) ? BigInteger.ONE : new BigInteger("-1")).multiply(num)).divide(gcd);
        r[1] = den.abs().divide(gcd);
    }
    
    /** Construct a rational number with a BigInteger numerator and denominator.
     * @params numerator, denominator
     */
    public BigRational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        r[0] = numerator.divide(gcd);
        r[1] = denominator.divide(gcd);
    }
    
    /** Return the numerator.
     * @return Numerator
     */
    public BigInteger getNumerator() {
        return (r[0]);
    }
    
    /** Return the denominator.
     * @return Denominator
     */
    public BigInteger getDenominator() {
        return (r[1]);
    }
    
    /** return the sum of this BigRational number and another rational number.
     * @params other rational number
     * @return sum
     */
    public BigRational add(BigRational secondRational) {
        BigInteger numerator = new BigInteger("" + (r[0].multiply(secondRational.r[1]).add(secondRational.r[0].multiply(r[1]))));
        BigInteger denominator = new BigInteger("" + (r[1].multiply(secondRational.r[1])));
        BigInteger gcd = numerator.gcd(denominator);
        return (new BigRational(numerator.divide(gcd), denominator.divide(gcd)));
    }
    
    /** return the difference of this BigRational number and another rational number.
     * @params other rational number
     * @return difference
     */
    public BigRational subtract(BigRational secondRational) {
        BigInteger numerator = new BigInteger("" + (r[0].multiply(secondRational.r[1]).subtract(secondRational.r[0].multiply(r[1]))));
        BigInteger denominator = new BigInteger("" + (r[1].multiply(secondRational.r[1])));
        BigInteger gcd = numerator.gcd(denominator);
        return (new BigRational(numerator.divide(gcd), denominator.divide(gcd)));
    }
    
    /** return the product of this BigRational number and another BigRational number.
     * @params other rational number
     * @return product
     */
    public BigRational multiply(BigRational secondRational) {
        BigInteger numerator = new BigInteger("" + (r[0].multiply(secondRational.r[0])));
        BigInteger denominator = new BigInteger("" + (r[1].multiply(secondRational.r[1])));
        BigInteger gcd = numerator.gcd(denominator);
        return (new BigRational(numerator.divide(gcd), denominator.divide(gcd)));
    }
    
    /** return the quotient of this BigRational number and another BigRational number.
     * @params other rational number
     * @return quotient
     */
    public BigRational divide(BigRational secondRational) {
        return (multiply(new BigRational(secondRational.r[1], secondRational.r[0])));
    }
    
    /** Return a string of the rational number.
     * @return String in form numerator/denominator
     */
    @Override
    public String toString() {
        return ((!r[1].equals(BigInteger.ONE)) ? (r[0] + "/" + r[1]) : "" + r[0]);
    }
    
    /** Overridden; tests equality to another rational object.
     * @params other rational number
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if ((this.subtract((BigRational)o)).getNumerator().equals(BigInteger.ZERO))
            return true;
        else 
            return false;
    }
    
    /** Return the integer equivalent of the rational number.
     * @return int value
     */
    public int intValue() {
        return (int)doubleValue();
    }
    
    /** Return the floating point equivalent of the rational number.
     * @return float value
     */
    @Override
    public float floatValue() {
        return (float)doubleValue();
    }
    
    /** Return the long value equivalent to the rational number.
     * @return long value
     */
    @Override
    public long longValue() {
        return (long)doubleValue();
    }
    
    /** Return the double value equivalent to the rational number.
     * @return double value
     */
    public double doubleValue() {
        return (r[0].doubleValue() / r[1].doubleValue());
    }
    
    /** Compare this rational to another rational number.
     * @params other rational number
     * @return 1 = greater, -1 = less, 0 = equal
     */
    @Override
    public int compareTo(BigRational other) {
        if (this.subtract(other).getNumerator().intValue() > 0)
            return 1;
        else if (this.subtract(other).getNumerator().intValue() < 0)
            return -1;
        else
            return 0;
    }
}
