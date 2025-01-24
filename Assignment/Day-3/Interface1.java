// Problem Statement:
// Design a banking system where:

// There is an abstract class Account that contains common attributes like accountNumber and balance, and abstract methods like deposit and withdraw.
// Specific account types (SavingsAccount, CurrentAccount) inherit from the Account class and implement their specific behavior.
// Use an interface Loanable to define methods like applyLoan and calculateEMI that are implemented by the LoanAccount class.
// Ensure proper encapsulation by making all attributes private and providing appropriate getters and setters.
public class Interface1
{
    public static void main(String[] args) 
    {
        SavingsAccount s1 = new SavingsAccount("1",100);
        s1.deposit(100);
                
    }
}
abstract class Account
{
    private  String accountNumber;
    private  double balance ;
    abstract void deposit(double  amount);
    abstract void withdraw(double  amount);
    void setAccountNumber(String accountNumber)
    {
        this.accountNumber =  accountNumber;
    }
    void setBalance(double balance)
    {
        this.balance = balance ;
    }
    protected  double  getBalance()
    {
        return this.balance;
    }
    protected  String getAccountNumber()
    {
        return this.accountNumber;
    }
}
class SavingsAccount extends Account
{

    public SavingsAccount(String accountNumber , int balance) 
    {
        super.setAccountNumber(accountNumber);
        super.setBalance(balance);
    }
    @Override
    void deposit(double amount)
    {
        double balance = super.getBalance() + amount ;
        super.setBalance(balance);
        System.out.println("Amount Deposited :");
        System.out.println("Account Number : "+ super.getAccountNumber() +  "\nAccount Balance : "+balance);
        System.out.println("Deposited Amount : "+ amount);

    }
    @Override
    void withdraw(double amount)
    {
        double balance = super.getBalance() - amount ;
        super.setBalance(balance);
        System.out.println("Amount Withdrawn :");
        System.out.println("Account Number :"+ super.getAccountNumber() +  "\nAccount Balance : "+balance);
        System.out.println("Withdrawn Amount : "+ amount);

    }
    
    
}