/**
 * Program to shuffle the rows in a multidimensional array.
 * 
 * @author Scott M.
 * ShuffleRows.java
 */

public class ShuffleRows {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Array before shuffle: ");
        Functions.printArray(m);
        
        shuffle(m);
        
        System.out.println("\nArray after shuffle: ");
        Functions.printArray(m);
    }
    /**
     * Method to shuffle a multidimensional array's rows.
     */
    public static void shuffle(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int j = (int)(Math.random() * (i - 1));
            int[] temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}