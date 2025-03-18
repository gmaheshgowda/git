class Vehicle {
    static String name = "Car";
    static String type = "Sedan";
    static long price = 20947450L;
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(name + " " + type + " " + price);
        String name = "Bike";
        String type = "Cruiser";
        long price = 1500000L;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(name + " " + type + " " + price);
        updateValue();
    }
    public static void updateValue() {
        name = "Truck";
        type = "Heavy-Duty";
        price = 5000000L;
        System.out.println(name + " " + type + " " + price);
    }
}
