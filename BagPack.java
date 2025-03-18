class Backpack {
    static String brand = "Adidas";
    static int price = 2500;
    static String color = "Grey";
    static boolean isWaterResistant = true;
    static int capacity = 30; 
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + color + " " + isWaterResistant + " " + capacity);
        String brand = "Puma";
        int price = 2800;
        String color = "Black";
        boolean isWaterResistant = false;
        int capacity = 35;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + color + " " + isWaterResistant + " " + capacity);
        updateValue();
    }
    public static void updateValue() {
        brand = "Wildcraft";
        price = 3200;
        color = "Blue";
        isWaterResistant = true;
        capacity = 40;
        System.out.println(brand + " " + price + " " + color + " " + isWaterResistant + " " + capacity);
    }
}
