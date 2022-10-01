/**
 * Program to create a Savings Account that inherits from the Account class.
 * 
 * 
 * @author Scott M.
 * SavingsAccount.java
 */

public class SavingsAccount extends Account
{
    /**
     * Constructer to call the Account constructor.
     * 
     * @params (Accound ID, initial balance)
     */
    public SavingsAccount(int id, double initialBalance)
    {
        super(id, initialBalance);
    }
    
    /**
     * Overrided withdraw method that does not withdraw funds beyond the account's
     * contents.
     * 
     * @params (amount to withdraw)
     */
    @Override
    public void withdraw(double withdrawal)
    {
        if (super.getBalance() > withdrawal)
        {
            super.withdraw(withdrawal);
        }
        else
        {
            System.out.println("Insufficient funds, max withdrawn");
            super.withdraw(super.getBalance());
        }
    }
}