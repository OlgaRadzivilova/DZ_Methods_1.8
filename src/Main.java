import java.time.LocalDate;

public class Main {


// Задание 1

    public static void checkLeapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (leapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

// Задание 2

    public static void getDataClientOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (clientOS == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Install the lite version of the iOS app by following the link");
        }
        if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Install the Android version of the app by following the link");
        } else if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Install the lite version of the Android app by following the link");
        }


    }

// Задание 3

    public static void calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("It will take 1 day");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("It will take 2 days");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("It will take 3 days");
        } else {
            System.out.println("Delivery for an address over 100 km is not made");
        }

    }


    public static void main(String[] args) {
        checkLeapYear(2024);
        getDataClientOS(0, 2020);
        calculateDeliveryTime(35);

        }
}










