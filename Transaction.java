public class Transaction
{
    public void deposit(Account account,double amount)
    {
        account.setBalance(account.getBalance()+amount);
    }

    public void withdraw(Account account,double amount)
    {
         double bal = account.getBalance();
         if(bal - amount >= 0)
            account.setBalance(bal-amount);
         else
            throw new InsufficientBalanceException();
    }
}