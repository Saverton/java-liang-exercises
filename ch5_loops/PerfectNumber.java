/**
 * Program to list the four perfect numbers from 1 - 10,000
 * 
 * @author Scott M.
 * PerfectNumber.java
 */

public class PerfectNumber {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int factorSum;
        String list = "";
        
        //1. Check numbers from 1 - 1,000 (loop)
        for (int number = 1; number <= 10000; number++) {
            //2. Find Factors of each number (loop)
            factorSum = 0;
            for (int factor = 1; factor < number; factor++) {
                if (number % factor == 0) {
                    factorSum += factor;
                }
            }
            
            //3. if number = sum of factors, perfect number is true
            if (factorSum == number) {
                //4. Add perfect number to list
                list += number + " ";
            }
        }
        
        //5. display list
        System.out.print("Perfect Numbers: " + list);
    }
}