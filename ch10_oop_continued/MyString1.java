/**
 * My version of the Java String class, implemented all by me! (wow)
 * 
 * @author Scott M.
 * MyString1.java
 */

public class MyString1
{
    private char[] myString;
    
    /**
     * Constructor to make an array of chars to represent a string.
     * 
     * @params (array of chars to craft a string from)
     */
    public MyString1(char[] chars)
    {
        this.myString = new char[chars.length];
        System.arraycopy(chars, 0, this.myString, 0, chars.length);
    }
    
    /**
     * Method to return the char at a specific index of the string.
     * 
     * @params (the index of the string to be searched)
     * @return (the char at that index, '' if no index found)
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
     * Method to return the length of the MyString1 object.
     * 
     * @return (the length of the String)
     */
    public int length()
    {
        return this.myString.length;
    }
    
    /**
     * Method to return a substring of a MyString1 object in the form
     * of another MyString1.
     * 
     * @params (the start index) (the end index)
     * @return (the substring)
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
     * Method to convert the entire String to lowercase.
     * 
     * @return (the MyString1 object in all lowercase)
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
     * Method to check if this MyString1 object equals another MyString1.
     * 
     * @params (the other MyString1 object)
     * @return (true: this MyString1 and MyString1 s are equal, false: this MyString1 and Mystring1
     *          s aren't equal)
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
     * Method to return a MyString1 object representing an int param.
     * 
     * @params (the int value to be Stringed)
     * @return (the MyString1 object)
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
     * Method to return a MyString1 object as an actual String.
     * 
     * @return (String form of char[])
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