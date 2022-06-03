package stepikJavaBaseCourse1.test28;

import java.util.Scanner;
class Quiz_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int a = year / 400;
        int b = year / 4;
        int c = year / 100;
        System.out.println(a + b - c);
    }
}
