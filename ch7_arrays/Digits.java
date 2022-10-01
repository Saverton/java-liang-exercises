/**
 * Program to count the occurrence of each single digit in an array of 100 numbers 0-9.
 * 
 * @author Scott M.
 * Digits.java
 */

public class Digits {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[] nums = genArray();
        
        //1. Print the array of numbers;
        Primes.printArray(nums);
        System.out.println();
        
        //2. process the array;
        int[] counts = countNums(nums);
        
        //3. Print the results of count;
        printCounts(counts);
    }
    /**
     * Method to generate an array of 100 random integers from 0-9.
     */
    public static int[] genArray() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10);
        }
        return nums;
    }
    /**
     * Method to count the numbers in an array.
     */
    public static int[] countNums(int[] nums) {
        int[] counts = new int[10];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }
        return counts;
    }
    /**
     * Method to print the counts of each digit.
     */
    public static void printCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}