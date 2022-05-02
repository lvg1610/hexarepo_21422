public class Account
{
    int accountNo;
    String accountHolderName;
    double balance;
    public Account(int accountNo,String accountHolderName,double balance)
    {
         this.accountNo=accountNo;    this.accountHolderName=accountHolderName;
         this.balance= balance; 
    }
    public void setBalance(double balance)
    {
         this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
}