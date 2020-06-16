/**
 * Write a description of class BankAccountTester here.
 *
 * @author Bhavya Gupta
 * @version 09/18/2019
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAcct myAcc = new BankAcct(200.0);
        
        // current balance
        System.out.println("Expected Balance: 200.0");
        System.out.println("Actual Balance: " + myAcc.getBalance());
        
        // depositing money
        myAcc.deposit(50);
        System.out.println("Expected Balance: 250.0");
        System.out.println("Actual Balance: " + myAcc.getBalance());
        
        // withdrawing money
        myAcc.withdraw(100);
        System.out.println("Expected Balance: 150.0");
        System.out.println("Actual Balance: " + myAcc.getBalance());
        
        // getting interest on the money
        myAcc.addInterest(.05);
        System.out.println("Expected Balance: 157.5");
        System.out.println("Actual Balance: " + myAcc.getBalance());
    }
}
