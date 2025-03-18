class WaterPurifier {
    static String brand = "Aquaguard";
    static int price = 12000;
    static String filterType = "RO";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + filterType);
        String brand = "Kent";
        int price = 15000;
        String filterType = "UV";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + filterType);
        updateValue();
    }
    public static void updateValue() {
        brand = "Pureit";
        price = 10000;
        filterType = "UF";
        System.out.println(brand + " " + price + " " + filterType);
    }
}
