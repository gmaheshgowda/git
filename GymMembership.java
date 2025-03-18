public class GymMembership 
{
    public static String membershipRegistration(String gymName, String membershipType, String firstName, String lastName, String email, String membershipId, boolean isTrainerRequired)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(gymName, membershipType, firstName, lastName, email, membershipId, isTrainerRequired);
        if(valid == true)
        {
            ref = "Congratulations! Your Gym Membership is Successfully Registered";
        }
        else{
            ref = "Sorry, your Gym Membership Registration Failed";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String gymName, String membershipType, String firstName, String lastName, String email, String membershipId, boolean isTrainerRequired)
    {
        boolean isGymValid = false;
        boolean isMembershipTypeValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isMembershipIdValid= false;
        boolean isTrainerRequiredValid = isTrainerRequired;

        if(gymName != null)
        {
            isGymValid = true;
        }
        else{
            System.out.println("Please enter a valid gym name");
        }
        if(membershipType != null && membershipType.length() > 4)
        {
            isMembershipTypeValid = true;
        }
        else{
            System.out.println("Please enter a valid membership type");
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
        if(membershipId != null && membershipId.length() == 10)
        {
            isMembershipIdValid = true;
        }
        else{
            System.out.println("Please enter a valid membership ID");
        }

        if(isGymValid == isMembershipTypeValid == isFirstNameValid == isLastNameValid == isEmailValid == isMembershipIdValid == isTrainerRequiredValid == true)
        {
            return true;
        }
        else 
        return false;
    }

}

