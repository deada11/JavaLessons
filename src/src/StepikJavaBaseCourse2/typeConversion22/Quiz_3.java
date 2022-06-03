package src.StepikJavaBaseCourse2.typeConversion22;

import java.util.Scanner;

public class Quiz_3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(charExpression(sc.nextInt()));
    }

    public static char charExpression (int a) {

        return (char) ((int) '\\' + a);

    }
}
