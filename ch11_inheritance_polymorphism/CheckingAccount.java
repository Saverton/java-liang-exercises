/**
 * Checking account class with a 10% overdraft ability based on the current balance.
 * Inherits from Account.java.
 * 
 * @author Scott M.
 * CheckingAccount.java
 */

public class CheckingAccount extends Account
{
    /**
     * Construct a Checking Account with a specific account id and initial balance
     * @param id int: account id
     * @params initialBalance double: account balance
     */
    public CheckingAccount(int id, double initialBalance)
    {
        super(id, initialBalance);
    }
    
    /**
     * Withdraw a specific amount from the Checking Account, if the withdrawal exceeds the balance try overdrafting and print a message with the status of the overdraft.
     * @param withdrawal double: withdrawal amount
     */
    @Override
    public void withdraw(double withdrawal)
    {
        if (super.getBalance() > withdrawal)
        {
            super.withdraw(withdrawal);
        }
        else if (Math.abs(super.getBalance() - withdrawal) < super.getBalance() / 10)
        {
            System.out.println("Insufficient funds, account overdrafted.");
            super.withdraw(withdrawal);
        }
        else
        {
            System.out.println("Insufficient funds, exceeds maximum overdraft.");
            super.withdraw(super.getBalance() + super.getBalance() / 10);
        }
    }
}