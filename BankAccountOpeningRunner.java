public class BankAccountOpeningRunner {
    public static void main(String[] args) {
        String ref = BankAccountOpening.accountRegistration("Wells Fargo", "Savings", "Alice", "Johnson", "alice.johnson@gmail.com", "9876543210");
        System.out.println(ref);
    }
}
