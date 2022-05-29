package javaRushCourse.arrays;

import java.util.Scanner;

class arraysTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
