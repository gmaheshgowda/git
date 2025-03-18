class Mobile {
    static String brand = "Samsung";
    static long price = 35000;
    static String processor = "Exynos 2100";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + processor);
        String brand = "Apple";
        long price = 80000;
        String processor = "A16 Bionic";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + processor);
        updateValue();
    }
    public static void updateValue() {
        brand = "OnePlus";
        price = 45000;
        processor = "Snapdragon 8 Gen 2";
        System.out.println(brand + " " + price + " " + processor);
    }
}
