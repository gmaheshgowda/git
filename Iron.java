package WEEK_5;

public class Iron {
    static String ironStatus = "OFF";
    static int currentHeat;
    static int minHeat = 0;
    static int maxHeat = 10;

    public static void acOnOffSwitch() {
        if (ironStatus == "OFF") {
            ironStatus = "ON";
            System.out.println("Your Iron is now turned on");
        } else {
            ironStatus = "OFF";
            System.out.println("Your Iron is now turned OFF");
        }
    }

    public static void increaseHeat() {
        if (ironStatus == "ON") {
            if (currentHeat < 5) {
                currentHeat++;
                System.out.println("Your current heat level is: " + currentHeat);
            } else {
                System.out.println("The Iron is at max heat level");
            }
        } else {
            System.out.println("Your Iron is in Off condition, please turn it on");
        }
    }

    public static void decreaseHeat() {
        if (ironStatus == "ON") {
            if (currentHeat > 0) {
                currentHeat--;
                System.out.println("Your current heat level is: " + currentHeat);
            } else {
                System.out.println("The Iron is at the lowest heat level");
            }
        } else {
            System.out.println("Your Iron is in Off condition, please turn it on");
        }
    }
}
