package WEEK_5;

public class Fridge {
    static String fridgeStatus = "OFF";
    static int currentTemperature;
    static int minTemperature = 0;
    static int maxTemperature = 10;

    public static void acOnOffSwitch() {
        if (fridgeStatus == "OFF") {
            fridgeStatus = "ON";
            System.out.println("Your Fridge is now turned on");
        } else {
            fridgeStatus = "OFF";
            System.out.println("Your Fridge is now turned OFF");
        }
    }

    public static void increaseTemperature() {
        if (fridgeStatus == "ON") {
            if (currentTemperature < 5) {
                currentTemperature++;
                System.out.println("Your current temperature is: " + currentTemperature);
            } else {
                System.out.println("The Fridge is at max temperature");
            }
        } else {
            System.out.println("Your Fridge is in Off condition, please turn it on");
        }
    }

    public static void decreaseTemperature() {
        if (fridgeStatus == "ON") {
            if (currentTemperature > 0) {
                currentTemperature--;
                System.out.println("Your current temperature is: " + currentTemperature);
            } else {
                System.out.println("The Fridge is at the lowest temperature level");
            }
        } else {
            System.out.println("Your Fridge is in Off condition, please turn it on");
        }
    }
}
