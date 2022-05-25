package stepikCource.for42;

import java.util.Scanner;

class Quiz_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = 1;
        while (n >= x) {
            for (int i = 1; i <= x; i++) {
                System.out.print((i == x) ? i : i + " ");
            }
            System.out.println();
            x++;
        }
    }
}
