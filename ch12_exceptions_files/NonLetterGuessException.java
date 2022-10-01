/** Exception class for a non-letter guess in the Hangman2 class.
 * @author Scott M.
 * NonLetterGuessException.java
 */

public class NonLetterGuessException extends Exception {
    /** Construct a NonLetterGuessException */
    public NonLetterGuessException() {
        super("Invalid Letter Entered");
    }
}
