package stepikJavaBaseCourse1.test28;

import java.util.Scanner;
class Quiz_7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double summ = -1 * (b/a);
        double mult = c/a;
        System.out.println(summ + " " + mult);
        sc.close();
    }
}
