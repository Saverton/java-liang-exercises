/**
 * (Random number chooser) Write a method that returns a random number between 
 * 1 and 54, excluding the numbers passed in the argument. The method header is 
 * specified as follows:
 *      public static int getRandom(int... numbers)
 * @author Scott M.
 */

public class Exercise_7_13 {
    /**
     * Generate a random number from 1-54 excluding numbers passed to the method.
     * @param numbers int...: list of numbers to exclude from the random number choice
     * @return int: random number
     */
    public static int getRandom(int... numbers) {
        int num;
        do {
            //1. Gen random num from 1 to 54;
            num = (int)(Math.random() * 53 + 1);
        } while(searchArray(numbers, num, 0));
        return num;
    }
    /**
     * Check if an array of integers contains a certain key after a specified start index.
     * @param list int[]: the array to be searched
     * @param key int: the key to search for
     * @param startIndex int: the index to start searching (0=start of array)
     * @return boolean: true = key was found in the array after startIndex, false otherwise
     */
    public static boolean searchArray(int[] list, int key, int startIndex) {
        for (int i = startIndex + 1; i < list.length; i++) {
            if (key == list[i]) {
                return true;
            }
        }
        return false;
    }
}