package WEEK_5;

public class Fan {
    static String fanStatus = "OFF";
    static int currentSpeed;
    static int minSpeed = 0;
    static int maxSpeed = 10;

    public static void acOnOffSwitch() {
        if (fanStatus == "OFF") {
            fanStatus = "ON";
            System.out.println("Your Fan is now turned on");
        } else {
            fanStatus = "OFF";
            System.out.println("Your Fan is now turned OFF");
        }
    }

    public static void increaseSpeed() {
        if (fanStatus == "ON") {
            if (currentSpeed < 5) {
                currentSpeed++;
                System.out.println("Your current speed is: " + currentSpeed);
            } else {
                System.out.println("The Fan is at max speed");
            }
        } else {
            System.out.println("Your Fan is in Off condition, please turn it on");
        }
    }

    public static void decreaseSpeed() {
        if (fanStatus == "ON") {
            if (currentSpeed > 0) {
                currentSpeed--;
                System.out.println("Your current speed is: " + currentSpeed);
            } else {
                System.out.println("The Fan is at the lowest speed");
            }
        } else {
            System.out.println("Your Fan is in Off condition, please turn it on");
        }
    }
}
