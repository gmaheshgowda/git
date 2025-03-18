public class UniversityAdmission 
{
    public static String admissionRegistration(String university, String department, String firstName, String lastName, String email, String studentId)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(university, department, firstName, lastName, email, studentId);
        if(valid == true)
        {
            ref = "Congratulations! You are successfully Registered for Admission";
        }
        else{
            ref = "Sorry, your Admission Registration is unsuccessful";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String university, String department, String firstName, String lastName, String email, String studentId)
    {
        boolean isUniversityValid = false;
        boolean isDepartmentValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isStudentIdValid= false;
        
        if(university != null&&!university.isEmpty())
        {
            isUniversityValid = true;
        }
        else{
            System.out.println("Please enter a valid university name");
        }
        if(department != null&&!department.isEmpty() && department.length() > 4)
        {
            isDepartmentValid = true;
        }
        else{
            System.out.println("Please enter a valid department name");
        }
        if(firstName != null &&!firstName.isEmpty()&& firstName.length() > 4)
        {
            isFirstNameValid = true;
        }
        else{
            System.out.println("Please enter a valid first name");
        }
        if(lastName != null&&!lastName.isEmpty() && lastName.length() > 4)
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
        if(studentId != null&&!studentId.isEmpty() && studentId.length() == 10)
        {
            isStudentIdValid = true;
        }
        else{
            System.out.println("Please enter a valid student ID");
        }
        
        if(isUniversityValid == isDepartmentValid == isFirstNameValid == isLastNameValid == isEmailValid == isStudentIdValid == true)
        {
            return true;
        }
        else 
        return false;
    }

}