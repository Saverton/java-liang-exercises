/**
 * (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens 
 * on a chessboard such that no two queens can attack each other (i.e., no two queens 
 * are on the same row, same column, or same diagonal). There are many possible 
 * solutions. Write a program that displays one such solution. 
 * @author Scott M.
 */

public class Exercise_7_22 {
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
     * Print a row on a chessboard.
     * @param row int[]: array representing row
     */
    public static void printRow(int[] row) {
        System.out.print('|');
        for (int i = 0; i < row.length; i++) {
            System.out.print((row[i] == 0) ? " |" : "Q|");
        }
        System.out.println();
    }
    /**
     * Return a row on a chessboard given a list of exceptions (columns to avoid), and diagonal exceptions both forward and backward.
     * @param execptions int[]: vertical exceptions for placing a queen.
     * @param forwardDiagonalExceptions int[]: diagonal exceptions for placing a queen (bottom left to upper right)
     * @param backwardDiagonalExceptions int[]: diagonal exceptions for placing a queen (upper left to bottom right)
     * @param rowNum int: row index to be generated
     * @return int[]: the generated row (0s = empty, 1s = queen)
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