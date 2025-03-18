
class Aashirwad
{	
	static String brand = "aashirwad";
	static String modelName = "Vermicelli";
	static int wtInKg = 5;
	static String mfDate = "12/05/2024";
	static String ntCt = "Na";
	public static void main(String[]ref)
	{
		System.out.println("the variables before re-initialization are : ");
		System.out.println(brand+" "+modelName+" "+wtInKg+" "+mfDate+" "+ntCt);
		 brand = "Fortune ";
		String modelName = "Atta";
		int wtInKg = 6;
		String mfDate = "18/08/2025";
		String ntCt = "Na";
		System.out.println("the variables After re-initialization are : ");
		System.out.println(brand+" "+modelName+" "+wtInKg+" "+mfDate+" "+ntCt);
		updateValue();
}
public static void updateValue()
    {
		 brand = "Tata ";
		 modelName = "vermiccelli";
		 wtInKg = 4;
		 mfDate = "08/08/2028";
		 ntCt = "Na";        
		 System.out.println(brand+" "+modelName+" "+wtInKg+" "+mfDate+" "+ntCt);

    }
}