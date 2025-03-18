class Bus {
    static String brand = "Volvo";
    static int price = 5000000;
    static int seatingCapacity = 45;
    static String fuelType = "Diesel";
    static boolean isAirConditioned = true;
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + price + " " + seatingCapacity + " " + fuelType + " " + isAirConditioned);
        String brand = "Mercedes-Benz";
        int price = 6000000;
        int seatingCapacity = 50;
        String fuelType = "Electric";
        boolean isAirConditioned = true;
        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + price + " " + seatingCapacity + " " + fuelType + " " + isAirConditioned);
        updateValue();
    }
    public static void updateValue() {
        brand = "Tata Motors";
        price = 4500000;
        seatingCapacity = 40;
        fuelType = "CNG";
        isAirConditioned = false;
        System.out.println(brand + " " + price + " " + seatingCapacity + " " + fuelType + " " + isAirConditioned);
    }
}
