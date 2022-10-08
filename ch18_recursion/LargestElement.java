/** Program to recursively find the largest element in an array.
 * @author Scott M.
 * LargestElement.java
 */

import java.util.Scanner;

public class LargestElement {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[8];
        
        System.out.println("Enter 8 Integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        
        System.out.print("Largest element is " + largestElement(arr));
    }
    
    /** Return the largest element in an array.
     * @params Integer array: int[]
     * @return largest element: int
     */
    public static int largestElement(int[] arr) {
        return (largestElement(arr, 1));
    }
    
    /** Return the largest element in an array.
     * @params Integer array: int[], index: int
     * @return largest element: int
     */
    public static int largestElement(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        else {
            return Math.max(arr[index], largestElement(arr, index + 1));
        }
    }
}