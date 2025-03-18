class Microwave {
    static String brand = "Samsung";
    static String colour = "Black";
    static String heatingMethod = "Convection";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + colour + " " + heatingMethod);
        String brand = "LG";
        String colour = "Silver";
        String heatingMethod = "Grill";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + colour + " " + heatingMethod);
        updateValue();
    }
    public static void updateValue() {
        brand = "IFB";
        colour = "White";
        heatingMethod = "Solo";
        System.out.println(brand + " " + colour + " " + heatingMethod);
    }
}
