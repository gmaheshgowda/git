class PinCodes
{
   static int pinCodes[] = {560001, 560002, 560003, 560004, 560005, 560010, 560011, 560012, 560013, 560015};

    public static void main(String[] args)
    {
        System.out.println("main started ");
        getpincode();
        System.out.println("main ended");
    }
    
    public static void getpincode()
    {
        System.out.println(" getpincode method started");
        for (int pincodes : pinCodes) 
        {
            System.out.println(pincodes);    
        }
        System.out.println("get method ended");
    }

}
