/**
 * (Implement the Character class) The Character class is provided in the Java 
 * library. Provide your own implementation for this class. Name the new class 
 * MyCharacter.
 * @author Scott M.
 */

public class Exercise_10_24 {
    // no test method
}

class MyCharacter
{
    private char c;
    
    /**
     * Construct a new MyCharacter given a primitive char.
     * @param c char: character
     */
    public MyCharacter(char c)
    {
        this.c = c;
    }
    
    /**
     * Construct a default char object equivalent to ''.
     */
    public MyCharacter()
    {
        this((char)0);
    }
    
    /**
     * Return the char represented by this MyCharacter object.
     * @return char: character
     */
    public char getChar()
    {
        return this.c;
    }
    
    /**
     * Set the character that this MyCharacter object holds.
     * @param c char: character
     */
    public void setChar(char c)
    {
        this.c = c;
    }
    
    /**
     * Return the ASCII code of this char.
     * @return int: ASCII code
     */
    public int getInt()
    {
        return (int)this.c;
    }
    
    /**
     * Check if Character is uppercase.
     * @return boolean: true = character is uppercase, false otherwise.
     */
    public boolean isUpperCase()
    {
        return this.c >= 'A' && this.c <= 'Z';
    }
    
    /**
     * Check if Character is lowercase.
     * @return boolean: true = character is lowercase, false otherwise.
     */
    public boolean isLowerCase()
    {
        return this.c >= 'a' && this.c <= 'z';
    }
    
    /**
     * Check if Character is a Digit.
     * @return boolean: true = character is digit, false otherwise
     */
    public boolean isDigit()
    {
        return this.c >= '0' && this.c <= '9';
    }
    
    /**
     * Check if Character is a letter.
     * @return boolean: true = character is letter, false otherwise
     */
    public boolean isLetter()
    {
        return this.c >= 'A' && this.c <= 'z';
    }
    
    /**
     * Convert Character to uppercase.
     */
    public void toUpperCase()
    {
        if (this.isLowerCase())
        {
            this.setChar((char)(this.getChar() - 26));
        }
    }
    
    /**
     * Convert this character to lowercase.
     */
    public void toLowerCase()
    {
        if (this.isUpperCase())
        {
            this.setChar((char)(this.getChar() + 26));
        }
    }
    
    /**
     * Return the integer that this character represents. if it is not a digit, return -1.
     * @return int: integer
     */
    public int toInt()
    {
        if (this.isDigit())
        {
            return (this.getInt() - '0');
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * Set char to digit equivalent to single digit integer.
     * @param i int: single digit integer
     */
    public void setValueOf(int i)
    {
        if (i >= 0 && i <= 9)
        {
            this.setChar((char)('0' + i));
        }
    }
}