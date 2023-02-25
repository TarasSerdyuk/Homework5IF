public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");

        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        short clientDeviceYear = 2018;

        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылк");
            }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Androyd по ссылке");
            } else {
                System.out.println("Установите версию приложения для Androyd по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int year = 2021;
        if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        byte monthNumber = 7;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println(monthNumber + " Зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " Весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " Летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " Осенний месяц");
                    break;
            }
        } else {
            System.out.println("Некорректный месяц");
        }
    }
}