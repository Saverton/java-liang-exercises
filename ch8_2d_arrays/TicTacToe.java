/**
 * Program to play a 2 player game of TicTacToe.
 * 
 * @author Scott M.
 * TicTacToe.java
 */

import java.util.Scanner;

public class TicTacToe {
    /**
     * Main method to run program.
     */
    public static void main (String[] args) {
        //Create a board
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        int[] move = new int[2];
        boolean win = false;
        int turn = 0;
        
        //loop player turns, alternating between players.
        while (!win) {
            //one turn: Print board, ask for row input, ask for column input, place tile
            printBoard(board);
            do {
                move = inputMove(turn);
            } while (board[move[0]][move[1]] != ' ');
            placeTile(board, turn, move);
            //At end of each move, check if there are any 3 in a row or if the board is full.
            if (checkWin(board, turn)) {
                printBoard(board);
                System.out.print((turn % 2 == 0) ? "X Player won" : "O Player won");
                break;
            }
            if (checkFull(board)) {
                printBoard(board);
                System.out.print("Tie");
                break;
            }
            turn++;
        }
    }
    /**
     * Method to print a board.
     */
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 13; i++) {
            System.out.print("-");
        }
        for (int j = 0; j < 3; j++) {
            System.out.println();
            for (int k = 0; k < 3; k++) {
                System.out.print("| " + board[j][k] + " ");
            }
            System.out.println('|');
            for (int i = 0; i < 13; i++) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    /**
     * Method to input a move for a player.
     */
    public static int[] inputMove(int turn) {
        Scanner kb = new Scanner (System.in);
        int[] move = new int[2];
        
        System.out.print("Enter a row (0, 1, or 2) for player ");
        System.out.print((turn % 2 == 0) ? "X: " : "O: ");
        move[0] = kb.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player ");
        System.out.print((turn % 2 == 0) ? "X: " : "O: ");
        move[1] = kb.nextInt();
        
        return move;
    }
    /**
     * Method to place a tile at the appropriate spot based on a move input.
     */
    public static void placeTile(char[][] board, int turn, int[] move) {
        board[move[0]][move[1]] = (turn % 2 == 0) ? 'X' : 'O';
    }
    /**
     * Method to check if tic tac toe is won
     */
    public static boolean checkWin(char[][] board, int turn) {
        char winChar = (turn % 2 == 0) ? 'X' : 'O';
        boolean win;
        //check verticals
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != winChar) {
                    win = false;
                }
            }
            if (win) {
                return win;
            }
        }
        
        //check horizontals
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (board[j][i] != winChar) {
                    win = false;
                }
            }
            if (win) {
                return win;
            }
        }
        
        //check diagonals
        win = true;
        for (int i = 0; i < 3; i++) {
            if (board[i][i] != winChar) {
                win = false;
            }
            if (win) {
                return win;
            }
        }
        win = true;
        for (int i = 0; i < 3; i++) {
            if (board[i][2 - i] != winChar) {
                win = false;
            }
        }
        return win;
    }
    /**
     * Method to check if the board is full.
     */
    public static boolean checkFull(char[][] board) {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    full = false;
                }
            }
        }
        return full;
    }
}