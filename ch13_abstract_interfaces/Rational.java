/** Rational class; subclass of number, represents rational numbers (fractions). contains instance data for
 * the numerator and denominator as well as behavior to perform four function operations.
 * 
 * @author Scott M.
 * Rational.java
 */

public class Rational extends Number implements Comparable<Rational> {
    private long[] r = new long[2];
    
    /** Construct a default rational number equivalent to 0/1 */
    public Rational() {
        this(0, 1);
    }
    
    /** Construct a rational number with a numerator and denominator.
     * @params Numerator, Denominator
     */
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        r[0] = (((denominator > 0) ? 1 : -1) * numerator) / gcd;
        r[1] = Math.abs(denominator) / gcd;
    }
    
    /** Return the numerator.
     * @return Numerator
     */
    public long getNumerator() {
        return (r[0]);
    }
    
    /** Return the denominator.
     * @return Denominator
     */
    public long getDenominator() {
        return (r[1]);
    }
    
    /** return the sum of this Rational number and another rational number.
     * @params other rational number
     * @return sum
     */
    public Rational add(Rational secondRational) {
        long numerator = (r[0] * secondRational.r[1] + secondRational.r[0] * r[1]);
        long denominator = (r[1] * secondRational.r[1]);
        long gcd = gcd(numerator, denominator);
        return (new Rational(numerator / gcd, denominator / gcd));
    }
    
    /** return the difference of this Rational number and another rational number.
     * @params other rational number
     * @return difference
     */
    public Rational subtract(Rational secondRational) {
        long numerator = (r[0] * secondRational.r[1] - secondRational.r[0] * r[1]);
        long denominator = (r[1] * secondRational.r[1]);
        long gcd = gcd(numerator, denominator);
        return (new Rational(numerator / gcd, denominator / gcd));
    }
    
    /** return the product of this Rational number and another Rational number.
     * @params other rational number
     * @return product
     */
    public Rational multiply(Rational secondRational) {
        long numerator = r[0] * secondRational.r[0];
        long denominator = r[1] * secondRational.r[1];
        long gcd = gcd(numerator, denominator);
        return (new Rational(numerator / gcd, denominator / gcd));
    }
    
    /** return the quotient of this Rational number and another Rational number.
     * @params other rational number
     * @return quotient
     */
    public Rational divide(Rational secondRational) {
        return (multiply(new Rational(secondRational.r[1], secondRational.r[0])));
    }
    
    /** Return a string of the rational number.
     * @return String in form numerator/denominator
     */
    @Override
    public String toString() {
        return ((r[1] != 1) ? (r[0] + "/" + r[1]) : "" + r[0]);
    }
    
    /** Private method to calculate the gcd of two long numbers.
     * @param long1, long2
     * @return gcd
     */
    private long gcd(long l1, long l2) {
        l1 = Math.abs(l1);
        l2 = Math.abs(l2);
        for (long i = Math.min(l1, l2); i > 1; i--) {
            if (l1 % i == 0 && l2 % i == 0)
                return i;
        }
        return 1;
    }
    
    /** Overridden; tests equality to another rational object.
     * @params other rational number
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if ((this.subtract((Rational)o)).getNumerator() == 0)
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
        return ((r[0] * 1.0) / r[1]);
    }
    
    /** Compare this rational to another rational number.
     * @params other rational number
     * @return 1 = greater, -1 = less, 0 = equal
     */
    @Override
    public int compareTo(Rational other) {
        if (this.subtract(other).getNumerator() > 0)
            return 1;
        else if (this.subtract(other).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}