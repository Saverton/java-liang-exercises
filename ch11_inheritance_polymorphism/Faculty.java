/**
 * Faculty class is a subtype of Employee. Faculty has office hours and a rank.
 * 
 * @author Scott M.
 * Faculty.java
 */

public class Faculty extends Employee
{
    private String officeHours;
    private int rank;
    
    /**
     * Construct a new Faculty with a specific name, address, phone number, email, office number, salary, office hours, and rank.
     * @param name String: full name
     * @param address String: home address
     * @param phoneNumber String: phone number
     * @param email String: email address
     * @param officeNumber int: office number
     * @param salary int: annual salary
     * @param officeHours String: office hours
     * @param rank int: faculty rank
     */
    public Faculty(String name, String address, String phoneNumber, String email,
                   int officeNumber, int salary, String officeHours, int rank)
    {
        super(name, address, phoneNumber, email, officeNumber, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    /**
     * Return a String with info about the Faculty formatted as:
     *      Faculty: <full name>
     * @return String: faculty info
     */
    @Override
    public String toString()
    {
        return "Faculty: " + this.name;
    }
}