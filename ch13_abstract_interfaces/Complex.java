/** Complex Number class; represents complex numbers in the form (a + bi). has
 * instance data for a and b as well as behavior to add, subtract, multiply, divide
 * and return the absolute value of the numbers.
 * 
 * @author Scott M.
 * Complex.java
 */

public class Complex extends Number {
    private double a = 0.0, b = 0.0;
    
    /** Construct a default Complex number equal to 0 */
    public Complex() {
    }
    
    /** Construct a complex number with a specefied real portion and 0 as imaginary
     * number!
     * @params real number
     */
    public Complex(double a) {
        this(a, 0.0);
    }
    
    /** Construct a complex number with a specified real and imaginary coefficient.
     * @params real coefficient, imaginary coefficient
     */
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    /** Return the real component.
     * @return real component
     */
    public double getRealPart() {
        return (a);
    }
    
    /** Return the imaginary component.
     * @return imaginary component
     */
    public double getImaginaryPart() {
        return (b);
    }
    
    /** Return the sum of this complex number and another.
     * @params other Complex number
     * @return sum
     */
    public Complex add(Complex other) {
        return (new Complex(a + other.getRealPart(), b + other.getImaginaryPart()));
    }
    
    /** Return the difference of this complex number and another.
     * @params other Complex number
     * @return difference
     */
    public Complex subtract(Complex other) {
        return (new Complex(a - other.getRealPart(), b - other.getImaginaryPart()));
    }
    
    /** Return the product of two complex numbers.
     * @params other Complex number
     * @return product
     */
    public Complex multiply(Complex other) {
        return (new Complex((a * other.getRealPart() - b * other.getImaginaryPart()),
                             b * other.getRealPart() + a * other.getImaginaryPart()));
    }
    
    /** Return the quotient of two complex numbers.
     * @params other Complex number
     * @return quotient
     */
    public Complex divide(Complex other) {
        return (new Complex(((a * other.getRealPart() + b * other.getImaginaryPart()) /
                            (Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2))),
                            ((b * other.getRealPart() - a * other.getImaginaryPart()) /
                            (Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2)))));
    }
    
    /** Return the absolute value of a complex number.
     * @return absolute value
     */
    public double abs() {
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    
    /** Return a String of the complex number.
     * @return complex number String
     */
    public String toString() {
        return ("(" + a + " + " + b + "i)");
    }
    
    /** Return the double value of the absolute value of the complex number.
     * @return absolute value (double)
     */
    public double doubleValue() {
        return (double)abs();
    }
    
    /** Return the int value of the absolute value of the complex number.
     * @return absolute value (int)
     */
    public int intValue() {
        return (int)abs();
    }
    
    /** Return the long value of the absolute value of the complex number.
     * @return absolute value (long)
     */
    public long longValue() {
        return (long)abs();
    }
    
    /** Return the float value of the absolute value of the complex number.
     * @return absolute value (float)
     */
    public float floatValue() {
        return (float)abs();
    }
}