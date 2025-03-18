public class Passport 
{
    public static String passportRegistration(String applyingAt,String passOffice,String name,String surNama,String dob,String email,boolean isLoginIdmailIdSame,String loginId,String passWord,String confirmPassword)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(applyingAt,passOffice,name,surNama,dob,email,isLoginIdmailIdSame,loginId,passWord,confirmPassword);
        if(valid == true)
        {
            ref = "Congrtulations you are successfully Registered";

        }
        else{
            ref = "Sorry your Registration is unsucessfull";
        }
        return ref;
    }
    public static boolean validateTheGivenData(String applyingAt,String passOffice,String name,String surNama,String dob,String email,boolean isLoginIdmailIdSame,String loginId,String passWord,String confirmPassword)
    {
        boolean isapplyatValid = false;
        boolean isPassofficeValid= false;
        boolean isFirstNameValid= false;
        boolean issurNameValid= false;
        boolean isDoBValid= false;
        boolean isEmailValid= false;
        boolean isLoginIdmailIdSameValid= false;
        boolean isLoginIdvalid= false;
        boolean isPasswordvalid= false;
        boolean isConfirmPassValid= false;
        if(applyingAt!=null)
        {
            isapplyatValid = true;
        }
        else{
            System.out.println("Please enter valid  data");
        }
        if(passOffice!=null&&passOffice.length()>4)
        {
            isPassofficeValid = true;
        }
        else{
            System.out.println("Please enter valid  data");
        }
        if(name!=null&&name.length()>4)
        {
            isFirstNameValid = true;
        }
        else{
            System.out.println("Please enter valid  Name");
        }
        if(surNama!=null&&surNama.length()>4)
        {
            issurNameValid = false;
        }
        else{
            System.out.println("Please enter valid  surname");
        }
        if(dob!=null)
        {
            isDoBValid = true;
        }
        else{
            System.out.println("Please enter valid  DOB");
        }
        if(email!=null&& email.length()>=8)
        {
            isEmailValid = true;
        }
        else{
            System.out.println("Please enter valid  email adress");
        }
        if(isLoginIdmailIdSame!=false)
        {
            isLoginIdmailIdSameValid = true;
        }
        else{
            System.out.println("Please enter valid  email");
        }
        if(passWord!=null)
        {
            isPasswordvalid =true;
        }
        else{
            System.out.println("Please enter valid  password");
        }
        if(loginId!=null&&loginId.length()==10)
        {
            isLoginIdvalid = true;
        }
        else{
            System.out.println("Please enter valid  LoginId");
        }
        if(confirmPassword!=null&&confirmPassword==passWord)
        {
            isConfirmPassValid = true;
        }
        else{
            System.out.println("Please enter same password");
        }
        if(isapplyatValid==isPassofficeValid==isFirstNameValid==issurNameValid==isLoginIdmailIdSameValid==isLoginIdvalid==isPasswordvalid==isConfirmPassValid==isLoginIdvalid==isDoBValid==isEmailValid==true)
        {
            return true;
        }
        else 
        return false;
    }
    
}
