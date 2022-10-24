/**
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop 
 * to display all the elements in the list by invoking the object’s toString()
 * method.
 * @author Scott M.
 */

import java.util.ArrayList;

public class Exercise_11_6
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