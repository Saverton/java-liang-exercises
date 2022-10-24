/**
 * Class to represent an Employee as a subtype of a Person object. Contains
 * additional datafields for the employee's office, salary, and date hired
 * (an instance of the MyDate class).
 * 
 * @author Scott M.
 * Employee.java
 */

public class Employee extends Person
{
    protected int officeNumber, salary;
    protected MyDate dateHired;
    
    /**
     * Construct a new Employee with a specific nama, address, phone number, email, office number, and salary.
     * @param name String: full name
     * @param address String: home address
     * @param phoneNumber String: phone number
     * @param email String: email address
     * @param officeNumber int: office number address
     * @param salary int: annual salary
     */
    public Employee(String name, String address, String phoneNumber, String email,
                    int officeNumber, int salary)
    {
        super(name, address, phoneNumber, email);
        this.officeNumber = officeNumber;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    
    /**
     * Return a String with info about the employee formatted as:
     *      Employee: <full name>
     * @return String: employee info
     */
    @Override
    public String toString()
    {
        return "Employee: " + this.name;
    }
}