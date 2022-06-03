package stepikJavaBaseCourse1.arrays51;

import java.util.Scanner;

class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
