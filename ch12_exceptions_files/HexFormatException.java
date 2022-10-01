/** Define an exception for an invalid format for Hexadecimal strings.
 * 
 * @author Scott M.
 * HexFormatException.java
 */

public class HexFormatException extends NumberFormatException {
    String hex;
    
    /** Construct a Default HexFormatException */
    public HexFormatException() {
        this("(null)");
    }
    
    /** Construct a HexFormatException that holds the exception string */
    public HexFormatException(String hex) {
        super("invalid hex format");
        this.hex = hex;
    }
    
    /** Return a message regarding this exception */
    @Override
    public String getMessage() {
        return (super.getMessage() + " " + hex);
    }
}
