/**
 * Class to define the MyInteger object with datafield value; class has behavior
 * to get the value, return whether the value is even, odd, or prime (with params
 * of either an object, another int, or another MyInteger value), to find if it
 * is equal to another int or MyInteger object, and lastly to convert an array of
 * chars and a String of numeric characters to an int value.
 * 
 * @author Scott M.
 * MyInteger.java
 */

public class MyInteger
{
    /**
     * Data field
     */
    private int value;
    
    /**
     * Constructor
     */
    public MyInteger(int val)
    {
        this.value = val;
    }
    
    /**
     * Behaviors
     */
    public int getValue()
    {
        return this.value;
    }
    
    public boolean isEven()
    {
        boolean even = false;
        if (this.value % 2 == 0)
        {
            even = true;
        }
        return even;
    }
    
    public static boolean isEven(int value)
    {
        boolean even = false;
        if (value % 2 == 0)
        {
            even = true;
        }
        return even;
    }
    
    public static boolean isEven(MyInteger i)
    {
        boolean even = false;
        if (i.value % 2 == 0)
        {
            even = true;
        }
        return even;
    }
    
    public boolean isOdd()
    {
        return !this.isEven();
    }
    
    public static boolean isOdd(int value)
    {
        return !isEven(value);
    }
    
    public static boolean isOdd(MyInteger i)
    {
        return !i.isEven();
    }
    
    public boolean isPrime()
    {
        boolean prime = true;
        for (int i = 2; i <= this.value / 2; i++)
        {
            if (this.value % i == 0)
            {
                prime = false;
            }
        }
        return prime;
    }
    
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
    
    public static boolean isPrime(MyInteger i)
    {
        boolean prime = true;
        for (int j = 2; j < i.value / 2; j++)
        {
            if (i.value % j == 0)
            {
                prime = false;
            }
        }
        return prime;
    }
    
    public boolean equals(int value)
    {
        boolean equals = false;
        if (this.value == value)
        {
            equals = true;
        }
        return equals;
    }
    
    public boolean equals(MyInteger i)
    {
        boolean equals = false;
        if (this.value == i.value)
        {
            equals = true;
        }
        return equals;
    }
    
    public static int parseInt(char[] c)
    {
        int value = 0;
        for (int i = 0; i < c.length; i++)
        {
            value += (c[c.length - 1 - i] - '0') * Math.pow(10, i);
        }
        return value;
    }
    
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