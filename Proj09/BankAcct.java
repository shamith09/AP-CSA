
/**
* A bank account that has a balance that can be changed by deposits, 
* withdrawals, and simple interest.
*
* @author Bhavya Gupta
* @version 09/17/19
*/
public class BankAcct
{ 
    // FIELDS
    private double balance;
    private int lastAcctID;
    private int acctID;
    
    // CONSTRUCTORS
    /**
     * Constructs a bank account with a given balance. 
     * @param initBal the initial balance
     */
    public BankAcct(double initBal) {
        balance = initBal;
        acctID = lastAcctID + 1;
        lastAcctID += 1;
    }
    
    /**
     * Constructs a bank account with zero balance. 
     */
    public BankAcct() {
        balance = 0;
    }
    
    // METHODS
    /**
     * Deposits the specified amount into the account.
     * @param amt the amount to deposit
     */
    public void deposit(double amt) {
        balance += amt;
    }
    
    /**
     * Withdraws the specified amount from the account.
     * @param amt the amount to withdraw
     */
    public void withdraw(double amt) {
        balance -= amt;
    }
    
    /**
     * Returns the balance in the account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Adds rate interest to the account. 
     * @param rate the interest rate
     */
    public void addInterest(double rate) {
        balance *= rate + 1;
    }
}
