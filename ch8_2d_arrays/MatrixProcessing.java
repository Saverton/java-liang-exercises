/**
 * Program to generate a 6x6 2d array of 0s and 1s, then process each row and column and returns
 * whether or not that row or column has an even number of 1s.
 * 
 * @author Scott M.
 * MatrixProcessing.java
 */

public class MatrixProcessing
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
     * Method to generate a 6x6 array of 0s and 1s
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
     * Method to return if an array has an even number of 1s
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