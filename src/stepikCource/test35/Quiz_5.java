package stepikCource.test35;

import java.util.Scanner;

class Quiz_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        System.out.println(
                (x > y) ? ">"
                : (x < y) ? "<"
                : "="
        );
    }
}
