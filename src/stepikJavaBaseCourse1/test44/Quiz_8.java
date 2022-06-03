package stepikJavaBaseCourse1.test44;

import java.util.Scanner;

class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        if (n == 1) {
            System.out.print("false");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            System.out.print(
                    (count > 2) ? "false" : "true"
            );
        }
    }
}
