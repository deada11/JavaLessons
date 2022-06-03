package src.StepikJavaBaseCourse2.primitiveTypes21;


import java.util.Scanner;

public class Quiz_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.print(leapYearCount(y));
    }


    public static int leapYearCount(int year) {
        return (year / 4 - year / 100) + year / 400;
    }
}


