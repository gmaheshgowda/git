public class VoterID 
{
    public static String voterRegistration(String country, String region, String firstName, String lastName, String email, String voterId, boolean isCitizen)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(country, region, firstName, lastName, email, voterId, isCitizen);
        if(valid)
        {
            ref = "Congratulations! Your Voter ID is Successfully Registered";
        }
        else{
            ref = "Sorry, your Voter ID Registration Failed";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String country, String region, String firstName, String lastName, String email, String voterId, boolean isCitizen)
    {
        boolean isCountryValid = false;
        boolean isRegionValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isVoterIdValid= false;
        boolean isCitizenValid = isCitizen;

        if(country != null&&!country.isEmpty())
        {
            isCountryValid = true;
        }
        else{
            System.out.println("Please enter a valid country");
        }
        if(region != null &&!region.isEmpty()&& region.length() > 4)
        {
            isRegionValid = true;
        }
        else{
            System.out.println("Please enter a valid region");
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
        if(voterId != null&&!voterId.isEmpty() && voterId.length() == 10)
        {
            isVoterIdValid = true;
        }
        else{
            System.out.println("Please enter a valid voter ID");
        }

        if(isCountryValid == isRegionValid == isFirstNameValid == isLastNameValid == isEmailValid == isVoterIdValid == isCitizenValid == true)
        {
            return true;
        }
        else 
        return false;
    }

}


