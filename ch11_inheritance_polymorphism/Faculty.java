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
     * Constructor to create a Faculty member with a specified name, address, phone
     * number, email, office number, salary, office hours, and rank, hired on today's
     * date.
     * 
     * @params (faculty name, faculty address, faculty phone number, faculty email,
     *          faculty office number, faculty salary, faculty office hours, faculty
     *          rank)
     */
    public Faculty(String name, String address, String phoneNumber, String email,
                   int officeNumber, int salary, String officeHours, int rank)
    {
        super(name, address, phoneNumber, email, officeNumber, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    /**
     * Overridden toString() method to return a String representing a Faculty member.
     * 
     * @return (String representing Faculty Member)
     */
    @Override
    public String toString()
    {
        return "Faculty: " + this.name;
    }
}