/**
 * Class to define a loan object with a Principle, APR, and term data field. Methods
 * will be used to get each data field, refinance with a new APR and term, get
 * interest for one month.
 * 
 * @author Scott M.
 * LoanWithException.java
 */

public class LoanWithException {
    private double principle, apr;
    private int term;
    
    /**
     * Constructor to make a default Loan for $1000, APR 1.0%, and term of 1 year.
     */
    public LoanWithException() {
        this(1000.0, 1.0, 1);
    }
    
    /**
     * Constructor to make a Loan with a specified principle, apr, and term.
     * 
     * @params (the amount of money borrowed, the annual percentage interest rate,
     *          the term of the Loan)
     */
    public LoanWithException(double principle, double apr, int term) throws IllegalArgumentException {
        if (principle <= 0 || apr <= 0 || term <= 0) {
            throw new IllegalArgumentException();
        }
        this.principle = principle;
        this.apr = apr;
        this.term = term;
    }
    
    /**
     * Method to get the amount of money borrowed (principle)
     * 
     * @return (principle)
     */
    public double getPrinciple() {
        return (principle);
    }
    
    /**
     * Method to get the apr of the loan (not as a decimal, but as a number with
     * a decimal end, i.e. 0.345 => 34.5)
     * 
     * @return (annual percent interest)
     */
    public double getAPR() {
        return (apr * 100);
    }
    
    /**
     * Method to get the term of the loan.
     * 
     * @return (term (years))
     */
    public int getTerm() {
        return (term);
    }
    
    /**
     * Method to refinance the loan (i.e. set new apr and term)
     * 
     * @params (new annual percent interest, new term)
     */
    public void refinance(double apr, int term) throws IllegalArgumentException {
        if (apr <= 0 || term <= 0) {
            throw new IllegalArgumentException();
        }
        this.apr = apr;
        this.term = term;
    }
    
    /**
     * Method to get the monthly interest on the loan.
     * 
     * @return (monthly interest)
     */
    public double getMonthlyInterest() {
        return apr / 12;
    }
    
    /**
     * Method to get the amount of money owed in a month on this loan. Assumes that
     * each payment covers equal amounts of principle and interest.
     * 
     * @return (amount of $ owed for 1 month)
     */
    public double getMonthlyPayment() {
        return (principle * Math.pow(apr, term)) / (term * 12);
    }
    
    /**
     * Method to return an identifying String with aspects of the Loan.
     * 
     * @return (String representing the Loan)
     */
    public String toString() {
        return "principle: " + String.format("$%4.2f", principle) + "\nAPR: " +
                String.format("%4.2f%%", apr) + "\nterm: " + term + " year(s)";
    }
}
