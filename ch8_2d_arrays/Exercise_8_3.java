/**
 * (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the 
 * students in increasing order of the number of correct answers.
 * @author Scott M.
 */

public class Exercise_8_3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //input answers and the key
        char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] scores = new int[2][8];
        
        //grade answers
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            scores[0][i] = correctCount;
            scores[1][i] = i;
        }
        
        sort(scores);
        
        for (int i = 0; i < scores[0].length; i++) {
            System.out.println("Student " + scores[1][i] + "'s correct count is " + scores[0][i]);
        }
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