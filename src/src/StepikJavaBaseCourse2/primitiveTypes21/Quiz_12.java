package src.StepikJavaBaseCourse2.primitiveTypes21;

import java.util.Scanner;

public class Quiz_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println(doubleExpression(a, b, c));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }
}
