/**
 * (Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking 
 * whether every number is valid in the board. Rewrite the program by checking 
 * whether every row, every column, and every small box has the numbers 1 to 9. 
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_8_24
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
        kb.close();
        
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
     * Check if a sudoku solution is valid.
     * @param sudoku int[][]: sudoku puzzle solution
     * @return boolean: true = solution is valid, false otherwise
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
     * Check if a given array has a valid set of integers from 1 to 9.
     * @param array int[]: array to check
     * @return boolean: true = set has numbers 1-9 (is valid), false otherwise
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