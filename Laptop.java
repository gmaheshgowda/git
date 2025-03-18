class Laptop {
    static String brand = "Dell";
    static long price = 70000;
    static String processor = "Intel i7";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + processor);
        String brand = "HP";
        long price = 80000;
        String processor = "AMD Ryzen 7";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + processor);
        updateValue();
    }
    public static void updateValue() {
        brand = "Apple";
        price = 120000;
        processor = "M2 Chip";
        System.out.println(brand + " " + price + " " + processor);
    }
}
