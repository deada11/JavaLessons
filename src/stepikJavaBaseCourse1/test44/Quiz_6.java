package stepikJavaBaseCourse1.test44;

import java.util.Scanner;

class Quiz_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        if (x > y) x = x + y - (y = x);
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
