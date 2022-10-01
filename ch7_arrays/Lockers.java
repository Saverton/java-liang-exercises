/**
 * Program to solve the locker puzzle explained in exercise 7.23
 * 
 * @author Scott M.
 * Lockers.java
 */

public class Lockers {
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
     * Method to print locker status.
     */
    public static void printLockers(boolean[] locker) {
        System.out.println("Locker #\tOpen/Closed");
        for (int i = 0; i < locker.length; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.println((locker[i]) ? "Open" : "Closed");
        }
    }
}