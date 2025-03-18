public class DrivingLicense 
{
    public static String licenseRegistration(String state, String licenseType, String firstName, String lastName, String email, String licenseId, boolean hasPassedTest)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(state, licenseType, firstName, lastName, email, licenseId, hasPassedTest);
        if(valid)
        {
            ref = "Congratulations! Your Driving License is Successfully Registered";
        }
        else{
            ref = "Sorry, your Driving License Registration Failed";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String state, String licenseType, String firstName, String lastName, String email, String licenseId, boolean hasPassedTest)
    {
        boolean isStateValid = false;
        boolean isLicenseTypeValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isLicenseIdValid= false;
        boolean isTestPassedValid = hasPassedTest;

        if(state != null&&!state.isEmpty())
        {
            isStateValid = true;
        }
        else{
            System.out.println("Please enter a valid state name");
        }
        if(licenseType != null &&!licenseType.isEmpty()&& licenseType.length() > 4)
        {
            isLicenseTypeValid = true;
        }
        else{
            System.out.println("Please enter a valid license type");
        }
        if(firstName != null &&!firstName.isEmpty()&& firstName.length() > 4)
        {
            isFirstNameValid = true;
        }
        else{
            System.out.println("Please enter a valid first name");
        }
        if(lastName != null &&!lastName.isEmpty()&& lastName.length() > 4)
        {
            isLastNameValid = true;
        }
        else{
            System.out.println("Please enter a valid last name");
        }
        if(email != null &&!email.isEmpty()&& email.length() >= 8)
        {
            isEmailValid = true;
        }
        else{
            System.out.println("Please enter a valid email address");
        }
        if(licenseId != null &&!licenseId.isEmpty()&& licenseId.length() == 10)
        {
            isLicenseIdValid = true;
        }
        else{
            System.out.println("Please enter a valid license ID");
        }

        if(isStateValid == isLicenseTypeValid == isFirstNameValid == isLastNameValid == isEmailValid == isLicenseIdValid == isTestPassedValid == true)
        {
            return true;
        }
        else 
        return false;
    }

   
}


