/** Program to recursively count the occurances of a specific character in a String.
 * 
 * @author Scott M.
 * CountChars.java
 */

import java.util.Scanner;

public class CountChars {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = kb.nextLine();
        System.out.print("Enter a character to count: ");
        char key = kb.next().charAt(0);
        
        System.out.print(key + " appears " + countChar(str, key) + " time(s)");
    }
    
    /** Recursively return the amount of instances of a key character in a String.
     * @params String, key character
     * @return number of instances
     */
    public static int countChar(String str, char key) {
        return (countChar(str, key, 0));
    }
    
    /** Recursively return the amount of instances of a key character in a String.
     * @params String, key character
     * @return number of instances
     */
    public static int countChar(String str, char key, int index) {
        index = str.substring(index).indexOf(key);
        if (index >= 0) {
            return (1 + countChar(str, key, index));
        }
        else
            return 0;
    }
    
    /** Recursively return the amount of instances of a key character in a char array.
     * @params Char array: char[]
     * @return number of instances: int
     */
    public static int countChar(char[] arr, char key) {
        return (countChar(arr, key, 0));
    }
    
    /** Recursively return the amount of instances of a key character in a char array.
     * @params Char array: char[], index: int
     * @return number of instances: int
     */
    public static int countChar(char[] arr, char key, int index) {
        if (index == arr.length) {
            return (0);
        }
        else if (arr[index] == key) {
            return (1 + countChar(arr, key, index + 1));
        }
        else {
            return (countChar(arr, key, index + 1));
        }
    }
}