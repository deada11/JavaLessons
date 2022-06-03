package stepikJavaBaseCourse1.math43;

import java.util.Scanner;

class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String format = "%." + n + "f";
        System.out.printf(format, Math.PI);
    }
}
