class Pizza {
    static String name = "Margherita";
    static int id = 101;
    static String type = "Thin Crust";
    public static void main(String[] args) {
        System.out.println("The variables before re-initialization are: ");
        System.out.println(name + " " + id + " " + type);
        String name = "Pepperoni";
        int id = 102;
        String type = "Stuffed Crust";
        System.out.println("The variables after re-initialization are: ");
        System.out.println(name + " " + id + " " + type);
        updateValue();
    }
    public static void updateValue() {
        name = "BBQ Chicken";
        id = 103;
        type = "Cheese Burst";
        System.out.println(name + " " + id + " " + type);
    }
}
