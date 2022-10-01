/**
 * Program to test the stack object.
 * 
 * @author Scott M.
 * TestStack.java
 */

public class TestStack
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        MyStack s1 = new MyStack();
        s1.push("1");
        s1.push("2");
        s1.push("3");
        s1.push("4");
        s1.push("5");

        for (int i = 0; i < s1.size(); )
        {
            System.out.print(s1.pop() + " ");
        }
    }
}