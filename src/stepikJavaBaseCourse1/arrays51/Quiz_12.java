package stepikJavaBaseCourse1.arrays51;

import java.util.Scanner;

class Quiz_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] array = new int[n/2];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                array[(i/2) - 1] = i;
                System.out.print(" " + i);
                sum += i;
            }
        }
        /* Так можно заполнить массив только четными числами, избегая формул приведения к четному
        for (int i = 2, j = 0; i <= n; i+=2, j++) {
            array[j] = i;
            sum += i;
        }
         */
        System.out.println();
        System.out.println(sum);
    }
}
