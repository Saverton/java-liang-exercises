/**
 * Represents a non-numeric exception for the Calculator class that intakes stuff.
 * 
 * @author Scott M.
 * NonNumericOperandException.java
 */

public class NonNumericOperandException extends Exception {
    private String arg;
    
    /** Construct a NonNumericOperandException with an empty arg */
    public NonNumericOperandException() {
        this("");
    }
    
    /** Construct a NonNumericOperandException with a String arg 
     * @params String argument to pass
     */
    public NonNumericOperandException(String arg) {
        super("Non-Numeric Operand " + arg);
        this.arg = arg;
    }
    
    /** Return the String arg that was passed
     * @return String argument
     */
    public String getArg() {
        return (arg);
    }
}
