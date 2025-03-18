class CricketKit {
    static String brand = "SG";
    static int price = 5000;
    static String kitType = "Professional";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + kitType);
        String brand = "MRF";
        int price = 6000;
        String kitType = "Club";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + kitType);
        updateValue();
    }
    public static void updateValue() {
        brand = "Spartan";
        price = 7000;
        kitType = "International";
        System.out.println(brand + " " + price + " " + kitType);
    }
}
