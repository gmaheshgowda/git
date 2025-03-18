public class BankAccountRunner 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method Started");
        BankAccount.getBalance();
        BankAccount.credit(2349.87);
        BankAccount.getBalance();
        BankAccount.debit(18000.0);
        BankAccount.getBalance();
        System.out.println("Main method ended");

        
    }    
}
