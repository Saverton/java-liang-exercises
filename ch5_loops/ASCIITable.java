/**
 * Program to display the ASCII table with 10 chars per line.
 * 
 * @author Scott M.
 * ASCIITable.java
 */

public class ASCIITable {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        for (char c = '!'; c <= '~'; c++) {
            System.out.print(((c - '!' + 1) % 10 == 0) ? c + "\n" : c + " ");
        }
    }
}