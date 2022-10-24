/**
 * (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented 
 * using composition. Define a new stack class that extends ArrayList.
 * Draw the UML diagram for the classes and then implement MyStack. Write 
 * a test program that prompts the user to enter five strings and displays them in 
 * reverse order.
 * @author Scott M.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_10 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        MyStack s = new MyStack();
        System.out.println("Enter 5 Strings:");
        for (int i = 0; i < 5; i++) {
            s.push(kb.next());
        }
        kb.close();
        System.out.println("Reverse Order:");
        for (int i = 0; i < 5; i++) {
            System.out.print(s.pop() + " ");
        }
    }
}

class MyStack extends ArrayList<Object>
{
    private ArrayList<Object> list;
    
    /**
     * Construct an empty stack of Objects.
     */
    public MyStack()
    {
        list = new ArrayList<Object>();
    }
    
    /**
     * Push a new Object into the stack.
     * @param o Object: any object
     */
    public void push(Object o)
    {
        list.add(o);
    }
    
    /**
     * Return the top object in the stack without removing it.
     * @return Object: top object
     */
    public Object peek()
    {
        return (list.get(list.size() - 1));
    }
    
    /**
     * Return the top object in the stack and remove it from the stack.
     * @return Object: top object
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
     * Return the size of the stack.
     * @return int: size of stack
     */
    public int size()
    {
        return (list.size());
    }
}