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
     * Constructor to create an Employee with a specified name, address, phoneNumber,
     * email, office, and salary, hired on today's date.
     * 
     * @params (Employee name, Employee address, Employee phone number, Employee email
     *          Employee's office number, Employee's salary)
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
     * Overridden toString() method to return a String representation of the Employee.
     * 
     * @return (String representing the Employee)
     */
    @Override
    public String toString()
    {
        return "Employee: " + this.name;
    }
}