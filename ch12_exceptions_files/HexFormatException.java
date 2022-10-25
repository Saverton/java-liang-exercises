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
    
    /** Construct a HexFormatException that holds the invalid hex string.
     * @param hex String: invalid hex String
     */
    public HexFormatException(String hex) {
        super("invalid hex format");
        this.hex = hex;
    }
    
    /** Return a String with info about this exception 
     * @return String: exception info
     */
    @Override
    public String getMessage() {
        return (super.getMessage() + " " + hex);
    }
}
