/**
 * (New string split method) The split method in the String class returns an 
 * array of strings consisting of the substrings split by the delimiters. However, the 
 * delimiters are not returned. Implement the following new method that returns 
 * an array of strings consisting of the substrings split by the matching delimiters, 
 * including the matching delimiters.
 *      public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an 
 * array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 * #, and e in an array of String.
 * @author Scott M.
 */

public class Exercise_10_25 {
    /**
     * Return an array of Java Strings taken from a parent string split by a specific regular expression.
     * @param s String: Parent string
     * @param regex String: regular expression
     * @return String[]: Array of split strings
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