package lesson1;

import java.util.Scanner;

public class CheckingNegativeNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input = scanner.nextInt();
        System.out.println(checkNumber(input));
    }
    private static boolean checkNumber(int num) {
        return num <= 0;
    }
}
