public class DrivingLicenseRunner {
    public static void main(String[] args) {
        String ref = DrivingLicense.licenseRegistration("California", "Commercial", "John", "Smith", "john.smith@gmail.com", "1234567890", true);
        System.out.println(ref);
    }
}