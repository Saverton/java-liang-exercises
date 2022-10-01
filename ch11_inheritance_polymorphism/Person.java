/**
 * Class to define a person Object with a name, address, phone number, and email
 * address.
 * 
 * @author Scott M.
 * Person.java
 */

public class Person
{
    protected String name, address, phoneNumber, email;
    
    /**
     * Constructor to create a Person with a name, address, phone number,
     * and email.
     * 
     * @params (person's name) (person's address) (person's phone number)
     *         (person's email)
     */
    public Person(String name, String address, String phoneNumber, String email)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    /**
     * Method to return a String representation of this person.
     * 
     * @return (String representing person)
     */
    @Override
    public String toString()
    {
        return "Person: " + this.name;
    }
}