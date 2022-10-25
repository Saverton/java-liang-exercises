/**
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a 
 * class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name, 
 * address, phone number, and email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant. An employee has 
 * an office, salary, and date hired. Use the MyDate class defined in Programming 
 * Exercise 10.14 to create an object for date hired. A faculty member has office 
 * hours and a rank. A staff member has a title. Override the toString method in 
 * each class to display the class name and the person’s name.
 * Draw the UML diagram for the classes and implement them. Write a test program 
 * that creates a Person, Student, Employee, Faculty, and Staff, and 
 * invokes their toString() methods.
 * @author Scott M.
 */

public class Exercise_11_2 {
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

class Person
{
    protected String name, address, phoneNumber, email;
    
    /**
     * Construct a new Person with a specific name, address, phone number, and email address
     * @param name String: full name
     * @param address String: home address
     * @param phoneNumber String: phone number
     * @param email String: email address
     */
    public Person(String name, String address, String phoneNumber, String email)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    /**
     * Return a String with info about this Person formatted as:
     *      Person: <full name>
     * @return String: Person info
     */
    @Override
    public String toString()
    {
        return "Name: " + this.name;
    }
}

class Student extends Person
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
        return super.toString() + "\nStatus: " + this.status;
    }
}

class Employee extends Person
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
        return super.toString() + "\nOffice Number: " + this.officeNumber + "\nSalary: " + this.salary;
    }
}

class Faculty extends Employee
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
        return super.toString() + "\nOffice Hours: " + this.officeHours + "\nRank: " + this.rank;
    }
}

class Staff extends Employee
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
        return super.toString() + "\nTitle: " + this.title;
    }
}