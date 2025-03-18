public class GymMembershipRunner {
    public static void main(String[] args) {
        String ref = GymMembership.membershipRegistration("Gold's Gym", "Platinum", "Alice", "Smith", "alice.smith@gmail.com", "5678901234", true);
        System.out.println(ref);
    }
}