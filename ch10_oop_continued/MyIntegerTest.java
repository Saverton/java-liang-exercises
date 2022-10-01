/**
 * Program to test the MyInteger Class.
 * 
 * @author Scott M.
 * MyIntegerTest.java
 */

public class MyIntegerTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        MyInteger i = new MyInteger(5);
        char[] c = new char[3];
        c[0] = '1';
        c[1] = '2';
        c[2] = '3';
        
        System.out.println(i.getValue());
        System.out.println(i.isEven());
        System.out.println(i.isOdd());
        System.out.println(i.isPrime());
        System.out.println(i.equals(5));
        System.out.println(MyInteger.parseInt(c));
        System.out.println(MyInteger.parseInt("123"));
    }
}