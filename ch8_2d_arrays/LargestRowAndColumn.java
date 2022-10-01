/**
 * Program to generate a random array of 0s and 1s then find the index of the row and column with the most 1s
 * 
 * @author Scott M.
 * LargestRowAndColumn.java
 */

public class LargestRowAndColumn {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[][] array = genArray(4, 4);
        Functions.printArray(array);
        System.out.println("The largest row index: " + largestRow(array));
        System.out.print("The largest column index: " + largestColumn(array));
    }
    /**
     * Method to generate a multidimensional array of 0s and 1s.
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
     * Method to return the index of the row with the most 1s.
     */
    public static int largestRow(int[][] array) {
        int largeCount = 0, largeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                count += (array[i][j] == 1) ? 1 : 0;
            }
            if (largeCount < count) {
                largeIndex = i;
                largeCount = count;
            }
        }
        return largeIndex;
    }
    /**
     * Method to return the index of the column with the most 1s.
     */
    public static int largestColumn(int[][] array) {
        int largeCount = 0, largeIndex = 0;
        for (int i = 0; i < array[0].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                count += (array[j][i] == 1) ? 1 : 0;
            }
            if (largeCount < count) {
                largeIndex = i;
                largeCount = count;
            }
        }
        return largeIndex;
    }
}