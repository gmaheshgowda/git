public class AirlineTicketRunner {
    public static void main(String[] args) {
        String ref = AirlineTicket.ticketBooking("Emirates", "New York", "David", "Johnson", "david.johnson@gmail.com", "7654321890");
        System.out.println(ref);
    }
}