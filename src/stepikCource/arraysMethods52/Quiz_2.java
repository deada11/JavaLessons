package stepikCource.arraysMethods52;

import java.util.Scanner;
import java.util.Arrays;

class Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if ((k < 0) || (k > n)) {
            System.out.println("Ошибка ввода");
        } else {
            Arrays.sort(array);
            System.out.println(array[k-1]);
        }
    }
}
