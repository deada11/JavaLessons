package src.StepikJavaBaseCourse2.typeConversion22;

import java.util.Scanner;

public class Quiz_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPowerOfTwoFromInteger(sc.nextInt()));
        System.out.println(isPowerOfTwoFromArithmetic(sc.nextInt()));
        sc.close();
    }

    public static boolean isPowerOfTwoFromInteger (int value) {
        return (Integer.bitCount(Math.abs(value)) == 1);
    }

    public static boolean isPowerOfTwoFromArithmetic (int value) {
        return (Math.abs(value) & Math.abs(value) - 1) == 0;
    }
}
