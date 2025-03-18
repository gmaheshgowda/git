public class Myntra {
    public static void myntraRegistration(String phone,String firstName,String lastName,String Gender,String email,String Dob)
    {
        boolean value = validateUserDetails( phone, firstName, lastName, Gender, email, Dob);
        if(value == true)
        {
            System.out.println("User registration Successfull");
        }
        else{
            System.out.println(" user registration Unsuccessful");
        }
    
    }
    public static boolean validateUserDetails(String phone,String firstName,String lastName,String Gender,String email,String Dob)
    {
        boolean isFirstNameValid = false;
        boolean islastNameValid = false;
        boolean isGenderValid = false;
        boolean isPhoneValid = false;
        boolean isEmailValid = false;
        boolean isDoBValid = false;

        if(firstName != null &&!firstName.isEmpty()&& firstName.length() > 3)
        {
            isFirstNameValid = true;
        }
        else{
            System.out.println("please provide valid first name");
        }
        if(lastName != null &&!lastName.isEmpty()&& lastName.length() > 3)
        {
            islastNameValid = true;
        }
        else{
            System.out.println(" please provide valid last name ");
        }
        if(Gender != null&&!Gender.isEmpty() && Gender.length()>0)
        {
            isGenderValid = true;
        }
        else{
            System.out.println("please enter the valid gender details ");
        }
        if(phone!= null&&!phone.isEmpty()&&phone.length()>=10)
        {
            isPhoneValid = true;
        }
        else{
            System.out.println("please enter valid phone number");
        }
        if(email!= null&&!email.isEmpty())
        {
            isEmailValid = true;
        }
        else{
            System.out.println("please enter valid email");
        }
        if(Dob!=null&&!Dob.isEmpty())
        {
            isDoBValid = true;
        }
        else{
            System.out.println("please enter valid DOB");
        }
    
    if(isDoBValid==isEmailValid==isFirstNameValid==islastNameValid==isGenderValid==isPhoneValid)
    {
        return true;
    }
    else{
        return false;
    }   
}
    
}


    

