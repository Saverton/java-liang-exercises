/**
 * (Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
 * array using the following header:
 *      public static void shuffle(int[][] m)
 * Write a test program that shuffles the following matrix:
 *      int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 * @author Scott M.
 */

public class Exercise_8_18 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Array before shuffle: ");
        printArray(m);
        
        shuffle(m);
        
        System.out.println("\nArray after shuffle: ");
        printArray(m);
    }
    /**
     * Shuffle the rows of a given 2d integer array.
     * @param array int[][]: array to shuffle
     */
    public static void shuffle(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int j = (int)(Math.random() * (i - 1));
            int[] temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
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