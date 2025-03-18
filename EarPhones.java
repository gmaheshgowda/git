class Earphones {
    static String brand = "Sony";
    static int price = 1500;
    static boolean isWireless = true;
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + isWireless);
        String brand = "JBL";
        int price = 2000;
        boolean isWireless = false;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + isWireless);
        updateValue();
    }
    public static void updateValue() {
        brand = "Boat";
        price = 2500;
        isWireless = true;
        System.out.println(brand + " " + price + " " + isWireless);
    }
}
