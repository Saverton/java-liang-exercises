/**
 * Class to define a Student object as a subtype of a Person. Contains datafield
 * representing the class status (freshman, sophomore, etc.).
 * 
 * @author Scott M.
 * Student.java
 */

public class Student extends Person
{
    private final String status;
    
    /**
     * Constructor to make a Student object with parameters for the Person supertype.
     * 
     * @params
     */
    public Student(String name, String address, String phoneNumber, String email,
                    String status)
    {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    
    /**
     * Overridden toString method to return a String representation of the Student.
     * 
     * @return (String representing Student)
     */
    @Override
    public String toString()
    {
        return "Student: " + this.name;
    }
}