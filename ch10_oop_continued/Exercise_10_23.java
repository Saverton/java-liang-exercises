/**
 * (Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new 
 * class MyString2):
 *      public MyString2(String s);
 *      public int compare(String s);
 *      public MyString2 substring(int begin);
 *      public MyString2 toUpperCase();
 *      public char[] toChars();
 *      public static MyString2 valueOf(boolean b);
 * @author Scott M.
 */

public class Exercise_10_23 {
    
}

class MyString2
{
    private String str;
    
    /**
     * Construct a new MyString2 given a Java String
     * @param s String: Java String
     */
    public MyString2(String s)
    {
        this.str = s;
    }
    
    /**
     * Return an integer value comparing this MyString with another Java String. -1 = less than, 0 = equal to, 1 = greater than.
     * @param s String: Java String
     * @return int: comparison
     */
    public int compare(String s)
    {
        int comparison = 0;
        
        for (int i = 0; i < Math.min(this.str.length(), s.length()); i++)
        {
            if (this.str.charAt(i) != s.charAt(i))
            {
                comparison = this.str.charAt(i) - s.charAt(i);
            }
        }
        
        if (comparison == 0)
        {
             if (this.str.length() > s.length())
            {
                comparison = (int)(this.str.charAt(s.length()));
            }
            else if (this.str.length() < s.length())
            {
                comparison = (int)(s.charAt(this.str.length()) * -1);
            }
        }
       
        return comparison;
    }
    
    /**
     * Return a substring from a starting index to the end of the string.
     * @param start int: start index
     * @return MyString2: substring
     */
    public MyString2 substring(int start)
    {
        String temp = "";
        
        if (start < this.str.length())
        {
            for (int i = start; i < this.str.length(); i++)
            {
                temp += this.str.charAt(i);
            }
        }
        
        return new MyString2(temp);
    }
    
    /**
     * Return an upper case version of this MyString2.
     * @return MyString2: uppercase String
     */
    public MyString2 toUpperCase()
    {
        String temp = "";
        
        for (int i = 0; i < this.str.length(); i++)
        {
            if (Character.isLetter(this.str.charAt(i)))
            {
                temp += Character.toUpperCase(this.str.charAt(i));
            }
            else
            {
                temp += this.str.charAt(i);
            }
        }
        
        return new MyString2(temp);
    }
    
    /**
     * Return a char array equivalent to this String.
     * @return char[]: char array
     */
    public char[] toChars()
    {
        char[] chars = new char[this.str.length()];
        
        for (int i = 0; i < chars.length; i++)
        {
            chars[i] = this.str.charAt(i);
        }
        
        return chars;
    }
    
    /**
     * Return a MyString2 representing a boolean value
     * @params b boolean: boolean value
     * @return MyString2: boolean String
     */
    public static MyString2 valueOf(boolean b)
    {
        return new MyString2("" + b);
    }
}