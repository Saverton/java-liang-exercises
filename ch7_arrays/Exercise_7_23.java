/**
 *  (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are 
 * closed on the first day of school. As the students enter, the first student, denoted 
 * S1, opens every locker. Then the second student, S2, begins with the second 
 * locker, denoted L2, and closes every other locker. Student S3 begins with the 
 * third locker and changes every third locker (closes it if it was open, and opens it if 
 * it was closed). Student S4 begins with locker L4 and changes every fourth locker. 
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student 
 * S100 changes L100.
 * After all the students have passed through the building and changed the lockers, 
 * which lockers are open? Write a program to find your answer and display all 
 * open locker numbers separated by exactly one space.
 * @author Scott M.
 */

public class Exercise_7_23 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];
        
        //Run the locker sequence
        for (int student = 0; student < 100; student++) {
            //student opens necessary lockers (true = open, false = closed)
            for (int i = student + 1; i <= 100; i += (student + 1)) {
                locker[i - 1] = (locker[i - 1]) ? false : true;
            }
        }
        
        printLockers(locker);
    }
    /**
     * Print the status of each locker.
     * @param locker boolean[]: array of lockers (true = open, false = closed)
     */
    public static void printLockers(boolean[] locker) {
        System.out.println("Locker #\tOpen/Closed");
        for (int i = 0; i < locker.length; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.println((locker[i]) ? "Open" : "Closed");
        }
    }
}