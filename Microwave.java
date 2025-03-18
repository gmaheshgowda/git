package WEEK_5;

public class Microwave {
  static  String microwavwStatus = "OFF";
  static int currrentTemp;
  static int minTemp = 0;
  static int maxTemp = 10;
    public static void microwaveOnOffSwitch()
    {
        if(microwavwStatus == "OFF")
        {
            microwavwStatus = "ON"; 
            System.out.println("your Microwave is now turned on");           
        }
        else{
            microwavwStatus = "OFF";
            System.out.println("Your Microwave is now turned OFF");
        }
        
    }
public static void increaseTemperature()
{
    if(microwavwStatus == "ON")
    {
        if(currrentTemp < 500 )
        {
            currrentTemp += 50;
            System.out.println("you current Temperature is : "+currrentTemp);
        }
        else{
            System.out.println("The Microwave is at max Temperature ");
        }
        
    }else{
        System.out.println("your Microwave is in Off condition please turn it on ");
    }
}
public static void decreaseTemperature()
{
    if(microwavwStatus == "ON")
    {
        if(currrentTemp > 50 )
        {
            currrentTemp -= 50;
            System.out.println("you current Temperature is : "+currrentTemp);
        }
        else{
            System.out.println("The Microwave is at minimum Temperature ");
        }
        
    }else{
        System.out.println("your Microwave is in Off condition please turn it on ");
    }
}
    
}


    

