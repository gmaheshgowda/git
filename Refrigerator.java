class Refrigerator {
    static String brand = "Whirlpool";
    static int capacity = 184;
    static String configuration = "Single";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + capacity + " " + configuration);
        String brand = "Samsung";
        int capacity = 250;
        String configuration = "Double";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + capacity + " " + configuration);
        updateValue();
    }
    public static void updateValue() {
        brand = "LG";
        capacity = 300;
        configuration = "Side-by-Side";
        System.out.println(brand + " " + capacity + " " + configuration);
    }
}
