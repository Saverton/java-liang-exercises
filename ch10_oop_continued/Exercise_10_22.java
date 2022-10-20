/**
 * (Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new 
 * class MyString1):
 *      public MyString1(char[] chars);
 *      public char charAt(int index);
 *      public int length();
 *      public MyString1 substring(int begin, int end);
 *      public MyString1 toLowerCase();
 *      public boolean equals(MyString1 s);
 *      public static MyString1 valueOf(int i);
 * @author Scott M.
 */

public class Exercise_10_22 {
    // no test method
}

class MyString1
{
    private char[] myString;
    
    /**
     * Construct a new MyString object given an array of chars.
     * @param chars char[]: char array
     */
    public MyString1(char[] chars)
    {
        this.myString = new char[chars.length];
        System.arraycopy(chars, 0, this.myString, 0, chars.length);
    }
    
    /**
     * Return the character at a specific index of the MyString.
     * @param index int: index of String
     * @return char: char at index, '' if index out of bounds
     */
    public char charAt(int index)
    {
        if (index < 0 || index >= this.myString.length)
        {
            return (char)0;
        }
        else
        {
            return this.myString[index];
        }
    }
    
    /**
     * Return the length of the MyString.
     * @return int: length of MyString
     */
    public int length()
    {
        return this.myString.length;
    }
    
    /**
     * Return a substring MyString from a start index (inclusive) to an end index (non-inclusive).
     * @param start int: start index
     * @param end int: end index
     * @return MyString1: substring
     */
    public MyString1 substring(int start, int end)
    {
        if (end <= start || start >= this.length() || end < 0)
        {
            return null;
        }
        else
        {
            char[] temp = new char[end - start];
            for (int i = 0; i < temp.length; i++)
            {
                temp[i] = this.myString[i + start];
            }
            return new MyString1(temp);
        }
    }
    
    /**
     * Return an all lowercase version of this MyString.
     * @return MyString1: lowercase MyString
     */
    public MyString1 toLowerCase()
    {
        char[] temp = new char[this.length()];
        System.arraycopy(this.myString, 0, temp, 0, this.length());
        for (int i = 0; i < temp.length; i++)
        {
            if (Character.isUpperCase(temp[i]))
            {
                temp[i] = (char)(temp[i] + 26);
            }
        }
        return new MyString1(temp);
    }
    
    /**
     * Check if this MyString1 is equal to another MyString1 object.
     * @param s MyString1: other String
     * @return boolean: true = two MyString1s are equal, false otherwise
     */
    public boolean equals(MyString1 s)
    {
        boolean equals = true;
        if (this.length() != s.length())
        {
            equals = false;
        }
        else
        {
            for (int i = 0; equals && i < this.length(); i++)
            {
                if (this.charAt(i) != s.charAt(i))
                {
                    equals = false;
                }
            }
        }
        return equals;
    }
    
    /**
     * Return a MyString1 Object given an integer value.
     * @param i int: integer
     * @return MyString1: integer string
     */
    public static MyString1 valueOf(int i)
    {
        char[] myString = new char[50];
        int length = 0;
        
        for (int j = 0; i > 0; j++)
        {
            myString[j] = (char)((i % 10) + '0');
            i /= 10;
            length++;
        }
        
        char[] temp = new char[length];
        
        for (int j = length; j >= 0; j--)
        {
            if (Character.isDigit(myString[j]))
            {
                temp[(length - 1) - j] = myString[j];
            }
        }
        
        return new MyString1(temp);
    }
    
    /**
     * Return a normal Java String equivalent of this MyString1 object.
     * @return String: String equivalent to MyString1
     */
    public String toString()
    {
        String str = "";
        
        for (int i = 0; i < this.length(); i++)
        {
            str += this.myString[i];
        }
        
        return str;
    }
}