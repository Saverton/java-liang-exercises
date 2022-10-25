/**
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop 
 * to display all the elements in the list by invoking the object’s toString()
 * method.
 * @author Scott M.
 */

import java.util.ArrayList;

public class Exercise_11_6
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        ArrayList<Object> list = new ArrayList<Object>();
        
        list.add(new Loan());
        list.add(new MyDate());
        list.add(new String("Hello World"));
        list.add(new Circle2D());
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}

class Loan
{
    private double principle, apr;
    private int term;
    
    /**
     * Construct a new loan with a principle of 0.0, 1.0% apr, and a term of 1 year.
     */
    public Loan()
    {
        this(0.0, 1.0, 1);
    }
    
    /**
     * Construct a new Loan with a specific principle, apr, and term in years.
     * @param principle double: Loan principle
     * @param apr double: annual percent interest
     * @param term int: Loan term
     */
    public Loan(double principle, double apr, int term)
    {
        this.principle = principle;
        this.apr = apr;
        this.term = term;
    }
    
    /**
     * Return the Loan principle.
     * @return double: loan principle
     */
    public double getPrinciple()
    {
        return (principle);
    }
    
    /**
     * Return the annual percent interest of the Loan.
     * @return double: annual percent interest
     */
    public double getAPR()
    {
        return (apr * 100);
    }
    
    /**
     * Return the term of the Loan.
     * @return int: term of loan
     */
    public int getTerm()
    {
        return (term);
    }
    
    /**
     * Refinance the Loan by declaring a new APR and term (in years).
     * @param apr double: annual percent interest
     * @param term int: term of loan
     */
    public void refinance(double apr, int term)
    {
        this.apr = apr;
        this.term = term;
    }
    
    /**
     * Return the monthly interest rate of the loan.
     * @return double: monthly interest rate
     */
    public double getMonthlyInterest()
    {
        return apr / 12;
    }
    
    /**
     * Return the monthly payment owed in 1 month.
     * @return double: monthly payment
     */
    public double getMonthlyPayment()
    {
        return (principle * Math.pow(apr, term)) / (term * 12);
    }
    
    /**
     * Return a String with information about the loan formatted as:
     *      principle: $<principle>
     *      APR: <apr>%
     *      term: <term> year(s)
     * @return String: Loan info
     */
    public String toString()
    {
        return "principle: " + String.format("$%4.2f", principle) + "\nAPR: " +
                String.format("%4.2f%%", apr) + "\nterm: " + term + " year(s)";
    }
}