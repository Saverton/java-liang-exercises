/**
 * Program to generate solutions to the game "Eight Queens".
 * 
 * @author Scott M.
 * Queens.java
 */

public class Queens {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[] exceptions = new int[8];
        int[] forwardDiagonalExceptions = new int[15];
        int[] backwardDiagonalExceptions = new int[15];
        
        for (int i = 0; i < 8; i++) {
            printRow(genRow(exceptions, forwardDiagonalExceptions, backwardDiagonalExceptions, i));
        }
    }
    /**
     * Method to print rows accordingly.
     */
    public static void printRow(int[] row) {
        System.out.print('|');
        for (int i = 0; i < row.length; i++) {
            System.out.print((row[i] == 0) ? " |" : "Q|");
        }
        System.out.println();
    }
    /**
     * Method to generate a row.
     */
    public static int[] genRow(int[] exceptions, int[] forwardDiagonalExceptions, int[] backwardDiagonalExceptions, int rowNum) {
        int[] row = new int[8];
        int queen = (int)(Math.random() * 8);
        do {
            if (queen != 7) {
                queen++;
            }
            else {
                queen = 0;
            }
        } while (exceptions[queen] != 0 || forwardDiagonalExceptions[rowNum + queen] != 0 || backwardDiagonalExceptions[(7 - rowNum) + queen] != 0);
        backwardDiagonalExceptions[(7 - rowNum) + queen]++;
        forwardDiagonalExceptions[rowNum + queen]++;
        exceptions[queen]++;
        row[queen]++;
        return row;
    }
}