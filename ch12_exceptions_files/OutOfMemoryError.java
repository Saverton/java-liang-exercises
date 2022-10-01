/** Program to cause the JVM to throw an OutOfMemory exception.
 * 
 * @author Scott M.
 * OutOfMemoryError.java
 */

import java.util.ArrayList;
import java.math.BigInteger;

public class OutOfMemoryError {
    /** Main method to run program */
    public static void main(String[] args) {
        try {
            Integer[] array = new Integer[100000 * 1000000];
        }
        catch (java.lang.OutOfMemoryError er) {
            System.out.print("Out of memory");
        }
    }
}
