/**
 * Program to get a random number that excludes the numbers passed in the args.
 * 
 * @author Scott M.
 * RandNum.java
 */

public class RandNum {
    /**
     * Method to generate a random number excluding the nums in the array passed in the arguments.
     */
    public static int getRandom(int[] numbers) {
        int num;
        while (true) {
            //1. Gen random num from 1 to 54;
            num = (int)(Math.random() * 53 + 1);
            
            //2. Check if random num is on the blacklist;
            if (DistinctNums.searchArray(numbers, num, 0)) {
                continue;
            }
            //3. return number;
            else {
                return num;
            }
        }
    }
}