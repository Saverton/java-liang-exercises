/**
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 *  ■ An int data field named value that stores the int value represented by this 
 *    object.
 *  ■ A constructor that creates a MyInteger object for the specified int value.
 *  ■ A getter method that returns the int value.
 *  ■ The methods isEven(), isOdd(), and isPrime() that return true if the 
 *    value in this object is even, odd, or prime, respectively.
 *  ■ The static methods isEven(int), isOdd(int), and isPrime(int) that 
 *    return true if the specified value is even, odd, or prime, respectively.
 *  ■ The static methods isEven(MyInteger), isOdd(MyInteger), and 
 *    isPrime(MyInteger) that return true if the specified value is even, odd, 
 *    or prime, respectively.
 *  ■ The methods equals(int) and equals(MyInteger) that return true if 
 *    the value in this object is equal to the specified value.
 *  ■ A static method parseInt(char[]) that converts an array of numeric 
 *    characters to an int value.
 *  ■ A static method parseInt(String) that converts a string into an int
 *    value.
 * Draw the UML diagram for the class and then implement the class. Write a client 
 * program that tests all methods in the class. 
 * @author Scott M.
 */

public class Exercise_10_3 {
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

class MyInteger
{
    private int value;
    
    /**
     * Construct a new MyInteger object with a specific integer value.
     * @param val int: integer value
     */
    public MyInteger(int val)
    {
        this.value = val;
    }
    
    /**
     * Return the value of the MyInteger object.
     * @return int: integer value
     */
    public int getValue()
    {
        return this.value;
    }
    
    /**
     * Check if the integer value is even.
     * @return boolean: true = value is even, false otherwise
     */
    public boolean isEven()
    {
        return isEven(this.value);
    }
    
    /**
     * Check if a given integer value is even.
     * @param value int: integer value
     * @return boolean: true = value is even, false otherwise
     */
    public static boolean isEven(int value)
    {
        boolean even = false;
        if (value % 2 == 0)
        {
            even = true;
        }
        return even;
    }
    
    /**
     * Check if a given MyInteger object is even.
     * @param i MyInteger: MyInteger object
     * @return boolean: true = value is even, false otherwise
     */
    public static boolean isEven(MyInteger i)
    {
        return isEven(i.value);
    }
    
    /**
     * Check if a this MyInteger is odd.
     * @return boolean: true = value is odd, false otherwise
     */
    public boolean isOdd()
    {
        return !this.isEven();
    }
    
    /**
     * Check if a given integer value is odd.
     * @param value int: given integer value
     * @return boolean: true = value is odd, false otherwise
     */
    public static boolean isOdd(int value)
    {
        return !isEven(value);
    }
    
    /**
     * Check if a given MyInteger object is odd.
     * @param i MyInteger: MyInteger object
     * @return boolean: true = value is odd, false otherwise
     */
    public static boolean isOdd(MyInteger i)
    {
        return !i.isEven();
    }
    
    /**
     * Check if this MyInteger value is prime.
     * @return boolean: true = value is prime, false otherwise
     */
    public boolean isPrime()
    {
        return isPrime(this.value);
    }
    
    /**
     * Check if this MyInteger value is prime.
     * @param value int: integer value
     * @return boolean: true = value is prime, false otherwise
     */
    public static boolean isPrime(int value)
    {
        boolean prime = true;
        for (int i = 2; i <= value / 2; i++)
        {
            if (value % i == 0)
            {
                prime = false;
            }
        }
        return prime;
    }
    
    /**
     * Check if a MyInteger value is prime.
     * @param i MyInteger: MyInteger object
     * @return boolean: true = value is prime, false otherwise
     */
    public static boolean isPrime(MyInteger i)
    {
        return isPrime(i.value);
    }
    
    /**
     * Check if this myInteger is equal to a given integer value
     * @param value int: integer value
     * @return boolean: true = MyInteger is equal to given integer value, false otherwise
     */
    public boolean equals(int value)
    {
        boolean equals = false;
        if (this.value == value)
        {
            equals = true;
        }
        return equals;
    }
    
    /**
     * Check if this myInteger is equal to a given integer value
     * @param MyInteger i: MyInteger object to compare to
     * @return boolean: true = MyInteger is equal to given integer value, false otherwise
     */
    public boolean equals(MyInteger i)
    {
        boolean equals = false;
        if (this.value == i.value)
        {
            equals = true;
        }
        return equals;
    }
    
    /**
     * Return an integer derived from an array of chars.
     * @param c char[]: array of chars
     * @return int: integer derived from array
     */
    public static int parseInt(char[] c)
    {
        int value = 0;
        for (int i = 0; i < c.length; i++)
        {
            value += (c[c.length - 1 - i] - '0') * Math.pow(10, i);
        }
        return value;
    }
    
    /**
     * Return an integer derived from a String
     * @param s String: string containing integer
     * @return int: integer derived from array
     */
    public static int parseInt(String s)
    {
        int value = 0;
        for (int i = 0; i < s.length(); i++)
        {
            value += (s.charAt(s.length() - 1 - i) - '0') * Math.pow(10, i);
        }
        return value;
    }
}