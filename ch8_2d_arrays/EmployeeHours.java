/**
 * Program to calculate total employee hours for a workweek, then display them in decreasing order.
 * 
 * @author Scott M.
 * EmployeeHours.java
 */

public class EmployeeHours {
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
            totalHours[0][i] = Functions.sumRowInt(hours, i);
        }
        
        //sort total hrs array;
        GradeExam.sort(totalHours);
        
        for (int i = totalHours[0].length - 1; i >= 0; i--) {
            System.out.println("Employee #" + totalHours[1][i] + " has " + totalHours[0][i] + " hours");
        }
    }
}