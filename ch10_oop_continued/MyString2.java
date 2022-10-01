/**
 * Recreation of more java String methods in a MyString2 class.
 * 
 * @author Scott M.
 * MyString2.java
 */

public class MyString2
{
    private String str;
    
    /**
     * Constructor to make a MyString2 object
     * 
     * @params (String to construct the object)
     */
    public MyString2(String s)
    {
        this.str = s;
    }
    
    /**
     * Method to compare two strings, and return an int value relating the
     * first unequal chars in the strings.
     * 
     * @params (String to compare to)
     * @return (integer comparison of chars)
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
     * Method to return a substring from a starting index to the end of the
     * parent String.
     * 
     * @params (starting index)
     * @return (the substring)
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
     * Method to return the string with all letter characters set to upper case.
     * 
     * @return (the string in all Upper Case)
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
     * Method to convert a MyString2 into an array of chars.
     * 
     * @return (array of chars representing the String)
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
     * Method to return a MyString2 object representing a boolean
     * value.
     * 
     * @params (boolean value)
     * @return (String representing boolean)
     */
    public static MyString2 valueOf(boolean b)
    {
        return new MyString2("" + b);
    }
    
    /**
     * Method to split a string into an array of strings along a specified regular expression.
     * 
     * @params (String to be split) (regular expression to split string along, 
     *          single char for 1, format "[<regex1><regex2><etc.>]" for multi)
     * @returns (an array of the splits, includes the regexs)
     */
    public static String[] split(String s, String regex)
    {
        String[] str = new String[s.length()];
        String[] fin;
        int count = 0, lastRegex = -1;
        char[] regexs;
        
        if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']')
        {   
            regexs =  new char[regex.length() - 2];
            for (int i = 1; i < regex.length() - 1; i++)
            {
                regexs[i - 1] = regex.charAt(i);
            }
        }
        else
        {
            regexs = new char[1];
            regexs[0] = regex.charAt(0);
        }
        
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < regexs.length; j++)
            {
                if (s.charAt(i) == regexs[j])
                {
                    if (i - lastRegex > 1)
                    {
                        str[count] = s.substring(lastRegex + 1, i);
                        count++;
                    }
                    str[count] = "" + regexs[j];
                    count++;
                    lastRegex = i;
                    break;
                }
            }
        }
        
        if (s.length() - lastRegex > 0)
        {
            str[count] = s.substring(lastRegex + 1);
            count++;
        }
        
        fin = new String[count];
        
        for (int i = 0; i < fin.length; i++)
        {
            fin[i] = str[i];
        }
        
        return fin;
    }
}