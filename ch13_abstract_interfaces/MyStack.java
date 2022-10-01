/**
 * A new implementation of the MyStack class that inherits from the ArrayList class.
 * 
 * @author Scott M.
 * MyStack.java
 */

import java.util.ArrayList;
import java.util.List;

public class MyStack<E>
{
    List<E> stack = new ArrayList<E>();
    
    /**
     * Method to push a new value to the stack.
     * 
     * @params (the object to push)
     */
    public void push(E o)
    {
        stack.add(o);
    }
    
    /**
     * Method to peek at the top object of the stack.
     * 
     * @return (top object)
     */
    public E peek()
    {
        return (stack.get(stack.size() - 1));
    }
    
    /**
     * Method to return and then remove the top object.
     * 
     * @return (top object)
     */
    public E pop()
    {
        if (stack.size() > 0)
        {
            E temp = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return (temp);
        }
        return null;
    }
    
    /** Return the size of the stack.
     * 
     * @return size of stack
     */
    public int size() {
        return (stack.size());
    }
}