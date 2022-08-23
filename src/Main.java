public class Main {

    public static void Year() {
        int year = 2020;
        if (year % 4 != 0 && year % 400 != 0) {
            System.out.println(" Не является высокосным");
        } else {
            System.out.println("Является высокосным");
        }
    }

    public static void osName() {
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

    public static int refoundDays() {
        int deliveryDistance = 60;
        int srok = 1;
        if (deliveryDistance <= 20) {
            srok = 1;

        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            srok = srok +1;

        }

        if(deliveryDistance>= 60 && deliveryDistance < 100) {
            srok = srok +2;

        }
        System.out.println(srok);
        return srok;
    }
    public static void main(String[] args) {
        // task 1 Определение высокосного и не высокосного года
        Year();

        //  task 2 Выводим сообщение пользователю
        osName();

        // task 3   Возвращаем под стредством return

        refoundDays();
    }
}