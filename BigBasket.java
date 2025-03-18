class Bigbasket
{
    static   String groceries[] = {"Tata Salt", "Aashirvaad Atta", "MTR Sambar Powder", "Tata Tea", "Bru Coffee","Rice (India Gate)", "Amul Butter", "Shakti Bhog Suji", "Fortune Oil", "Dabur Honey"};
    static   String perfumes[] = {"Wild Stone", "Axe Signature", "Engage M2", "Park Avenue", "Nautica Voyage","Lalique Pour Homme", "Hugo Boss", "Calvin Klein CK One", "Nivea Body Spray", "Tommy Hilfiger"};
    static   String biscuits[] = {"Parle-G", "Britannia Marie", "Oreo", "Hide & Seek", "Britannia Treat","Sunfeast", "Milk Bikis", "Little Debbie", "Bourbon", "Good Day"};
    static String utensils[] = { "Prestige Pressure Cooker", "Tefal Non-Stick Fry Pan", "Crompton Greaves Mixer", "Borosil Glassware", "Casserole","Pigeon Gas Stove", "Hawkins Tava", "Scotch Brite Scrubber", "Zojirushi Thermos", "Tupperware Containers"};
    static String vegetables[] = {"Potato", "Tomato", "Onion", "Carrot", "Cucumber","Cauliflower", "Brinjal", "Spinach", "Peas", "Bottle Gourd"};

    public static void main(String[] args)
    {
        System.out.println("main started ");
        getvegetables();
        getbiscuits();
        getgroceries();
        getperfumes();
        getutensils();
        System.out.println("main ended");
    }

    public static void getgroceries()
    {
        System.out.println(" get groceries function started ");
        System.out.println("The list of groceries are:");
        
        for(String ref :groceries)
        {
            System.out.println(ref);
        }
        System.out.println(" get groceries function ended ");


    }


    public static void getperfumes()
    {
        System.out.println(" get perfumes function started ");
        System.out.println("\nThe list of perfumes are:");

        for(String ref :perfumes)
        {
            System.out.println(ref);
        }

        System.out.println("get perfumes function ended ");


    }

    public static void getbiscuits()
    {
        System.out.println(" get biscuits function started ");
        System.out.println("\nThe list of biscuits are:");
        for(String ref :biscuits)
        {
            System.out.println(ref);
        }

        System.out.println(" get biscuits function ended ");


    }

    public static void getutensils()
    {
        System.out.println(" get utencils function started ");
        System.out.println("\nThe list of utensils are:");

        for(String ref :utensils)
        {
            System.out.println(ref);
        }
        System.out.println(" get utencils function ended ");


    }

    public static void getvegetables()
    {
        System.out.println(" get vegetables function started ");
        System.out.println("\nThe list of vegetables are:");

        for(String ref :vegetables)
        {
            System.out.println(ref);
        }

        System.out.println(" get vegetables function ended ");


    }
}
    
       
     
     
     
