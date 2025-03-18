public class AirlineTicket 
{
    public static String ticketBooking(String airline, String destination, String firstName, String lastName, String email, String bookingId)
    {
        boolean valid = false;
        String ref = null;
        valid = validateTheGivenData(airline, destination, firstName, lastName, email, bookingId);
        if(valid == true)
        {
            ref = "Congratulations! Your Airline Ticket is Successfully Booked";
        }
        else{
            ref = "Sorry, your Ticket Booking Failed";
        }
        return ref;
    }

    public static boolean validateTheGivenData(String airline, String destination, String firstName, String lastName, String email, String bookingId)
    {
        boolean isAirlineValid = false;
        boolean isDestinationValid= false;
        boolean isFirstNameValid= false;
        boolean isLastNameValid= false;
        boolean isEmailValid= false;
        boolean isBookingIdValid= false;
        
        if(airline != null)
        {
            isAirlineValid = true;
        }
        else{
            System.out.println("Please enter a valid airline name");
        }
        if(destination != null && destination.length() > 4)
        {
            isDestinationValid = true;
        }
        else{
            System.out.println("Please enter a valid destination");
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
        if(bookingId != null && bookingId.length() == 10)
        {
            isBookingIdValid = true;
        }
        else{
            System.out.println("Please enter a valid booking ID");
        }
        
        if(isAirlineValid == isDestinationValid == isFirstNameValid == isLastNameValid == isEmailValid == isBookingIdValid == true)
        {
            return true;
        }
        else 
        return false;
    }
}


