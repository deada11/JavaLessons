package stepikJavaBaseCourse1.for42;

import java.util.Scanner;

class Quiz_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.print(n + " ");
        }
    }
}
