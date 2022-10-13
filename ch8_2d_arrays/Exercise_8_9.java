/**
 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns 
 * marking an available cell in a 3 * 3 grid with their respective tokens (either 
 * X or O). When one player has placed three tokens in a horizontal, vertical, or 
 * diagonal row on the grid, the game is over and that player has won. A draw (no 
 * winner) occurs when all the cells on the grid have been filled with tokens and 
 * neither player has achieved a win. Create a program for playing tic-tac-toe.
 * The program prompts two players to enter an X token and O token alternately. 
 * Whenever a token is entered, the program redisplays the board on the 
 * console and determines the status of the game (win, draw, or continue).
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_9 {
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
            placeMark(board, turn, move);
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
     * Print a Tic-Tac-Toe board given a 2d char array
     * @param board char[][]: 3x3 array of ' 's, 'X's, and 'O's representing tic tac toe board
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
     * Return an integer array with coordinates for a player's input, taken in from the console.
     * @param turn int: turn number (used to determine which player inputs)
     * @return int[]: coordinates to place X or O
     */
    public static int[] inputMove(int turn) {
        Scanner kb = new Scanner (System.in);
        int[] move = new int[2];
        
        System.out.print("Enter a row (0, 1, or 2) for player " + ((turn % 2 == 0) ? "X: " : "O: "));
        move[0] = kb.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player " + ((turn % 2 == 0) ? "X: " : "O: "));
        move[1] = kb.nextInt();
        kb.close();
        
        return move;
    }
    /**
     * Insert a mark onto the tic tac toe board given the turn (to determine X or O) and move coordinates.
     * @param board char[][]: tic tac toe board
     * @param turn int: turn number
     * @param coordinates int[]: coordinates to place mark
     */
    public static void placeMark(char[][] board, int turn, int[] coordinates) {
        board[coordinates[0]][coordinates[1]] = (turn % 2 == 0) ? 'X' : 'O';
    }
    /**
     * Check if the tic tac toe board is won.
     * @param board char[][]: tic tac toe board
     * @param turn int: turn number
     * @return boolean: true = game is won, false otherwise
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
     * Check if a tic tac toe board is full, rendering the game over as a tie.
     * @param board char[][]: tic tac toe board
     * @return boolean: true = board is full (tie), false otherwise
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