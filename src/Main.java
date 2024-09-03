public class Main {
    public static void printLeapYearStatus(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void selectsTheAppVersion(int nowClientOS, int nowClientDeviceYear) {
        if (nowClientOS == 0 && nowClientDeviceYear < 2015) {
            System.out.println("Установоите облегченную версию приложения для iOS по ссылке ");
        } else if (nowClientOS == 0 && nowClientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке ");
        } else if (nowClientOS == 1 && nowClientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке ");
        } else if (nowClientOS == 1 && nowClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else {
            System.out.println("Неизвестная операционная система.");
        }
    }

    public static int calcCardDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void printCardDeliveryDays(int distance) {
        int days = calcCardDeliveryDays(distance);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача №1");
        int year = 2024;
        printLeapYearStatus(year);

        System.out.println();
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2021;
        selectsTheAppVersion(clientOS, clientDeviceYear);

        System.out.println();
        System.out.println("Задача №3");
        printCardDeliveryDays(150);

    }
}