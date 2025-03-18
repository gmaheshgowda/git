class WaterBottle {
    static String brand = "Tupperware";
    static int price = 499;
    static int capacity = 1000;
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + capacity);
        String brand = "Milton";
        int price = 699;
        int capacity = 750;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + capacity);
        updateValue();
    }
    public static void updateValue() {
        brand = "Cello";
        price = 899;
        capacity = 500;
        System.out.println(brand + " " + price + " " + capacity);
    }
}
