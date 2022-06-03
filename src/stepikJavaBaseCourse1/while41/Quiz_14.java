package stepikJavaBaseCourse1.while41;

import java.util.Scanner;

class Quiz_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i, c = 0, s = 0;
        while ((i = sc.nextInt()) <= 10) {
            if (i < 0) break;
            else {
                c++;
                s += i;
            }
        }
        System.out.println(s / c);
    }
}
