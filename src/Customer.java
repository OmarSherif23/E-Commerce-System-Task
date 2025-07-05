public class Customer {
    double balance;
    public Customer(double balance)
    {
        this.balance = balance;
    }
    public boolean pay(double amount){
        if(balance < amount)
        {
            return false;
        }
        balance -= amount;
        return true;
    }
    public double getBalance()
    {
        return balance;
    }
}
