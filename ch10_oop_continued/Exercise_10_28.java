/**
 * (Implement the StringBuilder class) The StringBuilder class is provided 
 * in the Java library. Provide your own implementation for the following methods 
 * (name the new class MyStringBuilder2):
 *      public MyStringBuilder2();
 *      public MyStringBuilder2(char[] chars);
 *      public MyStringBuilder2(String s);
 *      public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 *      public MyStringBuilder2 reverse(); 
 *      public MyStringBuilder2 substring(int begin);
 *      public MyStringBuilder2 toUpperCase();
 */

public class Exercise_10_28 {
    // no test program
}

class MyStringBuilder2 {
    private char[] str;

    /**
     * Construct a default MyStringBuilder2 with no content.
     */
    public MyStringBuilder2() {
        this.str = new char[1];
    }

    /**
     * Construct a MyStringBuilder2 with a given char array.
     * @param chars char[]: char array
     */
    public MyStringBuilder2(char[] chars) {
        this.str = new char[chars.length];
        System.arraycopy(chars, 0, this.str, 0, chars.length);
    }

    /**
     * Construct a new MyStringBuilder2 with a given Java String.
     * @param str String: Java String
     */
    public MyStringBuilder2(String s) {
        this.str = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.str[i] = s.charAt(i);
        }
    }

    /**
     * insert a second MyStringBuilder2 to this MyStringBuilder2 at a specific index and return the reference to this MyStringBuilder2.
     * @param offset int: offset to append 
     * @param s MyStringBuilder2: other MyStringBuilder2
     * @return MyStringBuilder2: reference to this MyStringBuilder2
     */
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] newStr = new char[this.str.length + s.str.length];
        for (int i = 0; i < newStr.length; i++) {
            if (i == offset) {
                for ( ; i < offset + s.str.length; i++) {
                    newStr[i] = s.str[i - offset];
                }
            }
            else {
                newStr[i] = this.str[i];
            }
        }
        this.str = newStr;
        return this;
    }

    /**
     * Reverse this MyStringBuilder2 and return a reference to this MyStringBuilder.
     * @return MyStringBuilder2: reference to this MyStringBuilder2
     */
    public MyStringBuilder2 reverse() {
        for (int i = 0; i < this.str.length / 2; i++) {
            char temp = this.str[i];
            this.str[i] = this.str[this.str.length - (i + 1)];
            this.str[this.str.length - (i + 1)] = temp;
        }
        return this;
    }

    /**
     * Return a MyStringBuilder2 substring of this MyStringBuilder2 from a given start index (inclusive) to the end of the string.
     * @param begin int: starting index
     * @return MyStringBuilder2: substring
     */
    public MyStringBuilder2 substring(int begin) {
        char[] substring = new char[this.str.length - begin];
        for (int i = begin; i < this.str.length; i++) {
            substring[i = begin] = this.str[i];
        }
        this.str = substring;
        return this;
    }

    /**
     * Return a Java String equivalent to this MyStringBuilder2.
     * @return String: Java String
     */
    public String toString() {
        String result = "";
        for (int i = 0; i < this.str.length; i++) {
            result += this.str[i];
        }
        return result;
    }
}