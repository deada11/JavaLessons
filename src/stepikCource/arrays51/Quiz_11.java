package stepikCource.arrays51;

import java.util.Scanner;

class Quiz_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(array[sc.nextInt()]);
    }
}
