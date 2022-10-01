/** Define an exception for an invalid format for Binary strings.
 * 
 * @author Scott M.
 * BinaryFormatException.java
 */

public class BinaryFormatException extends NumberFormatException {
    String bin;
    
    /** Construct a Default BinaryFormatException */
    public BinaryFormatException() {
        this("(null)");
    }
    
    /** Construct a BinaryFormatException that holds the exception string */
    public BinaryFormatException(String bin) {
        super("invalid binary format");
        this.bin = bin;
    }
    
    /** Return a message about the exception */
    @Override
    public String getMessage() {
        return (super.getMessage() + " " + bin);
    }
}
