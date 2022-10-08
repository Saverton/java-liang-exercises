/**
 * (Math: combinations) Write a program that displays all possible combinations 
 * for picking two numbers from integers 1 to 7. Also display the total number of 
 * all combinations.
 * @author Scott M.
 */

public class Exercise_5_43 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int val1, val2, combos = 0;
        
        for (val1 = 1; val1 <= 7; val1++) {
            for (val2 = 1; val2 <= 7; val2++) {
                System.out.println(val1 + " " + val2);
                combos++;
            }
        }
        
        System.out.print("There are " + combos + " combinations total.");
    }
}