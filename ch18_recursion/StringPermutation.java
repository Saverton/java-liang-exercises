/** Program to recursively print all permutations of a String.
 * 
 * @author Scott M.
 * StringPermutation.java
 */

import java.util.Scanner;

public class StringPermutation {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s;
        
        System.out.print("Enter a String: ");
        s = kb.next();
        permutate(s);
    }
    
    /** Print all permutations of a String.
     * @params String to permutate: String
     */
    public static void permutate(String s) {
        permutate(s, 0);
    }
    
    /** Print all permutations of a String.
     * @params String to permutate: String, index: int
     */
    public static void permutate(String s, int index) {
        if (index == s.length()) {
            System.out.println(s);
        }
        else {
            for (int i = index; i < s.length(); i++) {
                permutate((s.substring(0, index) + s.charAt(i) + s.substring(index, i) + s.substring(i + 1)), index + 1);
            }
        }
    }
}