package stepikCource.arrays51;

import java.util.Scanner;

class Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int k = 0; k < n-1; k++) {
            if (array[k + 1] > array[k]) {
                System.out.print(array[k + 1] + " ");
            }
        }
    }
}
