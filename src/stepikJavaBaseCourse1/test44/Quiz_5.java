package stepikJavaBaseCourse1.test44;

import java.util.Scanner;

class Quiz_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Math.abs(sc.nextInt());
        int max = x % 10;
        while (x > 10) {
            if (x % 10 > max) max = x % 10;
            x /= 10;
        }
        System.out.println(max);
    }
}
