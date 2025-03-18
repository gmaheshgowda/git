public class BankAccount 
{
    static double balance;
    public static void credit(double amount)
    {
        if(amount >0.0)
        {
            balance += amount;
        }
        else 
        {
            System.out.println(" Please enter valid Amount to be Credited");
        }
    }

    public static void debit(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else{
            System.out.println(" Insufficient balance available");
        }
    }
    public static void getBalance()
    {
        System.out.println("The available balance in Your Account is : "+balance);
    }
}
