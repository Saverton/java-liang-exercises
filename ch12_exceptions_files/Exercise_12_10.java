/** 
 * (OutOfMemoryError) Write a program that causes the JVM to throw an 
 * OutOfMemoryError and catches and handles this error.
 * @author Scott M.
 */

public class Exercise_12_10 {
    /** Main method to run program */
    public static void main(String[] args) {
        try {
            Integer[] array = new Integer[100000 * 1000000];
            array[0] = 1;
        }
        catch (java.lang.OutOfMemoryError er) {
            System.out.print("Out of memory");
        }
    }
}
