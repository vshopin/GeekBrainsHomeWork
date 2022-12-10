package lesson1;

import java.util.Scanner;

public class LessonOneTasks {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printHelloWorld();
        variables();
        expressionCalculation();
        checkSum();
        moreOrLess();
        checkingNegativeNumber();
        printString();
        highYear();
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void variables() {
        int a = 5;
        System.out.println(a);

        long b = 1_000_000L;
        System.out.println(b);

        float c = 3.5f;
        System.out.println(c);

        double d = 1.5;
        System.out.println(d);

        char e = 'i';
        System.out.println(e);

        boolean f = true;
        System.out.println(f);

        String str = "Hello";
        System.out.println(str);
    }

    public static void expressionCalculation() {
        System.out.println("Введите 4 числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println(returnExpression(num1, num2, num3, num4));
    }

    private static double returnExpression(int a, int b, int c, int d) {
        if (d == 0) {
            return 0;
        }
        return a * (b + (c / d));
    }

    public static void checkSum() {
        System.out.println("Введите 2 числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
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

    public static void checkingNegativeNumber() {
        System.out.println("Введите число для проверки: ");
        int input = scanner.nextInt();
        System.out.println(checkNumber(input));
    }

    private static boolean checkNumber(int num) {
        return num <= 0;
    }

    public static void printString() {
        System.out.println("Введите строку: ");
        String name = scanner.next();
        printHello(name);
    }
    private static void printHello(String str) {
        System.out.println("Привет, " + str + "!");
    }

    public static void highYear() {
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        checkHighYear(year);
    }

    private static void checkHighYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
