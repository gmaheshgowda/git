class Bike {
    static long price = 150000L;
    static String engineType = "V-Twin";
    static String color = "Red";
    static String brand = "Harley-Davidson";
    static byte height = 120;
    static short length = 220; 
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(price + " " + engineType + " " + color + " " + brand + " cm " + length + " cm");
        long price = 180000L;
        String engineType = "Parallel-Twin";
        String color = "Black";
        String brand = "Kawasaki";
        short length = 230;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(price + " " + engineType + " " + color + " " + brand + " cm " + length + " cm");
        updateValue();
    }
    public static void updateValue() {
        price = 200000L;
        engineType = "Inline-4";
        color = "Blue";
        brand = "Yamaha";
        length = 240;
        System.out.println(price + " " + engineType + " " + color + " " + brand  + " cm " + length + " cm");
    }
}
