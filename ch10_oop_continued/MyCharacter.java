/**
 * My own implementation of the Character class. Has methods to
 * check and set letter case, get int value, check for digit/letter,
 * and convert between a 1 digit int and the chars for numbers.
 * 
 * @author Scott M.
 * MyCharacter.java
 */

public class MyCharacter
{
    private char c;
    
    /**
     * Constructor to create a char object.
     * 
     * @params (the char to set to this object)
     */
    public MyCharacter(char c)
    {
        this.c = c;
    }
    
    /**
     * Constructor to create a default char object.
     */
    public MyCharacter()
    {
        this((char)0);
    }
    
    /**
     * Method to return the char.
     * 
     * @return (the character this object holds)
     */
    public char getChar()
    {
        return this.c;
    }
    
    /**
     * Method to set the char this object references.
     * 
     * @params (the new char)
     */
    public void setChar(char c)
    {
        this.c = c;
    }
    
    /**
     * Method to get the int value of this char.
     * 
     * @return (int value for this char)
     */
    public int getInt()
    {
        return (int)this.c;
    }
    
    /**
     * Method to check if the char is uppercase.
     * 
     * @return (true: is uppercase, false: is not uppercase)
     */
    public boolean isUpperCase()
    {
        return this.c >= 'A' && this.c <= 'Z';
    }
    
    /**
     * Method to check if the char is lowercase.
     * 
     * @return (true: is lowercase, false: is not lowercase)
     */
    public boolean isLowerCase()
    {
        return this.c >= 'a' && this.c <= 'z';
    }
    
    /**
     * Method to check if the char is a digit.
     * 
     * @return (true: is digit, false: is not digit)
     */
    public boolean isDigit()
    {
        return this.c >= '0' && this.c <= '9';
    }
    
    /**
     * Method to check if the char is a letter.
     * 
     * @return (true: is letter, false: is not letter)
     */
    public boolean isLetter()
    {
        return this.c >= 'A' && this.c <= 'z';
    }
    
    /**
     * Method to convert this char to uppercase.
     */
    public void toUpperCase()
    {
        if (this.isLowerCase())
        {
            this.setChar((char)(this.getChar() - 26));
        }
    }
    
    /**
     * Method to convert this char to lowercase.
     */
    public void toLowerCase()
    {
        if (this.isUpperCase())
        {
            this.setChar((char)(this.getChar() + 26));
        }
    }
    
    /**
     * Method to return an int from 0 to 9 representing this char
     * if it represents a digit, else, it returns -1.
     * 
     * @return (integer version of char)
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
     * Method to set this MyCharacter object to a char representing an
     * integer from 0 to that is entered. else, no change.
     * 
     * @params (the integer to be made into a char)
     */
    public void setValueOf(int i)
    {
        if (i >= 0 && i <= 9)
        {
            this.setChar((char)('0' + i));
        }
    }
}