/**
 * (Execution time) Write a program that randomly generates an array of 100,000 
 * integers and a key. Estimate the execution time of invoking the linearSearch
 * method in Listing 7.6. Sort the array and estimate the execution time of invoking 
 * the binarySearch method in Listing 7.7. You can use the following code 
 * template to obtain the execution time:
 *      long startTime = System.currentTimeMillis();
 *      perform the task;
 *      long endTime = System.currentTimeMillis();
 *      long executionTime = endTime - startTime;
 * @author Scott M.
 */

public class Exercise_7_16 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        long startTime, endTime, executionTime;
        int key, result1, result2;
        
        //1. Generate a random array of 100,000 elements and a random integer key.
        int[] array = genArray(100000);
        key = (int)(Math.random() * 1000);
        
        //2. Execute a linear search and display time.
        startTime = System.currentTimeMillis();
        result1 = linearSearch(array, key);
        endTime = System.currentTimeMillis();
        
        executionTime = (endTime - startTime) / 1000;
        System.out.println("Linear search took " + executionTime + " seconds.");
        
        //3. Execute a binary search and display time.
        startTime = System.currentTimeMillis();
        sortArrayUp(array);
        result2 = binarySearchShort(array, key);
        endTime = System.currentTimeMillis();
        
        executionTime = (endTime - startTime) / 1000;
        System.out.println("Binary search took " + executionTime + " seconds.");
        
        //4. Check if results were the same.
        System.out.println("Key was " + key);
        System.out.print("Results were " + result1 + ", " + result2);
    }
    /**
     * Return an integer array of a given length, populate it with random integers from 0 - 999.
     * @param elements int: length of array
     * @return int[]: array of random integers
     */
    public static int[] genArray(int elements) {
        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        return array;
    }
    /**
     * Return a sorted array in increasing numerical order.
     * @param array int[]: array of integers
     * @return int[]: sorted array
     */
    public static int[] sortArrayUp(int[] array) {
        int currentElement;
        for (int i = 0; i < array.length; i++) {
            currentElement = array[i];
            for (int j = 1; j <= i; j++) {
                if (array[i - j] > currentElement) {
                    array[i - j + 1] = array[i - j];
                    array [i - j] = currentElement;
                }
                else {
                    break;
                }
            }
        }
        return array;
    }
    /**
     * Return the first index of a certain element in an array using a binary search.
     * @param array int[]: integer array
     * @param key int: key to search for
     * @return int: first index of key, -1 if not found.
     */
    public static int binarySearch(int[] array, int key) {
        int low = 0, high = array.length, mid, index;
        while (true) {
            mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid;
            }
            else if (key > array[mid]) {
                low = mid;
            }
            else {
                index = mid;
                for (int i = 1; i <= mid; i++) {
                    if (array[mid - i] == array[mid]) {
                        index = mid - i;
                    }
                    else {
                        break;
                    }
                }
                return index;
            }
        }
    }
    /**
     * Return the index of a certain element in an array using a linear search.
     * @param array int[]: integer array
     * @param key int: key to search for
     * @return int: first index of key, -1 if not found.
     */
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
    /**
     * Return the index of a certain element in an array using a binary search.
     * @param array int[]: integer array
     * @param key int: key to search for
     * @return int: index of key, -1 if not found.
     */
    public static int binarySearchShort(int[] array, int key) {
        int low = 0, high = array.length, mid;
        while (true) {
            mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid;
            }
            else if (key > array[mid]) {
                low = mid;
            }
            else {
                return mid;
            }
        }
    }
}