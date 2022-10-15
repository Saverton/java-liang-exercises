/**
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional 
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and 
 * every column have an even number of 1s.
 * @author Scott M.
 */

public class Exercise_8_22
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        int[][] matrix = genArray();
        
        System.out.println("Matrix:");
        for (int[] i: matrix)
        {
            for (int j: i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrix.length; i++)
        {
            if (checkArray(matrix[i]))
            {
                System.out.println("Row " + i + " has an even number of 1s");
            }
        }
        
        for (int i = 0; i < matrix[0].length; i++)
        {
            int[] temp = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++)
            {
                temp[j] = matrix[j][i];
            }
            if (checkArray(temp))
            {
                System.out.println("Column " + i + " has an even number of 1s");
            }
        }
    }
    
    /**
     * Return a new 6x6 matrix populated randomly with 0s and 1s
     * @return int[][]: generated 2d array
     */
    public static int[][] genArray()
    {
        int[][] array = new int[6][6];
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
        
        return array;
    }
    
    /**
     * Check if an array has an even number of 1s.
     * @param array int[]: array to check
     * @return boolean: true = array has even number of 1s, false otherwise
     */
    public static boolean checkArray(int[] array)
    {
        int count = 0;
        for (int i: array)
        {
            if (i == 1)
            {
                count++;
            }
        }
        if (count % 2 == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}