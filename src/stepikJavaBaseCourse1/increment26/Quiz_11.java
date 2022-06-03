package stepikJavaBaseCourse1.increment26;

import java.util.Scanner;
class Quiz_11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(
                --num + " " + ++num + " " + ++num
        );
    }
}
