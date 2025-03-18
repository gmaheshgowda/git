class AirConditioner {
    
    static String brand = "Godrej";
    static String capacity = "1 Tons";
    static int coolingPower = 3;

    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(brand + " " + capacity + " " + coolingPower + " Kilowatts");

        String brand = "LG";
        String capacity = "1.5 Tons";
        int coolingPower = 4;

        System.out.println("The variables after re-initialization are: ");
        System.out.println(brand + " " + capacity + " " + coolingPower + " Kilowatts");

        updateValue();
    }

    public static void updateValue() {
        brand = "Samsung";
        capacity = "2 Tons";
        coolingPower = 5;
        
        System.out.println(brand + " " + capacity + " " + coolingPower + " Kilowatts");
    }
}
