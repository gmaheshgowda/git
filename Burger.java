class Burger {
    static String brand = "McDonald's";
    static int price = 150;
    static String type = "Cheese";
    static boolean isVegetarian = false;
    static int weight = 200;
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + type + " " + isVegetarian + " " + weight);
        String brand = "Burger King";
        int price = 180;
        String type = "Veggie";
        boolean isVegetarian = true;
        int weight = 220;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + type + " " + isVegetarian + " " + weight);
        updateValue();
    }
    public static void updateValue() {
        brand = "KFC";
        price = 200;
        type = "Zinger";
        isVegetarian = false;
        weight = 250;
        System.out.println(brand + " " + price + " " + type + " " + isVegetarian + " " + weight);
    }
}
