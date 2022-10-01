/**
 * Program to intake a number of banks as well as their loans to one another and use that info to determine what banks are unsafe (below minimum balance).
 * 
 * @author Scott M.
 * BankLoans.java
 */

import java.util.Scanner;

public class BankLoans {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int minBal, banks, totalLoans = 0, numFails;
        double[][] borrowers;
        double[] balances;
        int[] fails;
        
        System.out.print("Enter the number of banks followed by the minimum balance: ");
        banks = kb.nextInt();
        minBal = kb.nextInt();
        borrowers = new double[banks][banks];
        balances = new double[banks];
        fails = new int[banks];
        
        System.out.print("Enter in order for each bank the: bank's balance, number of loans given to other banks," +
                         "\n and pairs for each loan (bank loaned to, loan amount): ");
        for (int i = 0; i < banks; i++) {
            balances[i] += kb.nextDouble();
            int loans = kb.nextInt();
            for (int j = 0; j < loans;  j++) {
                borrowers[i][kb.nextInt()] = kb.nextDouble();
            }
        }
        
        //add balance from loans
        for (int i = 0; i < banks; i++) {
            balances[i] += Functions.sumRowDouble(borrowers, i);
        }
        
        //check bank balances
        do {
            numFails = 0;
            for (int i = 0; i < banks; i++) {
                if (balances[i] < minBal) {
                    if (fails[i] == 0) {
                        numFails++;
                    }
                    fails[i]++;
                }
            }
            
            //check new balance after fails.
            for (int i = 0; i < banks; i++) {
                if (fails[i] == 1) {
                    for (int j = 0; j < banks; j++) {
                        balances[j] -= borrowers[j][i];
                    }
                }
            }
        } while (numFails != 0);
        
        System.out.print("Unsafe banks are: ");
        for (int i = 0; i < banks; i++) {
            if (fails[i] != 0) {
                System.out.print(i + " ");
            }
        }
    }
}