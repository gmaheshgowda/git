class Charger {
    static String brand = "Apple";
    static long price = 1999;
    static double cableLength = 1.0;
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + cableLength + " meters");
        String brand = "Samsung";
        long price = 2499;
        double cableLength = 1.5;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + cableLength + " meters");
        updateValue();
    }
    public static void updateValue() {
        brand = "OnePlus";
        price = 2999;
        cableLength = 2.0;
        System.out.println(brand + " " + price + " " + cableLength + " meters");
    }
}
