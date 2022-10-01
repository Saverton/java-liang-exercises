/**
 * Program to test the Person object and its subclasses.
 * 
 * @author Scott M.
 * PersonTest.java
 */

public class PersonTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Person p1 = new Person("Jake Hohner", "300 South St.", "610-444-4444", "jrh484@gmail.com");
        Person p2 = new Student("Jake Hohner", "300 South St.", "610-444-4444", "jrh484@gmail.com", "Senior");
        Person p3 = new Employee("Jake Hohner", "300 South St.", "610-444-4444", "jrh484@gmail.com", 35, 50000);
        Person p4 = new Faculty("Jake Hohner", "300 South St.", "610-444-4444", "jrh484@gmail.com", 35, 50000, "9am-5pm", 14);
        Person p5 = new Staff("Jake Hohner", "300 South St.", "610-444-4444", "jrh484@gmail.com", 35, 50000, "Master");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}