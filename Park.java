class Park {
    static String name = "Central Park";
    static int area = 340;
    static String location = "New York";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(name + " " + area + " " + location);
        String name = "Hyde Park";
        int area = 350;
        String location = "London";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(name + " " + area + " " + location);
        updateValue();
    }
    public static void updateValue() {
        name = "Lalbagh";
        area = 240;
        location = "Bangalore";
        System.out.println(name + " " + area + " " + location);
    }
}
