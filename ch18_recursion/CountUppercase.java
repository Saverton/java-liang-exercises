/** Program to recursively count the number of uppercase letters in a String.
 * @author Scott M.
 * CountUppercase.java
 */

import java.util.Scanner;

public class CountUppercase {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] stringArray;
        String input;
        
        System.out.print("Enter a String: ");
        input = kb.nextLine();
        System.out.println("Number of Uppercase (String): " + countUppercase(input));
        
        stringArray = new char[input.length()];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = input.charAt(i);
        }
        System.out.print("Number of Uppercase (Array): " + countUppercase2(stringArray));
    }
    
    /** Return the number of uppercase Letters in a String.
     * @params String
     * @return number of Uppercase
     */
    public static int countUppercase(String s) {
        return (countUppercase(s, 0));
    }
    
    /** Return the number of uppercase Letters in a String.
     * @params String, index
     * @return number of Uppercase
     */
    public static int countUppercase(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        else {
            return (((s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') ? 1 : 0) + countUppercase(s, index + 1));
        }
    }
    
    /** Return the number of uppercase letters in a char array.
     * @params char array: char[]
     * @return number of uppercase letters: int
     */
    public static int countUppercase2(char[] arr) {
        return (countUppercase2(arr, 0));
    }
    
    /** Return the number of uppercase letters in a char array.
     * @params char array: char[], index: int
     * @return number of uppercase letters: int
     */
    public static int countUppercase2(char[] arr, int index) {
        if (index == arr.length) {
            return (0);
        }
        else {
            return (((arr[index] >= 'A' && arr[index] <= 'Z') ? 1 : 0) + countUppercase2(arr, index + 1));
        }
    }
}