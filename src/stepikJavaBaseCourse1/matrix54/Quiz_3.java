package stepikJavaBaseCourse1.matrix54;

import java.util.Scanner;

class Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(
                        (j < m) ? i * j + " " : i * j
                );
            }
            System.out.println();
        }
    }
}
