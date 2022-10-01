/**
 * Program to test the Account2 class.
 * 
 * @author Scott M.
 * Account2Test.java
 */

public class Account2Test
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Account2 a1 = new Account2(1122, 1000.0, "George");
        a1.setAnnualInterestRate(0.015);
        
        a1.deposit(30.0, "");
        a1.deposit(40.0, "Paycheck");
        a1.deposit(50.0, "");
        a1.withdraw(5.0, "");
        a1.withdraw(4.0, "cake :)");
        a1.withdraw(3.0, "cookie");
        
        System.out.print(a1);
    }
}