/**
 * (Perfect number) A positive integer is called a perfect number if it is equal to 
 * the sum of all of its positive divisors, excluding itself. For example, 6 is the first 
 * perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 
 * + 1. There are four perfect numbers less than 10,000. Write a program to find all 
 * these four numbers.
 * @author Scott M.
 */

public class Exercise_5_33 {
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