package stepikCource.for42;

import java.util.Scanner;

class Quiz_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if (n < 6) System.out.println("Таких чисел нет");
        for (int i = 6; i <= n; i += 6) {
            System.out.print(i + " ");
        }
    }
}
