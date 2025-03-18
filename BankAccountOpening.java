public class BankAccountOpening 
{
    public static String accountRegistration(String bankName, String accountType, String firstName, String lastName, String email, String accountId)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(bankName, accountType, firstName, lastName, email, accountId);
        if(valid == true)
        {
            ref = "Congratulations! Your Bank Account is Successfully Opened";
        }
        else{
            ref = "Sorry, your Bank Account Opening Failed";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String bankName, String accountType, String firstName, String lastName, String email, String accountId)
    {
        boolean isBankValid = false;
        boolean isAccountTypeValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isAccountIdValid= false;
        
        if(bankName != null)
        {
            isBankValid = true;
        }
        else{
            System.out.println("Please enter a valid bank name");
        }
        if(accountType != null && accountType.length() > 4)
        {
            isAccountTypeValid = true;
        }
        else{
            System.out.println("Please enter a valid account type");
        }
        if(firstName != null && firstName.length() > 4)
        {
            isFirstNameValid = true;
        }
        else{
            System.out.println("Please enter a valid first name");
        }
        if(lastName != null && lastName.length() > 4)
        {
            isLastNameValid = true;
        }
        else{
            System.out.println("Please enter a valid last name");
        }
        if(email != null && email.length() >= 8)
        {
            isEmailValid = true;
        }
        else{
            System.out.println("Please enter a valid email address");
        }
        if(accountId != null && accountId.length() == 10)
        {
            isAccountIdValid = true;
        }
        else{
            System.out.println("Please enter a valid account ID");
        }
        
        if(isBankValid == isAccountTypeValid == isFirstNameValid == isLastNameValid == isEmailValid == isAccountIdValid == true)
        {
            return true;
        }
        else 
        return false;
    }
}

