/**
 * Program to take input from the user to check if a solution to a 9x9
 * Sudoku puzzle is valid or not.
 * 
 * @author Scott M.
 * SudokuCheck.java
 */

import java.util.Scanner;

public class SudokuCheck
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[][] sudoku = new int[9][9];
        
        System.out.println("Enter the sudoku solution:");
        for (int i = 0; i < sudoku.length; i++)
        {
            for (int j = 0; j < sudoku.length; j++)
            {
                sudoku[i][j] = kb.nextInt();
            }
        }
        
        if (isValid(sudoku))
        {
            System.out.print("The solution is valid");
        }
        else
        {
            System.out.print("The solution is invalid");
        }
    }
    
    /**
     * Method to check if a sudoku solution is valid
     */
    public static boolean isValid(int[][] sudoku)
    {
        boolean valid = true;
        //check that all nums are valid
        for (int i = 0; valid && i < sudoku.length; i++)
        {
            for (int j = 0; j < sudoku[i].length; j++)
            {
                if (sudoku[i][j] < 1 || sudoku[i][j] > 9)
                {
                    valid = false;
                    break;
                }
            }
        }
        
        //check the rows
        for (int i = 0; valid && i < sudoku.length; i++)
        {
            if (!validSet(sudoku[i]))
            {
                valid = false;
            }
        }
        
        //check the columns
        for (int j = 0; valid && j < sudoku[0].length; j++)
        {
            int[] temp = new int[sudoku[0].length];
            for (int i = 0; i < sudoku.length; i++)
            {
                temp[i] = sudoku[i][j];
            }
            if (!validSet(temp))
            {
                valid = false;
            }
        }
        
        //check the boxes
        for (int r = 0; valid && r < 3; r++)
        {
            for (int c = 0; c < 3; c++)
            {
                //create a temp array to check
                int[] temp = new int[9];
                for (int i = 0; i < temp.length; i++)
                {
                    temp[i] = sudoku[r * 3 + (i / 3)][c * 3 + (i % 3)];
                }
                if (!validSet(temp))
                {
                    valid = false;
                }
            }
        }
        
        return valid;
    }
    
    /**
     * Method to check if a 9 digit int array has exclusively the numbers
     * 1-9 contained within it.
     */
    public static boolean validSet(int[] array)
    {
        boolean[] temp = new boolean[array.length];
        boolean valid = true;
        
        for (int j = 0; j < array.length; j++)
        {
            if (!temp[array[j] - 1])
            {
                temp[array[j] - 1] = true;
            }
            else
            {
                valid = false;
                break;
            }        
        }
        
        return valid;
    }
}