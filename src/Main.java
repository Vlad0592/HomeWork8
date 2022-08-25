public class Main {

    public static void leapYear() {
        int year = 2020;
        if (year % 4 != 0 && year % 400 != 0) {
            System.out.println(" Не является высокосным");
        } else {
            System.out.println("Является высокосным");
        }
    }

    public static void appInstallation() {
        int clientDeviceYear = 2015;
        int clientOs = 1;
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }

    }

    public static int deliveryPeriod() {
        int deliveryDistance = 60;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;

        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay = deliveryDay + 1;

        }

        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay = deliveryDay + 2;

        }
        System.out.println(deliveryDay);
        return deliveryDay;
    }

    public static void main(String[] args) {
        // task 1 Определение высокосного и не высокосного года
        leapYear();
        System.out.println();

        //  task 2 Выводим сообщение пользователю
        appInstallation();
        System.out.println();

        // task 3   Возвращаем под стредством return

        deliveryPeriod();
    }
}