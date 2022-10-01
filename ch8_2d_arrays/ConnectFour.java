/**
 * Program to host a heated game of CONNECT FOUR!
 * 
 * @author Scott M.
 * ConnectFour.java
 */

import java.util.Scanner;

public class ConnectFour {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int[][] board = new int[6][7];
        int turn = 0, column;
        
        System.out.println("\t\t\tCONNECT FOUR");
        while (checkWin(board) == 0 && !boardFull(board)) {
            System.out.println("Turn " + (turn + 1));
            printBoard(board);
            System.out.print("Player " + (turn % 2 + 1) + ": enter a column in which to drop a chip: ");
            column = kb.nextInt()- 1;
            while (!validEntry(board, column)) {
                System.out.print("Column full or invalid column index, try again: ");
                column = kb.nextInt() - 1;
            }
            inputChip(board, column, turn);
            turn++;
        }
        printBoard(board);
        System.out.print("Player " + checkWin(board) + " wins");
    }
    /**
     * Method to check if a player has won connect 4
     */
    public static int checkWin(int[][] array) {
        if (array.length < 4 || array[0].length < 4) {
            return 0;
        }
        
        //check rows
        for (int i = 0; i < array.length; i++) {
            int val = array[i][0], consecCount = 1;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    consecCount = 1;
                    continue;
                }
                if (array[i][j] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[i][j];
                }
                if (consecCount == 4) {
                    return val;
                }
            }
        }
        
        //check columns
        for (int i = 0; i < array[0].length; i++) {
            int val = array[0][i], consecCount = 1;
            for (int j = 1; j < array.length; j++) {
                if (array[j][i] == 0) {
                    consecCount = 1;
                    continue;
                }
                if (array[j][i] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[j][i];
                }
                if (consecCount == 4) {
                    return val;
                }
            }
        }
        
        //check major diagonals
        int numDiags = (array.length + array[0].length) - 7;
        for (int i = 0; i < numDiags; i++) {
            int j = (array.length - 4 - i >= 0) ? array.length - 4 - i : 0;
            int k = (array.length - 4 - i >= 0) ? 0 : Math.abs(array.length - 4 - i);
            int consecCount = 0, val = array[j][k];
            for ( ; j < array.length && k < array[j].length; j++, k++) {
                if (array[j][k] == 0) {
                    consecCount = 1;
                    continue;
                }
                if (array[j][k] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[j][k];
                }
                if (consecCount == 4) {
                    return val;
                }
            }
        }
        
        //check sub diagonals
        for (int i = 0; i < numDiags; i++) {
            int j = (3 + i < array.length) ? 3 + i : array.length - 1;
            int k = (3 + i < array.length) ? 0 : (3 + i) - (array.length - 1);
            int consecCount = 0, val = array[j][k];
            for ( ; j >= 0 && k < array[j].length; j--, k++) {
                if (array[j][k] == 0) {
                    consecCount = 1;
                    continue;
                }
                if (array[j][k] == val) {
                    consecCount++;
                } else {
                    consecCount = 1;
                    val = array[j][k];
                }
                if (consecCount == 4) {
                    return val;
                }
            }
        }
        return 0;
    }
    /**
     * Method to check if the board is full.
     */
    public static boolean boardFull(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Method to print the board for connect 4
     */
    public static void printBoard(int[][] board) {
        for (int i = 1; i <= board[0].length; i++) {
            System.out.print(" "+ i);
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print((board[i][j] == 0) ? "| " : "|" + board[i][j]);
            }
            System.out.println('|');
        }
        for (int j = 0; j < board[0].length; j++) {
            System.out.print("--");
        }
        System.out.println('-');
    }
    /**
     * Method to input a chip in a user defined column
     */
    public static void inputChip(int[][] board, int column, int turn) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column] == 0) {
                board[i][column] = (turn % 2) + 1;
                return;
            }
        }
    }
    /**
     * Method to check if a column input is valid
     */
    public static boolean validEntry(int[][] board, int column) {
        if (column < 0 || column >= board[0].length) {
            return false;
        }
        if (board[0][column] != 0) {
            return false;
        }
        return true;
    }
}