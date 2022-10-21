/**
 * (Implement the StringBuilder class) The StringBuilder class is provided 
 * in the Java library. Provide your own implementation for the following methods 
 * (name the new class MyStringBuilder1):
 *      public MyStringBuilder1(String s);
 *      public MyStringBuilder1 append(MyStringBuilder1 s);
 *      public MyStringBuilder1 append(int i);
 *      public int length();
 *      public char charAt(int index);
 *      public MyStringBuilder1 toLowerCase();
 *      public MyStringBuilder1 substring(int begin, int end);
 *      public String toString();
 */

public class Exercise_10_27 {
    // no test program
}

class MyStringBuilder1 {
    private String str;

    /**
     * Construct a new MyStringBuilder1 with a given Java String.
     * @param str String: Java String
     */
    public MyStringBuilder1(String str) {
        this.str = str;
    }

    /**
     * Append a second MyStringBuilder1 to this MyStringBuilder1 and return the reference to this MyStringBuilder1.
     * @param s MyStringBuilder1: other MyStringBuilder1
     * @return MyStringBuilder1: reference to this MyStringBuilder1
     */
    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.str += s.toString();
        return this;
    }

    /**
     * Append a primitive Integer as a String onto this MyStringBuilder1 and return a reference to this MyStringBuilder1.
     * @param i int: integer value
     * @return MyStringBuilder1: reference to this MyStringBuilder1
     */
    public MyStringBuilder1 append(int i) {
        this.str += Integer.toString(i);
        return this;
    }

    /**
     * Return the length of this MyStringBuilder1.
     * @return int: length of MyStringBuilder1
     */
    public int length() {
        return this.str.length();
    }

    /**
     * Return the char at a given index of this MyStringBuilder1.
     * @param index int: index inside MyStringBuilder1
     */
    public char charAt(int index) {
        return this.str.charAt(index);
    }

    /**
     * Convert this MyStringBuilder to all lowercase and return a reference to this MyStringBuilder1.
     * @return MyStringBuilder1: reference to this MyStringBuilder1
     */
    public MyStringBuilder1 toLowerCase() {
        this.str = this.str.toLowerCase();
        return this;
    }

    /**
     * Return a MyStringBuilder1 substring of this MyStringBuilder1 from a given start index (inclusive) to a given stop index (non-inclusive).
     * @param begin int: starting index
     * @param end int: ending index
     * @return MyStringBuilder1: substring
     */
    public MyStringBuilder1 substring(int begin, int end) {
        return (new MyStringBuilder1(this.str.substring(begin, end)));
    }

    /**
     * Return a Java String equivalent to this MyStringBuilder1.
     * @return String: Java String
     */
    public String toString() {
        return this.str;
    }
}