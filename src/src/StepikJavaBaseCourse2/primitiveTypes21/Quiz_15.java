package src.StepikJavaBaseCourse2.primitiveTypes21;

import java.util.Scanner;

public class Quiz_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(flipBit(a, b));
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
