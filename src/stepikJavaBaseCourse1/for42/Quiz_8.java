package stepikJavaBaseCourse1.for42;

import java.util.Scanner;

class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
