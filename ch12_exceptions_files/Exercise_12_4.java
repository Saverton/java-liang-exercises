/**
 * Class to define a loan object with a Principle, APR, and term data field. Methods
 * will be used to get each data field, refinance with a new APR and term, get
 * interest for one month.
 * 
 * @author Scott M.
 * LoanWithException.java
 */

public class Exercise_12_4 {
    public static void main(String[] args) {
        try {
            Loan l = new Loan(100, -1, 1);
            System.out.print(l);
        } catch(IllegalArgumentException ex) {
            System.out.print("IllegalArgumentException thrown");
        }
    }
}

class Loan
{
    private double principle, apr;
    private int term;
    
    /**
     * Construct a new loan with a principle of $100.0, 1.0% apr, and a term of 1 year.
     */
    public Loan() throws IllegalArgumentException
    {
        this(100.0, 1.0, 1);
    }
    
    /**
     * Construct a new Loan with a specific principle, apr, and term in years. Throws IllegalArgumentException 
     * if loan amount, interest rate, or term is less than or equal to 0.
     * @param principle double: Loan principle
     * @param apr double: annual percent interest
     * @param term int: Loan term
     */
    public Loan(double principle, double apr, int term) throws IllegalArgumentException
    {
        if (principle <= 0 || apr <= 0 || term <= 0) {
            throw new IllegalArgumentException();
        }
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
    public void refinance(double apr, int term) throws IllegalArgumentException
    {
        if (apr <= 0 || term <= 0) {
            throw new IllegalArgumentException();
        }
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
