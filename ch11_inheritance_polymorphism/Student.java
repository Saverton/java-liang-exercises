/**
 * Class to define a Student object as a subtype of a Person. Contains datafield
 * representing the class status (freshman, sophomore, etc.).
 * 
 * @author Scott M.
 * Student.java
 */

public class Student extends Person
{
    private String status;
    
    /**
     * Construct a new Student with a specific name, address, phone number, email, and class status
     * @param name String: full name
     * @param address String: home address
     * @param phoneNumber String: phone number
     * @param email String: email address
     * @param status String: class status
     */
    public Student(String name, String address, String phoneNumber, String email, String status)
    {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    
    /**
     * Return a String with info about the Student formatted as:
     *      Student: <full name>
     * @return (String representing Student)
     */
    @Override
    public String toString()
    {
        return "Student: " + this.name;
    }
}