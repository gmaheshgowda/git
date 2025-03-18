class User {
    static String userName = "Gani";
    static String email = "manoj65293@gmail.com";
    static long adhaar = 547896523201L;
    public static void main(String det[]) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(userName + " " + email + " " + adhaar);
        String userName = "Manoj";
        String email = "manoj123@gmail.com";
        long adhaar = 987654321012L;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(userName + " " + email + " " + adhaar);
        updateValue();
    }
    public static void updateValue() {
        userName = "Rahul";
        email = "rahul456@gmail.com";
        adhaar = 123456789101L;
        System.out.println(userName + " " + email + " " + adhaar);
    }
}
