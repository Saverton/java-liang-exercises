/**
 * Program to display all possible combinations of two integers from 1 - 7.
 * 
 * @author Scott M.
 * IntegerCombos.java
 */

public class IntegerCombos {
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