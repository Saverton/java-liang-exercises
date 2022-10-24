/**
 * Staff class is a subtype of employee, and has additional data field for its title.
 * 
 * @author Scott M.
 * Staff.java
 */

public class Staff extends Employee
{
    private String title;
    
    /**
     * Construct a new Staff member with a specific name, address, phone number, email, office number, salary, and title.
     * @param name String: full name
     * @param address String: home address
     * @param phoneNumber String: phone number
     * @param email String: email address
     * @param officeNumber int: office number
     * @param salary int: annual salary
     * @param title String: employee's title
     */
    public Staff(String name, String address, String phoneNumber, String email,
                   int officeNumber, int salary, String title)
    {
        super(name, address, phoneNumber, email, officeNumber, salary);
        this.title = title;
    }
    
    /**
     * Return a String with info about the Staff member formatted as:
     *      Staff: <full name>
     * @return String: staff info
     */
    @Override
    public String toString()
    {
        return "Staff: " + this.name;
    }
}