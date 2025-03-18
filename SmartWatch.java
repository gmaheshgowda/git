class SmartWatch {
    static String brand = "Apple";
    static int price = 30000;
    static String displayType = "AMOLED";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + displayType);
        String brand = "Samsung";
        int price = 25000;
        String displayType = "LCD";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + displayType);
        updateValue();
    }
    public static void updateValue() {
        brand = "Garmin";
        price = 20000;
        displayType = "E-Ink";
        System.out.println(brand + " " + price + " " + displayType);
    }
}
