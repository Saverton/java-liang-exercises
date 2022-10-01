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
     * Constructor to create a staff member with a specified name, address, phone
     * number, email, office number, salary, and title, hired on today's
     * date.
     * 
     * @params (staff name, staff address, staff phone number, staff email,
     *          staff office number, staff salary, staff office hours, staff
     *          rank)
     */
    public Staff(String name, String address, String phoneNumber, String email,
                   int officeNumber, int salary, String title)
    {
        super(name, address, phoneNumber, email, officeNumber, salary);
        this.title = title;
    }
    
    /**
     * Overridden toString() method to return a String representing a Staff member.
     * 
     * @return (String representing Staff Member)
     */
    @Override
    public String toString()
    {
        return "Staff: " + this.name;
    }
}