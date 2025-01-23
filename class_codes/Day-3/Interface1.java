public class Interface1
{
    public static void main(String [] args)
    {
        Bank b1 = new Canara();
        b1.setAccountDetails(1, 1000);
        Bank b2 = new Canara();
        b2.setAccountDetails(2, 5200);
        Bank b3 = new Canara();
        b3.setAccountDetails(3, 2500);
        System.out.println(b1.getAccountDetails());
        System.out.println(b2.getAccountDetails());
        System.out.println(b2.getAccountDetails());

    }
}
interface Bank
{
    public void  setAccountDetails(int account ,int balance);
    public String getAccountDetails();

}
class Canara implements Bank
{
    int account;
    int balance;
    public void setAccountDetails(int account , int balance)
    {
        this.account=account;
        this.balance = balance ;
    }
    public String getAccountDetails()
    {
        return "Account Number : "+this.account +"\nBalance : "+this.balance;
    }

}
