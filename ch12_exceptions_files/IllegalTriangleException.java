/** Exception class that is thrown when a triangle with impossible side lengths is created.
 * 
 * @author Scott M.
 * IllegalTriangleException.java
 */

public class IllegalTriangleException extends Exception {
    /** Construct a new exception */
    public IllegalTriangleException() {
        super("Triangle side lengths are not possible");
    }
    
    public String getMessage() {
        return ("Triangle side lengths are not possible");
    }
}
