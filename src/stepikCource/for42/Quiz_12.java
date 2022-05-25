package stepikCource.for42;

import java.util.Scanner;

class Quiz_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    if (count <= i) {
                        System.out.print(j);
                    }
                    if (count < i) {
                        System.out.print(" ");
                    }
                    count++;
                }
            }
            if (i < n) {
                System.out.println();
            }
        }
    }
}
