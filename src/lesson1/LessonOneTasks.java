package lesson1;

import java.util.Scanner;

public class LessonOneTasks {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printHelloWorld();
        variables();
        System.out.println(expressionCalculation());
        System.out.println(checkSum());
        moreOrLess();
        System.out.println(checkingNegativeNumber());
        printString();
        highYear();
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void variables() {
        int a = 5;
        long b = 1_000_000L;
        float c = 3.5f;
        double d = 1.5;
        char e = 'i';
        boolean f = true;
        String str = "Hello";
        System.out.println(a + "\n"+ b + "\n" + c + "\n" + d +"\n" + e + "\n" + f + "\n" + str);
    }

    public static double expressionCalculation() {
        System.out.println("Введите 4 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (d == 0) {
            return 0;
        }
        return a * (b + (c / d));

    }

    public static boolean checkSum() {
        System.out.println("Введите 2 числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    public static void moreOrLess() {
        System.out.println("Введите число для проверки: ");
        int input = scanner.nextInt();
        if (input >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkingNegativeNumber() {
        System.out.println("Введите число для проверки: ");
        int input = scanner.nextInt();
        return input <= 0;
    }

    public static void printString() {
        System.out.println("Введите строку: ");
        String name = scanner.next();
        System.out.println("Привет, " + name + "!");
    }

    public static void highYear() {
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
