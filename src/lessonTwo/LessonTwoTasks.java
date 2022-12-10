package lessonTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LessonTwoTasks {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        componentChange();
        arrayFill();
        chooseToMultiply();
        diagonals();
        getMinAndMax();
        System.out.println(checkBalance());
        arrayShift();
        arrayShiftModer();
    }

    public static void componentChange() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void arrayFill() {
        int[] a = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void chooseToMultiply() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void diagonals() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getMinAndMax() {
        int[] a = {1, 5, 3, 2, 11, 20, 5, 2, 4, 8, 9, 15};
        int max = 0;
        int min = a.length;
        for (int j : a) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        String result = String.format("""
                %s
                %s
                """, max, min);
        System.out.println(result);

    }

    public static boolean checkBalance() {
        int[] forCheckBalanceArray = {1, 2, 3, 1, 2, 3};

        int leftSumma = 0;
        for (int i = 0; i < forCheckBalanceArray.length; i++) {
            leftSumma += forCheckBalanceArray[i];
            int rightSumma = 0;
            for (int j = 0; j < forCheckBalanceArray.length; j++) {
                rightSumma += (j > i) ? forCheckBalanceArray[j] : 0;
            }
            if (leftSumma == rightSumma) {
                return true;
            }
        }
        return false;
    }

    public static void arrayShift() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Введите число смещения массива: ");
        int position = scanner.nextInt();

        for (int i = 0; i < position; i++) {
            int n = array[array.length -1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = n;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayShiftModer() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Введите число смещения массива: ");
        int position = scanner.nextInt();

        List<Integer> list = new java.util.ArrayList<>(Arrays.stream(array).boxed().toList());
        Collections.rotate(list, position);
        System.out.println(list);
    }
}
