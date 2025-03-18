public class LibraryMembership 
{
    public static String membershipRegistration(String libraryName, String membershipType, String firstName, String lastName, String email, String membershipId)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(libraryName, membershipType, firstName, lastName, email, membershipId);
        if(valid == true)
        {
            ref = "Congratulations! Your Library Membership is Successfully Registered";
        }
        else{
            ref = "Sorry, your Library Membership Registration Failed";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String libraryName, String membershipType, String firstName, String lastName, String email, String membershipId)
    {
        boolean isLibraryValid = false;
        boolean isMembershipTypeValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isMembershipIdValid= false;
        
        if(libraryName != null&&!libraryName.isEmpty())
        {
            isLibraryValid = true;
        }
        else{
            System.out.println("Please enter a valid library name");
        }
        if(membershipType != null &&!membershipType.isEmpty()&& membershipType.length() > 4)
        {
            isMembershipTypeValid = true;
        }
        else{
            System.out.println("Please enter a valid membership type");
        }
        if(firstName != null &&!firstName.isEmpty()&& firstName.length() > 4)
        {
            isFirstNameValid = true;
        }
        else{
            System.out.println("Please enter a valid first name");
        }
        if(lastName != null&&!lastName.isEmpty()&& lastName.length() > 4)
        {
            isLastNameValid = true;
        }
        else{
            System.out.println("Please enter a valid last name");
        }
        if(email != null && !lastName.isEmpty() && email.length() >= 8)
        {
            isEmailValid = true;
        }
        else{
            System.out.println("Please enter a valid email address");
        }
        if(membershipId != null&&!membershipId.isEmpty() && membershipId.length() == 10)
        {
            isMembershipIdValid = true;
        }
        else{
            System.out.println("Please enter a valid membership ID");
        }
        
        if(isLibraryValid == isMembershipTypeValid == isFirstNameValid == isLastNameValid == isEmailValid == isMembershipIdValid == true)
        {
            return true;
        }
        else 
        return false;
    }
}


