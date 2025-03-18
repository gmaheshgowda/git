public class Toyota {
    static String name = "Etitos";
    //all static variables are stored in metaspace
    public static void main(String[] args) {
        System.out.println("the car name is : "+name);
        System.out.println("After re-initialization");
        String name = "Corolla";
        System.out.println("the car name is : "+name);
        updateName();
    }
    public static void updateName()
    {
        name = "Fortuner";
        System.out.println("the name of the updated car name is : "+name);
    }
    

}
