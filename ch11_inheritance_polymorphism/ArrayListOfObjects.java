/**
 * Program to create an ArrayList with a Circle, Loan, String, and Date object, then
 * display the toString() methods for each element.
 * 
 * @author Scott M.
 * ArrayListOfObjects.java
 */

import java.util.ArrayList;

public class ArrayListOfObjects
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        ArrayList<Object> list = new ArrayList<Object>();
        
        list.add(new Loan());
        list.add(new MyDate());
        list.add(new String("Hello World"));
        list.add(new Circle2D());
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}