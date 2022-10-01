/**
 * Program to sum the major diagonal of a 4x4 matrix.
 * 
 * @author Scott M.
 * SumMajorDiagonal.java
 */

public class SumMajorDiagonal {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        double[][] array = Functions.createDouble2(4, 4);
        
        System.out.print("Sum of the elements in the major diagonal is " + Functions.sumMajorDiagDouble(array));
    }
}