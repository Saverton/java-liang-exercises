/**
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into 
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the 
 * most 1s.
 * @author Scott M.
 */

public class Exercise_8_10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[][] array = genArray(4, 4);
        printArray(array);
        System.out.println("The largest row index: " + largestRow(array));
        System.out.print("The largest column index: " + largestColumn(array));
    }
    /**
     * Return a 2d array with x columns and y rows that is populated randomly with 0s and 1s.
     * @param rows int: number of rows
     * @param columns int: number of columns
     * @return int[][]: generated array of 0s and 1s
     */
    public static int[][] genArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
        return array;
    }
    /**
     * Return the index of the row with the greatest sum
     * @param array int[][]: 2d integer array
     * @return int: largest row index
     */
    public static int largestRow(int[][] array) {
        int greatestSum = sumRow(array, 0), greatestSumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            int rowSum = sumRow(array, i);
            if (rowSum > greatestSum) {
                greatestSum = rowSum;
                greatestSumIndex = i;
            }
        }
        return greatestSumIndex;
    }
    /**
     * Return the index of the column with the greatest sum.
     * @param array int[][]: 2d integer array
     * @return int: largest column index
     */
    public static int largestColumn(int[][] array) {
        int greatestSum = sumColumn(array, 0), greatestSumIndex = 0;
        for (int i = 0; i < array[0].length; i++) {
            int columnSum = sumColumn(array, i);
            if (columnSum > greatestSum) {
                greatestSum = columnSum;
                greatestSumIndex = i;
            }
        }
        return greatestSumIndex;
    }
    /**
     * Return the sum of a specific row in a 2d integer array.
     * @param array int[][]: 2d integer array
     * @param row int: row index to sum
     * @return int: sum of row
     */
    public static int sumRow(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
    /**
     * Return the sum of a specific column in a 2d integer array.
     * @param array int[][]: 2d integer array
     * @param column int: column index to sum
     * @return int: sum of column
     */
    public static int sumColumn(int[][] array, int column) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
    /**
     * Print a 2d integer array.
     * @param array int[][]: 2d array of integers
     */
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}