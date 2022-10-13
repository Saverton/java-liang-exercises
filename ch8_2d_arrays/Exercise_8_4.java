/**
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all 
 * employees are stored in a two-dimensional array. Each row records an employee’s 
 * seven-day work hours with seven columns. For example, the following 
 * array stores the work hours for eight employees. Write a program that displays 
 * employees and their total hours in decreasing order of the total hours.
 *              Su M T W Th F Sa
 * Employee 0   2  4 3 4 5  8 8
 * Employee 1   7  3 4 3 3  4 4
 * Employee 2   3  3 4 3 3  2 2
 * Employee 3   9  3 4 7 3  4 1
 * Employee 4   3  5 4 3 6  3 8
 * Employee 5   3  4 4 6 3  4 4
 * Employee 6   3  7 4 8 3  8 4
 * Employee 7   6  3 5 9 2  7 9
 * @author Scott M.
 */

public class Exercise_8_4 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        int[][] totalHours = new int[2][8];
        for (int i = 0; i < totalHours[1].length; i++) {
            totalHours[1][i] = i;
        }
        
        //calc total hrs for each employee;
        for (int i = 0; i < hours.length; i++) {
            totalHours[0][i] = sumRow(hours, i);
        }
        
        //sort total hrs array;
        sort(totalHours);
        
        for (int i = totalHours[0].length - 1; i >= 0; i--) {
            System.out.println("Employee #" + totalHours[1][i] + " has " + totalHours[0][i] + " hours");
        }
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
     * Sort the first column of a 2d integer array.
     * @param array int[][]: 2d integer array
     */
    public static void sort(int[][] array) {
        int min, temp;
        for (int i = 0; i < array[0].length; i++) {
            //find min
            min = minIndex(array[0], i);
            
            //switch minimum value to lowest index
            temp = array[0][i];
            array[0][i] = array[0][min];
            array[0][min] = temp;
            
            //switch minimum value student to lowest index
            temp = array[1][i];
            array[1][i] = array[1][min];
            array[1][min] = temp;
        }
    }
    /**
     * Return the index of the minimum value in an integer array.
     * @param array int[]: array of integers
     * @param startingIndex int: index to begin searching
     * @return int: index of minimum value
     */
    public static int minIndex(int[] array, int startingIndex) {
        int min = startingIndex;
        for (int j = startingIndex; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        return min;
    }
}