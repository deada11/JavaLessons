package src.StepikJavaBaseCourse2.controlStructures24;

import java.math.BigInteger;
import java.util.Scanner;

public class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int value) {
        BigInteger fact = BigInteger.valueOf(1), j = BigInteger.ONE;
        while (j.compareTo(BigInteger.valueOf(value)) < 1) {
            fact = fact.multiply(j);
            j = j.add(BigInteger.ONE);
        }
        return fact;
    }
}
