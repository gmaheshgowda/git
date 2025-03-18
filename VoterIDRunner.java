public class VoterIDRunner {
    public static void main(String[] args) {
        String ref = VoterID.voterRegistration("india", "karnataka", "mahesh", "g", "mahesh.@gmail.com", "5432167890", true);
        System.out.println(ref);
    }
}