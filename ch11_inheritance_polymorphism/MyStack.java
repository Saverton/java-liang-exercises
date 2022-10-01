/**
 * A new implementation of the MyStack class that inherits from the ArrayList class.
 * 
 * @author Scott M.
 * MyStack.java
 */

import java.util.ArrayList;

public class MyStack extends ArrayList
{
    private ArrayList<Object> list;
    
    /**
     * Construct an empty stack of an object type.
     */
    public MyStack()
    {
        list = new ArrayList<Object>();
    }
    
    /**
     * Method to push a new value to the stack.
     * 
     * @params (the object to push)
     */
    public void push(Object o)
    {
        list.add(o);
    }
    
    /**
     * Method to peek at the top object of the stack.
     * 
     * @return (top object)
     */
    public Object peek()
    {
        return (list.get(list.size() - 1));
    }
    
    /**
     * Method to return and then remove the top object.
     * 
     * @return (top object)
     */
    public Object pop()
    {
        if (list.size() > 0)
        {
            Object temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return (temp);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Method to get the size of the stack.
     * 
     * @return (stack size)
     */
    public int size()
    {
        return (list.size());
    }
}