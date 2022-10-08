/**
 * (Display the ASCII character table) Write a program that prints the characters in 
 * the ASCII character table from ! to ~. Display ten characters per line. The ASCII 
 * table is shown in Appendix B. Characters are separated by exactly one space.
 * @author Scott M.
 */

public class Exercise_5_15 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        for (char c = '!'; c <= '~'; c++) {
            System.out.print(((c - '!' + 1) % 10 == 0) ? c + "\n" : c + " ");
        }
    }
}