/** Program to test Complex class; creates 2 complex objects and performs each operation on them.
 * 
 * @author Scott M.
 * ComplexTest.java
 */

import java.util.Scanner;

public class ComplexTest {
    /** Main method to run program. */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Complex num1, num2;
        
        System.out.print("Enter the first complex number: ");
        num1 = new Complex(kb.nextDouble(), kb.nextDouble());
        System.out.print("Enter the second complex number: ");
        num2 = new Complex(kb.nextDouble(), kb.nextDouble());
        
        System.out.println(num1 + " + " + num2 + " = " + num1.add(num2));
        System.out.println(num1 + " - " + num2 + " = " + num1.subtract(num2));
        System.out.println(num1 + " * " + num2 + " = " + num1.multiply(num2));
        System.out.println(num1 + " / " + num2 + " = " + num1.divide(num2));
        System.out.println("|" + num1 + "|" + " = " + num1.abs());
    }
}