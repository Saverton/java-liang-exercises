/**
 * Program to calculate the time it takes to sort an array of 100,000 elements and perform a binary search for a random key.
 * 
 * @author Scott M.
 * ExecutionTime.java
 */

public class ExecutionTime {
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
     * Method to generate an array of x integers.
     */
    public static int[] genArray(int elements) {
        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        return array;
    }
    /**
     * Method to sort an array in ascending order.
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
     * Method to perform a binary search for a specific key.
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
     * Method to perform a linear search for a specific key in an array.
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
     * Method to perform a binary search for a key in an array without finding the earliest instance of that key.
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