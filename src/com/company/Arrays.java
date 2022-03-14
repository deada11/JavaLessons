package com.company;

import java.util.Scanner;

class CalendarFix {
    public static void main(String[] args) {
        String[ ] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);
        }
    }
}

class SummingElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}

class EnhancedForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides = new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }
        for (int j : sides) {
            System.out.println(j*j);
        }
    }
}

class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}

class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        /* Нагугленное решение через StringBuilder */

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println(sb);

        /* Решение через итерацию: */
        char[] arr = text.toCharArray();
        String rev = "";
        for (int i = arr.length-1; i >= 0; i--) {
            rev += arr[i];
        }
        System.out.println(rev);

    }
}