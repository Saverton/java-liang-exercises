/**
 * (Count single digits) Write a program that generates 100 random integers between 
 * 0 and 9 and displays the count for each number. 
 * @author Scott M.
 */

public class Exercise_7_7 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        int[] nums = genArray();
        
        //1. Print the array of numbers;
        printArray(nums);
        System.out.println();
        
        //2. process the array;
        int[] counts = countNums(nums);
        
        //3. Print the results of count;
        displayOccurrences(counts);;
    }
    /**
     * Return an array of size 100 populated with random integers from 0-9
     * @return int[]: array of random integers
     */
    public static int[] genArray() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10);
        }
        return nums;
    }
    /**
     * Count the occurence of each number (0-9) in a given array
     * @param nums int[]: array to count from
     * @return int[]: array with the count for each number 0-9 stored in indexes 0-9
     */
    public static int[] countNums(int[] nums) {
        int[] counts = new int[10];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }
        return counts;
    }
    /**
     * Print out each index's value greater than 0 formatted to describe this as the amount of times index i occurs.
     * @param count int[]: the array with the counts for each index
     */
    public static void displayOccurrences(int[] count) {
        for (int i = 1; i < 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " time" + ((count[i] > 1) ? "s" : ""));
            }
        }
    }
    /**
     * Print an array with 10 elements per line.
     * @param array int[]: array of integers
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(((i + 1) % 10 == 0) ? array[i] + "\n" : array[i] + " ");
        }
    }
}