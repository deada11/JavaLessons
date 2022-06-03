package stepikJavaBaseCourse1.test35;

import java.util.Scanner;

class Quiz_7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        System.out.println(
                (x < 0 && x <= y && (y <= (2 - x*x))) || (x >= 0 && y >= 0 && (y <= (2 - x*x))) ? "Yes"
                : "No"
        );
    }
}
